package E_AssociativeArrays;

import java.util.LinkedHashMap;
import java.util.Scanner;

public class SoftuniParking {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        LinkedHashMap<String, String> parkingMap = new LinkedHashMap<>();

        for (int i = 1; i <= n; i++) {
            String[] input = scan.nextLine().split(" ");
            String command = input[0];

            switch (command) {

                case "register":
                    String regName = input[1];
                    String number = input[2];

                    if (parkingMap.containsKey(regName)) {
                        System.out.println("ERROR: already registered with plate number " + parkingMap.get(regName));
                    } else {
                        parkingMap.put(regName, number);
                        System.out.printf("%s registered %s successfully\n", regName, number);
                    }

                    break;

                case "unregister":
                    String unregName = input[1];

                    if (!parkingMap.containsKey(unregName)) {
                        System.out.printf("ERROR: user %s not found\n", unregName);
                    } else {
                        parkingMap.remove(unregName);
                        System.out.printf("%s unregistered successfully\n", unregName);
                    }

                    break;
            }
        }

        parkingMap.forEach((key, value) -> System.out.println(key + " => " + value));
    }
}
