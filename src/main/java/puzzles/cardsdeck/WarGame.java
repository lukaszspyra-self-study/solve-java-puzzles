package puzzles.cardsdeck;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class WarGame {

    private final Deck deck;
    private final Player player1;
    private final Player player2;
    private boolean player1Turn;
    private List<Card> table;

    public WarGame() {
        deck = new Deck();
        player1 = new Player();
        player2 = new Player();
        player1Turn = true;
        table = new ArrayList<>();
    }

    public static void main(String[] args) {
        WarGame game = new WarGame();
        game.begin();

        showPlayersCards(game.player1);
        System.out.println("\n\n\n\n");
        showPlayersCards(game.player2);
    }

    private void begin() {
        shuffle(deck);
        distributeCards(deck, player1, player2);
        play();
    }

    private void play() {

        while (true) {
            Card p1Card = takeCard(player1);
            Card p2Card = takeCard(player2);

            if (assessEndOfGame(p1Card, p2Card)) {
                break;
            }

            putCardsOnTable(p1Card, p2Card);

            if (compareCards(p1Card, p2Card)) break;

        }
    }

    private boolean compareCards(Card p1Card, Card p2Card) {

        if (p1Card.getRank().getHierarchy() > p2Card.getRank().getHierarchy()) {
            passCardsToWinner(true, player1);

        } else if (p1Card.getRank().getHierarchy() < p2Card.getRank().getHierarchy()) {
            passCardsToWinner(false, player2);

        } else {
            Card p1BlindCard = takeCard(player1);
            Card p2BlindCard = takeCard(player2);

            if (assessEndOfGame(p1BlindCard, p2BlindCard)) {
                return true;
            }
            putCardsOnTable(p1Card, p2Card);

        }
        return false;
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
            //player1 lost
            return true;
        }
        //player2 lost
        return p2Card == null;
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

    private void distributeCards(Deck deck, Player player1, Player player2) {
        for (int i = 0; i < deck.getCards().length; i++) {

            if (i % 2 == 0) {

                player1.getHand().add(deck.getCards()[i]);

            } else {

                player2.getHand().add(deck.getCards()[i]);
            }
        }
    }

    private static void displayDeck(Deck deck) {
        for (int i = 0; i < deck.getCards().length; i++) {

            System.out.println(deck.getCards()[i].toString());

        }
    }

    public void shuffle(Deck deck) {
        final Random random = new Random();
        Card[] cards = deck.getCards();

        for (int i = 0; i < 777; i++) {

            int firstRnd = random.nextInt(52);
            int secondRnd = random.nextInt(52);

            final Card tempCard = cards[firstRnd];
            cards[firstRnd] = cards[secondRnd];
            cards[secondRnd] = tempCard;

        }
    }
}
