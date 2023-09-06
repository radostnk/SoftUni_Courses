package E_SetsAndMapsAdvanced;

import java.util.HashMap;
import java.util.Scanner;

public class Phonebook {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        HashMap<String, String> map = new HashMap<>();

        while (!input.equals("search")) {
            String name = input.split("-")[0];
            String number = input.split("-")[1];

            map.put(name, number);

            input = scan.nextLine();
        }

        input = scan.nextLine();

        while (!input.equals("stop")) {

            if (map.containsKey(input)) {
                System.out.printf("%s -> %s\n", input, map.get(input));
            } else {
                System.out.printf("Contact %s does not exist.\n", input);
            }

            input = scan.nextLine();
        }
    }
}
