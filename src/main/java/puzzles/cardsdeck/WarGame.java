package puzzles.cardsdeck;

import java.util.Random;

public class WarGame {

    public static void main(String[] args) {
        Deck deck = new Deck();
        shuffle(deck);
        displayDeck(deck);

    }

    private static void play(Deck deck){

        Player player1 = new Player();
        Player player2 = new Player();
        distributeCards(deck, player1, player2);

    }

    private static void distributeCards(Deck deck, Player player1, Player player2) {
        for (int i = 0; i < deck.getCards().length; i++) {

            if (i % 2 == 0){

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


    public static void shuffle(Deck deck) {
        final Random random = new Random();
        Card[] cards = deck.getCards();

        Card[] cards1 = deck.getCards();

        for (int i = 0; i < 777; i++) {

            int firstRnd = random.nextInt(52);
            int secondRnd = random.nextInt(52);

            final Card tempCard = cards[firstRnd];
            cards[firstRnd] = cards[secondRnd];
            cards[secondRnd] = tempCard;

        }


    }

}
