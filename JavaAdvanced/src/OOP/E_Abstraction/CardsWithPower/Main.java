package OOP.E_Abstraction.CardsWithPower;

import OOP.E_Abstraction.CardRank.CardRank;
import OOP.E_Abstraction.CardSuite.CardSuite;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String cardRank = scan.nextLine();
        String cardSuite = scan.nextLine();
        Card card = new Card(CardRank.valueOf(cardRank), CardSuite.valueOf(cardSuite));
        System.out.println(card.toString());
    }
}
