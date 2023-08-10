package L_HarderConditions;

import java.util.Scanner;

public class FruitShop {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String fruit = scan.nextLine();
        String weekday = scan.nextLine();
        double fruitQuantity = Double.parseDouble(scan.nextLine());
        double mySum = 0;
        boolean hasError = false;

        switch(weekday) {
            case "Monday":
            case "Tuesday":
            case "Wednesday":
            case "Thursday":
            case "Friday":
                switch(fruit) {
                    case "banana":
                        mySum = fruitQuantity * 2.5;
                        break;
                    case "apple":
                        mySum = fruitQuantity * 1.2;
                        break;
                    case "orange":
                        mySum = fruitQuantity * 0.85;
                        break;
                    case "grapefruit":
                        mySum = fruitQuantity * 1.45;
                        break;
                    case "kiwi":
                        mySum = fruitQuantity * 2.7;
                        break;
                    case "pineapple":
                        mySum = fruitQuantity * 5.5;
                        break;
                    case "grapes":
                        mySum = fruitQuantity * 3.85;
                        break;
                    default:
                        hasError = true;
                }
                break;
            case "Saturday":
            case "Sunday":
                switch(fruit) {
                    case "banana":
                        mySum = fruitQuantity * 2.7;
                        break;
                    case "apple":
                        mySum = fruitQuantity * 1.25;
                        break;
                    case "orange":
                        mySum = fruitQuantity * 0.9;
                        break;
                    case "grapefruit":
                        mySum = fruitQuantity * 1.6;
                        break;
                    case "kiwi":
                        mySum = fruitQuantity * 3;
                        break;
                    case "pineapple":
                        mySum = fruitQuantity * 5.6;
                        break;
                    case "grapes":
                        mySum = fruitQuantity * 4.2;
                        break;
                    default:
                        hasError = true;
                }
                break;
            default:
                hasError = true;
        }


        if (hasError) {
            System.out.println("error");
        } else {
            System.out.printf("%.2f", mySum);
        }
    }
}
