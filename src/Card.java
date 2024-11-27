public class Card {
    private final Rank rank;

    private final Suit suit;
    public Card(Rank rank,Suit suit) {
        this.rank = rank;
        this.suit = suit;
    }

    @Override
    public String toString() {
        return rank.getSymbol() + suit.getSymbol();
    }

    public boolean isHigherThan(Card other){
        return this.rank.ordinal() > other.rank.ordinal();
    }
}
