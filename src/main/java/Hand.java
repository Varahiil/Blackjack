import java.util.List;

public abstract class Hand {
    protected List<Card> hand;

    public abstract void play(Deck deck);

    public void takeCard(Deck deck){
        hand.add(deck.giveCard());
    }
    public int getScore() {
        int score = 0;
        for(Card card : hand){
            score += card.getScore();
        }
        return score;
    }

    @Override
    public String toString() {
        StringBuilder s = null;
        for (Card card : hand) {
            s.append(card.toString());
        }
        return s.toString();
    }
}
