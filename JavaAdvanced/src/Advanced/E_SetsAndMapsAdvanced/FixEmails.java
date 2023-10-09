package Advanced.E_SetsAndMapsAdvanced;

import java.util.LinkedHashMap;
import java.util.Scanner;

public class FixEmails {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        LinkedHashMap<String, String> map = new LinkedHashMap<>();

        while (!input.equals("stop")) {
            String email = scan.nextLine();

            if (!(email.contains(".com") || email.contains(".uk") || email.contains(".us"))) {
                map.put(input, email);
            }

            input = scan.nextLine();
        }

        map.forEach((key, value) -> System.out.printf("%s -> %s\n", key, value));
    }
}
