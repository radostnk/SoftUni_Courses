package E_DefiningClasses.RawData;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        List<Car> cars = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String[] carInfo = scan.nextLine().split("\\s+");
            String model = carInfo[0];
            int engineSpeed = Integer.parseInt(carInfo[1]);
            int enginePower = Integer.parseInt(carInfo[2]);
            int cargoWeight = Integer.parseInt(carInfo[3]);
            String cargoType = carInfo[4];

            List<Tyre> tyres = new ArrayList<>();

            for (int j = 5; j < 13; j+=2) {
                double tyrePressure = Double.parseDouble(carInfo[j]);
                int tyreAge = Integer.parseInt(carInfo[j+1]);
                Tyre tyre = new Tyre(tyrePressure, tyreAge);
                tyres.add(tyre);
            }

            Engine engine = new Engine(engineSpeed, enginePower);
            Cargo cargo = new Cargo(cargoWeight, cargoType);
            Car car = new Car(model, engine, cargo, tyres);
            cars.add(car);
        }

        String cargoType = scan.nextLine();

        if (cargoType.equals("fragile")) {
            //print all cars whose Cargo Type is "fragile" with a tire whose pressure is < 1
            Predicate<Car> filterByFragileCargo = car -> car.getCargo().getCargoType().equals("fragile");
            Predicate<Tyre> filterLowPressureTyres = tyre -> tyre.getTyrePressure() < 1;

            cars.stream()
                    .filter(filterByFragileCargo)
                    .filter(car -> car.getTyres().stream().anyMatch(filterLowPressureTyres))
                    .forEach(car -> System.out.println(car.getModel()));

        } else if (cargoType.equals("flamable")) {
            //print all cars whose Cargo Type is "flamable" and have Engine Power > 250
            Predicate<Car> filterByFlamableCargo = car -> car.getCargo().getCargoType().equals("flamable");
            Predicate<Car> filterByPowerfulEngines = car -> car.getEngine().getEnginePower() > 250;

            cars.stream()
                    .filter(filterByFlamableCargo)
                    .filter(filterByPowerfulEngines)
                    .forEach(car -> System.out.println(car.getModel()));
        }
    }
}