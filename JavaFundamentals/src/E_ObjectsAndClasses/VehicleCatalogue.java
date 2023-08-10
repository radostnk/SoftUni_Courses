package E_ObjectsAndClasses;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class VehicleCatalogue {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String command = scan.nextLine();

        List<Vehicle> vehicles = new ArrayList<>();

        while (!command.equals("End")) {
            String type = command.split(" ")[0];
            String model = command.split(" ")[1];
            String color = command.split(" ")[2];
            int horsepower = Integer.parseInt(command.split(" ")[3]);

            Vehicle vehicle = new Vehicle(type, model, color, horsepower);
            vehicles.add(vehicle);

            command = scan.nextLine();
        }

        List<String> modelsList = new ArrayList<>();
        command = scan.nextLine();

        while (!command.equals("Close the Catalogue")) {
            modelsList.add(command);
            command = scan.nextLine();
        }

        for (int i = 0; i < modelsList.size(); i++) {
            String curModel = modelsList.get(i);

            for (int j = 0; j < vehicles.size(); j++) {
                Vehicle curVehicle = vehicles.get(j);
                if (curModel.equals(curVehicle.getModel())) {
                    if (curVehicle.getType().equals("car")) {
                        System.out.printf("Type: Car\nModel: %s\nColor: %s\nHorsepower: %d\n", curVehicle.getModel(), curVehicle.getColor(), curVehicle.getHorsepower());
                    } else if (curVehicle.getType().equals("truck")) {
                        System.out.printf("Type: Truck\nModel: %s\nColor: %s\nHorsepower: %d\n", curVehicle.getModel(), curVehicle.getColor(), curVehicle.getHorsepower());
                    }
                }
            }
        }

        double totalCarsHorsepower = 0;
        double totalTrucksHorsepower = 0;
        int carsCount = 0;
        int trucksCount = 0;

        for (Vehicle vehicle : vehicles) {

            if (vehicle.getType().equals("car")) {
                carsCount ++;
                totalCarsHorsepower += vehicle.getHorsepower();

            } else if (vehicle.getType().equals("truck")) {
                trucksCount ++;
                totalTrucksHorsepower += vehicle.getHorsepower();
            }
        }

        double averageCarsPower = totalCarsHorsepower/carsCount;
        double averageTrucksPower = totalTrucksHorsepower/trucksCount;

        if (totalTrucksHorsepower == 0) {
            averageTrucksPower = 0;
        }

        if (totalCarsHorsepower == 0) {
            averageCarsPower = 0;
        }
        System.out.printf("Cars have average horsepower of: %.2f.\n", averageCarsPower);
        System.out.printf("Trucks have average horsepower of: %.2f.\n", averageTrucksPower);
    }

    public static class Vehicle {
        private String type;
        private String model;
        private String color;
        private int horsepower;

        public Vehicle(String type, String model, String color, int horsepower) {
            this.type = type;
            this.model = model;
            this.color = color;
            this.horsepower = horsepower;
        }

        public String getType() {
            return type;
        }

        public String getModel() {
            return model;
        }

        public String getColor() {
            return color;
        }

        public int getHorsepower() {
            return horsepower;
        }
    }
}
