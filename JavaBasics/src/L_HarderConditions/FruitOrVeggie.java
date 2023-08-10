package L_HarderConditions;

import java.util.Scanner;

public class FruitOrVeggie {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String food = scan.nextLine();
        String type = "";

        switch (food) {
            case "banana":
            case "apple":
            case "kiwi":
            case "cherry":
            case "lemon":
            case "grapes":
                type = "fruit";
                break;

            case "tomato":
            case "cucumber":
            case "pepper":
            case "carrot":
                type = "vegetable";
                break;

            default:
                type = "unknown";
                break;
        }
        System.out.println(type);
    }
}
