package L_FinalExamPreparation;

import java.util.Scanner;

public class ActivationKeys {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String inputKey = scan.nextLine();
        String input = scan.nextLine();

        while (!input.equals("Generate")) {
            String command = input.split(">>>")[0];

            if (command.equals("Contains")) {

                String substring = input.split(">>>")[1];
                if (inputKey.contains(substring)) {
                    System.out.printf("%s contains %s\n", inputKey, substring);
                } else {
                    System.out.println("Substring not found!");
                }

            } else if (command.equals("Flip")) {

                String caseDesired = input.split(">>>")[1];
                int startIndex = Integer.parseInt(input.split(">>>")[2]);
                int endIndex = Integer.parseInt(input.split(">>>")[3]);
                String oldSubstring = inputKey.substring(startIndex, endIndex);

                if (caseDesired.equals("Upper")) {
                    String newSubstring = oldSubstring.toUpperCase();
                    inputKey = inputKey.replace(oldSubstring, newSubstring);

                } else if (caseDesired.equals("Lower")) {
                    String newSubstring = oldSubstring.toLowerCase();
                    inputKey = inputKey.replace(oldSubstring, newSubstring);
                }

                System.out.println(inputKey);

            } else if (command.equals("Slice")) {

                int startIndex = Integer.parseInt(input.split(">>>")[1]);
                int endIndex = Integer.parseInt(input.split(">>>")[2]);
                String toDelete = inputKey.substring(startIndex, endIndex);
                inputKey = inputKey.replace(toDelete, "");
                System.out.println(inputKey);
            }

            input = scan.nextLine();
        }
        System.out.println("Your activation key is: " + inputKey);
    }
}