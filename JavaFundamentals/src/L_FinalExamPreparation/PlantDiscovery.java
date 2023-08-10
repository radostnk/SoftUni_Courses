package L_FinalExamPreparation;

import java.util.*;


public class PlantDiscovery {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        HashMap<String, Integer> flowersRarity = new HashMap<>();
        HashMap<String, Double> flowersRating = new HashMap<>();

        for (int i = 0; i < n; i++) {
            String[] input = scan.nextLine().split("<->");
            flowersRarity.put(input[0], Integer.parseInt(input[1]));
            flowersRating.put(input[0], 0.0);
        }

        String input = scan.nextLine();

        while (!input.equals("Exhibition")) {
            String command = input.split("[: -]+")[0];
            String plant = input.split("[: -]+")[1];

            boolean isValidCommand = command.equals("Rate") || command.equals("Update") || command.equals("Reset");

            if (!isValidCommand || !flowersRating.containsKey(plant)) {
                System.out.println("error");
                input = scan.nextLine();
            } else {

                if (command.equals("Rate")) {
                    double newRating = Double.parseDouble(input.split("[: -]+")[2]);

                    if (flowersRating.get(plant) == 0.0) {
                        flowersRating.put(plant, newRating);
                    } else {
                        double oldRating = flowersRating.get(plant);
                        double totalRating = (oldRating + newRating) / 2;
                        flowersRating.put(plant, totalRating);
                    }

                } else if (command.equals("Update")) {
                    int newRarity = Integer.parseInt(input.split("[: -]+")[2]);
                    flowersRarity.put(plant, newRarity);

                } else if (command.equals("Reset")) {
                    flowersRating.put(plant, 0.0);

                }

                input = scan.nextLine();
            }
        }

        System.out.println("Plants for the exhibition:");
        flowersRarity.forEach((key, value) -> System.out.printf("- %s; Rarity: %d; Rating: %.2f\n", key, value, flowersRating.get(key)));

    }
}