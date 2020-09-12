package puzzles.cardsdeck;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class WarGame {

    private final Deck deck;
    private final Player player1;
    private final Player player2;
    private boolean player1Turn;
    private final List<Card> table;
    private final GameAssistant gameAssistant;
    private int counter;


    public WarGame() {
        deck = new Deck();
        player1 = new Player();
        player2 = new Player();
        player1Turn = true;
        table = new ArrayList<>();
        gameAssistant = new GameAssistant();
        counter = 0;

    }

    public static void main(String[] args) {
        WarGame game = new WarGame();
        game.begin();
    }

    private void begin() {
        gameAssistant.shuffle(deck);
        gameAssistant.distributeCards(deck, player1, player2);

        displayPlayersHands();
        play();
    }

    private void displayPlayersHands() {

        Scanner in = new Scanner(System.in);
        System.out.println("\nPlayer 1 hand: ");
        showPlayerCards(player1);
        System.out.println("\nPlayer 2 hand: ");
        showPlayerCards(player2);
        System.out.print("\nPress ENTER to begin: ");
        in.nextLine();
    }

    private void play() {

        while (true) {
            Card p1Card = takeCard(player1);
            Card p2Card = takeCard(player2);

            if (assessEndOfGame(p1Card, p2Card)) {
                break;
            }

            putCardsOnTable(p1Card, p2Card);

            if (compareCards(p1Card, p2Card)) {
                break;
            }
        }

    }

    private boolean compareCards(Card p1Card, Card p2Card) {

        if (p1Card.getRank().getHierarchy() > p2Card.getRank().getHierarchy()) {
            showFightingCards(p1Card, p2Card, "Player 1");
            passCardsToWinner(true, player1);

        } else if (p1Card.getRank().getHierarchy() < p2Card.getRank().getHierarchy()) {
            showFightingCards(p1Card, p2Card, "Player 2");
            passCardsToWinner(false, player2);

        } else {
            return war(p1Card, p2Card);

        }
        return false;
    }

    private void showFightingCards(Card p1Card, Card p2Card, String player) {
        StringBuilder builder = new StringBuilder();
        builder.append("Player 1 card: ").append(p1Card.toString()).append(" - against - Player 2 card: ").append(p2Card.toString()).append(" ----> The winner is: ").append(player);
        System.out.println(builder);
    }

    private boolean war(Card p1Card, Card p2Card) {
        showFightingCards(p1Card, p2Card, "WAR!");
        Card p1BlindCard = takeCard(player1);
        Card p2BlindCard = takeCard(player2);
        putCardsOnTable(p1BlindCard, p2BlindCard);

        return assessEndOfGame(p1BlindCard, p2BlindCard);
    }

    private void passCardsToWinner(boolean b, Player player1) {
        player1Turn = b;
        for (Card card : table) {
            player1.getHand().offerFirst(card);
        }
        table.clear();
    }

    private Card takeCard(Player player1) {
        return player1.getHand().pollLast();
    }

    private boolean assessEndOfGame(Card p1Card, Card p2Card) {
        if (p1Card == null) {
            System.out.println("Player 1 lost in " + counter + " turns. ");
            return true;
        }
        if (p2Card == null) {
            System.out.println("Player 2 lost in " + counter + " turns. ");
            return true;
        }
        return false;
    }

    private void putCardsOnTable(Card p1Card, Card p2Card) {
        if (player1Turn) {
            table.add(p1Card);
            table.add(p2Card);
        } else {
            table.add(p2Card);
            table.add(p1Card);
        }
        counter++;
    }


    private static void showPlayerCards(Player player) {

        for (var card : player.getHand()) {

            System.out.println(card.toString());
        }
    }
}