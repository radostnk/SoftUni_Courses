package E_AssociativeArrays;

import java.util.LinkedHashMap;
import java.util.Scanner;

public class MinerTask {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String command = scan.nextLine();
        LinkedHashMap<String, Integer> goodsMap = new LinkedHashMap<>();

        while (!command.equals("stop")) {
            String curKey = command;
            int curValue = Integer.parseInt(scan.nextLine());

            if (goodsMap.containsKey(curKey)) {
                   goodsMap.put(curKey, goodsMap.get(curKey) + curValue);
            } else {
                goodsMap.put(curKey, curValue);
            }

            command = scan.nextLine();
        }

        goodsMap.forEach((key,value) -> System.out.println(key + " -> " + value));
    }
}
