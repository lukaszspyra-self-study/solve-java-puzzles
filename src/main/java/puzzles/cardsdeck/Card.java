package puzzles.cardsdeck;

public class Card {
    private final Rank rank;
    private final Suit suit;


    public Card(Rank rank, Suit suit) {
        assert isValidRank(rank);
        assert isValidSuit(suit);
        this.rank = rank;
        this.suit = suit;
    }

    public Suit getSuit() {
        return suit;
    }

    public Rank getRank() {
        return rank;
    }

    public static boolean isValidRank(Rank rank) {

        for (Rank r : Rank.values()){
            if (r.equals(rank)){
                return true;
            }
        }

        return false;
    }

    public static boolean isValidSuit(Suit suit) {

        for (Suit s : Suit.values()){
            if (s.equals(suit)){
                return true;
            }
        }

        return false;
    }

    @Override
    public String toString() {
        return "{" +
                "rank=" + rank +
                ", suit=" + suit +
                '}';
    }
}