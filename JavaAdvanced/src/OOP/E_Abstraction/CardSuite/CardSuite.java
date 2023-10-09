package OOP.E_Abstraction.CardSuite;

public enum CardSuite {
    CLUBS(0),
    DIAMONDS(13),
    HEARTS(26),
    SPADES(39);

    private int suitePower;

    CardSuite(int suitePower) {
        this.suitePower = suitePower;
    }

    @Override
    public String toString() {
        return String.format("Ordinal value: %d; Name value: %s", this.ordinal(), this.name());
    }

    public int getSuitePower() {
        return suitePower;
    }

    public void setSuitePower(int suitePower) {
        this.suitePower = suitePower;
    }
}
