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


    public WarGame() {
        deck = new Deck();
        player1 = new Player();
        player2 = new Player();
        player1Turn = true;
        table = new ArrayList<>();
        gameAssistant = new GameAssistant();

    }

    public static void main(String[] args) {
        WarGame game = new WarGame();
        game.begin();

        showPlayersCards(game.player1);

        showPlayersCards(game.player2);
    }

    private void begin() {
        gameAssistant.shuffle(deck);
        gameAssistant.distributeCards(deck, player1, player2);

        displayPlayersHands();
        play();
    }

    private void displayPlayersHands() {
        Scanner in = new Scanner(System.in);
        System.out.println("Player 1 hand: ");
        showPlayersCards(player1);
        System.out.println("\n\n");
        System.out.println("Player 2 hand: ");
        showPlayersCards(player2);
        System.out.print("Press ENTER to begin: ");
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

            if (compareCards(p1Card, p2Card)){
                break;
            }
        }

    }

    private boolean compareCards(Card p1Card, Card p2Card) {

        if (p1Card.getRank().getHierarchy() > p2Card.getRank().getHierarchy()) {
            passCardsToWinner(true, player1);

        } else if (p1Card.getRank().getHierarchy() < p2Card.getRank().getHierarchy()) {
            passCardsToWinner(false, player2);

        } else {
            return war();

        }
        return false;
    }

    private boolean war() {

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
        return player1.getHand().peekLast();
    }

    private boolean assessEndOfGame(Card p1Card, Card p2Card) {
        if (p1Card == null) {
            System.out.println("Player 1 lost");
            return true;
        }
        if (p2Card == null) {
            System.out.println("Player 2 lost");
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
    }


    private static void showPlayersCards(Player player) {

        for (var card : player.getHand()) {

            System.out.println(card.toString());
        }
    }
}