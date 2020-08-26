package puzzles.cardsdeck;

public class DisplayDeck {

    public static void main(String[] args) {

        Deck deck = new Deck();

        for (int i = 0; i < deck.getCards().length; i++) {

            System.out.println(deck.getCards()[i].toString());

        }

    }
}
