package OOP.E_Abstraction.CardsWithPower;

import OOP.E_Abstraction.CardRank.CardRank;
import OOP.E_Abstraction.CardSuite.CardSuite;

public class Card {
    private CardRank rank;
    private CardSuite suite;

    public Card(CardRank rank, CardSuite suite) {
        this.rank = rank;
        this.suite = suite;
    }

    public int getCardPower() {
        return this.rank.getRankPower() + this.suite.getSuitePower();
    }

    @Override
    public String toString() {
        return String.format("Card name: %s of %s; Card power: %d", this.rank.name(), this.suite.name(), this.getCardPower());
    }
}
