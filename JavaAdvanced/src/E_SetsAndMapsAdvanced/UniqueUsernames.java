package E_SetsAndMapsAdvanced;

import java.util.LinkedHashSet;
import java.util.Scanner;

public class UniqueUsernames {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        LinkedHashSet<String> set = new LinkedHashSet<>();
        int n = Integer.parseInt(scan.nextLine());

        for (int i = 0; i < n; i++) {
            String curInput = scan.nextLine();
            set.add(curInput);
        }
        set.forEach(System.out::println);
    }
}
