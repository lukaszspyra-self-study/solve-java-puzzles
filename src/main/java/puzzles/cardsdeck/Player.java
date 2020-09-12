package puzzles.cardsdeck;

import java.util.ArrayDeque;
import java.util.Deque;

public class Player {

    private Deque<Card> hand = new ArrayDeque<>();

    public Deque<Card> getHand() {
        return hand;
    }

    public void setHand(Deque<Card> hand) {
        this.hand = hand;
    }
}
