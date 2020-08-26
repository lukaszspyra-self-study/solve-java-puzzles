package puzzles.cardsdeck;

public class Deck {

    private Card[] cards;

    public Deck() {
        cards = new Card[Suit.values().length * Rank.values().length];
        int i = 0;

        for (Suit s : Suit.values()){

            for (Rank r : Rank.values()){

                cards[i] = new Card(r, s);
                i++;

            }

        }

    }

    public Card[] getCards() {
        return cards;
    }


}