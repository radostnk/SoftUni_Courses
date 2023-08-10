package L_ArrayList;

import java.util.*;
import java.util.stream.Collectors;

public class ListOfProducts {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());
        List<String> productsList = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            String product = scan.nextLine();
            productsList.add(product);
        }

        Collections.sort(productsList);

        for (int i = 0; i < productsList.size(); i++) {
            System.out.printf("%d.%s\n", i + 1, productsList.get(i));
        }
    }
}
