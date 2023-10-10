package OOP.E_Abstraction.TrafficLights;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] signals = scan.nextLine().split(" ");

        ArrayList<TrafficLight> trafficLights = new ArrayList<>();

        for (String signal : signals) {
            Color currentColor = Color.valueOf(signal);
            TrafficLight trafficLight = new TrafficLight(currentColor);
            trafficLights.add(trafficLight);
        }
        int n = Integer.parseInt(scan.nextLine());

        for (int i = 0; i < n; i++) {
            for (TrafficLight curTrLight : trafficLights) {
                curTrLight.changeColor();
                System.out.print(curTrLight.getCurrentColor() + " ");
            }
            System.out.println();
        }
    }
}
