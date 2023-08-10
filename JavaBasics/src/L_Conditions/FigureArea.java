package L_Conditions;

import java.text.DecimalFormat;
import java.util.Scanner;

public class FigureArea {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String figure = scan.nextLine();
        double a = Double.parseDouble(scan.nextLine());
        double area = 0;
        DecimalFormat df = new DecimalFormat("#.###");

        switch (figure) {
            case "square":
                area = a * a;
                break;
            case "rectangle":
                double b = Double.parseDouble(scan.nextLine());
                area = a * b;
                break;
            case "circle":
                area = Math.PI * Math.pow(a,2);
                break;
            case "triangle":
                double h = Double.parseDouble(scan.nextLine());
                area = a*h/2;
                break;
        }
        System.out.println(df.format(area));
    }
}
