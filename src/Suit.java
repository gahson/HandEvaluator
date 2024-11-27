public enum Suit {
    HEARTS("♥"),
    DIAMONDS("♦"),
    CLUBS("♣"),
    SPADES("♠");

    private final String symbol;  // Pole przechowujące symbol

    // Konstruktor dla `enum`
    Suit(String symbol) {
        this.symbol = symbol;
    }

    // Getter dla symbolu
    public String getSymbol() {
        return symbol;
    }
}
