package OOP.E_Polymorphism.VehiclesExtension;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] carInfo = scan.nextLine().split(" ");
        String[] truckInfo = scan.nextLine().split(" ");
        String[] busInfo = scan.nextLine().split(" ");

        Car car = new Car(Double.parseDouble(carInfo[1]),
                Double.parseDouble(carInfo[2]), Integer.parseInt(carInfo[3]));

        Truck truck = new Truck(Double.parseDouble(truckInfo[1]),
                Double.parseDouble(truckInfo[2]), Integer.parseInt(truckInfo[3]));

        Bus bus = new Bus(Double.parseDouble(busInfo[1]),
                Double.parseDouble(busInfo[2]), Integer.parseInt(busInfo[3]));

        int n = Integer.parseInt(scan.nextLine());

        for (int i = 0; i < n; i++) {
            String[] command = scan.nextLine().split(" ");

            switch (command[0]) {

                case "DriveEmpty":
                    bus.setEmpty(true);
                    double kmEmpty = Double.parseDouble(command[2]);
                    System.out.println(bus.drive(kmEmpty));

                    break;

                case "Drive":
                    double km = Double.parseDouble(command[2]);

                    if (command[1].equals("Car")) {
                        System.out.println(car.drive(km));

                    } else if (command[1].equals("Truck")) {
                        System.out.println(truck.drive(km));

                    } else if (command[1].equals("Bus")) {
                        bus.setEmpty(false);
                        System.out.println(bus.drive(km));
                    }

                    break;

                case "Refuel":
                    double fuel = Double.parseDouble(command[2]);

                    try {
                        if (command[1].equals("Car")) {
                            car.refuel(fuel);

                        } else if (command[1].equals("Truck")) {
                            truck.refuel(fuel);

                        } else if (command[1].equals("Bus")) {
                            bus.refuel(fuel);
                        }

                    } catch (IllegalArgumentException e) {
                        System.out.println(e.getMessage());
                    }

                    break;
            }
        }

        System.out.println(car.toString());
        System.out.println(truck.toString());
        System.out.println(bus.toString());
    }
}
