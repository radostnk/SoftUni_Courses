package OOP.E_Abstraction.CardRank;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Card Ranks:");
        Arrays.stream(CardRank.values()).forEach(value -> System.out.println(value.toString()));
    }
}
