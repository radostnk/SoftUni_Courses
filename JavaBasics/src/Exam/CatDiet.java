package Exam;

import java.util.Scanner;

public class CatDiet {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int fatPercentage = Integer.parseInt(scan.nextLine());
        int proteinPercentage = Integer.parseInt(scan.nextLine());
        int carbsPercentage = Integer.parseInt(scan.nextLine());
        int totalCalories = Integer.parseInt(scan.nextLine());
        int waterPercentage = Integer.parseInt(scan.nextLine());

        double fats = fatPercentage * 1.0 / 100 * totalCalories / 9;
        double proteins = proteinPercentage * 1.0 / 100 * totalCalories / 4;
        double carbs = carbsPercentage * 1.0 / 100 * totalCalories / 4;
        double foodWeight = fats + proteins + carbs;
        double caloriesPerGr = totalCalories / foodWeight;

        double nonWaterPercentage = 100 - waterPercentage;
        double totalCals = nonWaterPercentage / 100 * caloriesPerGr;

        System.out.printf("%.4f", totalCals);
    }
}
