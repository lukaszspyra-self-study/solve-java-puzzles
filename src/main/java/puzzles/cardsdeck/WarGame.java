package puzzles.cardsdeck;

import java.util.Random;

public class WarGame {

    private Deck deck;
    private Player player1;
    private Player player2;


    public static void main(String[] args) {
        WarGame game = new WarGame();
        game.play();

        showPlayersCards(game.player1);
        System.out.println("\n\n\n\n");
        showPlayersCards(game.player2);

    }

    private void play() {
        deck = new Deck();
        player1 = new Player();
        player2 = new Player();
        shuffle(deck);
        distributeCards(deck, player1, player2);
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
