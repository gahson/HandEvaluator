public enum Rank {

    ONE("1"),
    TWO("2"),
    THREE("3"),
    FOUR("4"),
    FIVE("5"),
    SIX("6"),
    SEVEN("7"),
    EIGHT("8"),
    NINE("9"),
    TEN("10"),
    JACK("J"),
    QUEEN("Q"),
    KING("K"),
    ACE("A");

    private final String symbol;  // Pole przechowujące symbol

    // Konstruktor dla `enum`
    Rank(String symbol) {
        this.symbol = symbol;
    }

    // Getter dla symbolu
    public String getSymbol() {
        return symbol;
    }
    //dla porownania

}
