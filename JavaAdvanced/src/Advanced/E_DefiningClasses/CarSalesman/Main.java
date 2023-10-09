package Advanced.E_DefiningClasses.CarSalesman;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        ArrayList<Car> cars = new ArrayList<>();
        HashMap<String,Engine> engineModels = new HashMap<>();

        for (int i = 0; i < n; i++) {
            String[] data = scan.nextLine().split("\\s+");

            String model = data[0];
            int power = Integer.parseInt(data[1]);
            Engine engine = null;

            switch (data.length) {
                case 2:
                    engine = new Engine(model, power);
                    break;

                case 4:
                    int displacement = Integer.parseInt(data[2]);
                    String efficiency = data[3];
                    engine = new Engine(model, power, displacement, efficiency);
                    break;

                case 3:
                    if (Character.isDigit(data[2].charAt(0))) {
                        displacement = Integer.parseInt(data[2]);
                        engine = new Engine(model, power, displacement);
                    } else {
                        efficiency = data[2];
                        engine = new Engine(model, power, efficiency);
                    }
                    break;
            }
            engineModels.put(model, engine);
        }

        int m = Integer.parseInt(scan.nextLine());

        for (int i = 0; i < m; i++) {
            String[] data = scan.nextLine().split("\\s+");

            String model = data[0];
            String engineModel = data[1];
            Engine engineToUse = engineModels.get(engineModel);

            Car car = null;

            switch (data.length) {
                case 2:
                    car = new Car(model, engineToUse);
                    break;

                case 4:
                    int weight = Integer.parseInt(data[2]);
                    String color = data[3];
                    car = new Car(model, engineToUse, weight, color);
                    break;

                case 3:
                    if (Character.isDigit(data[2].charAt(0))) {
                        weight = Integer.parseInt(data[2]);
                        car = new Car(model, engineToUse, weight);

                    } else {
                        color = data[2];
                        car = new Car(model, engineToUse, color);
                    }
                    break;
            }
            cars.add(car);
        }

        cars.forEach(car -> System.out.println(car.toString()));
    }
}
