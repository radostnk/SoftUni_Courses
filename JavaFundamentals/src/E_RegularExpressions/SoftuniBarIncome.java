package E_RegularExpressions;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SoftuniBarIncome {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String input = scan.nextLine();
        String regEx = "%(?<customer>[A-Z][a-z]+)%[^|$%.]*<(?<product>\\w+)>[^|$%.]*\\|(?<count>\\d+)\\|[^|$%.]*?(?<price>\\d+\\.?\\d*)\\$";
        Pattern pattern = Pattern.compile(regEx);
        LinkedHashMap<String, LinkedHashMap<String, Double>> outputMap = new LinkedHashMap<>();
        double totalIncome = 0;

        while (!input.equals("end of shift")) {
            Matcher match = pattern.matcher(input);

            if (match.find()) {
                String curCustomer = match.group("customer");
                String curProduct = match.group("product");
                int curCount = Integer.parseInt(match.group("count"));
                double curPrice = Double.parseDouble(match.group("price"));
                double totalPrice = curCount * curPrice;

                outputMap.put(curCustomer, new LinkedHashMap<>());
                outputMap.get(curCustomer).put(curProduct, totalPrice);
                totalIncome += totalPrice;
            }

            input = scan.nextLine();
        }

        outputMap.forEach((customer, productMap) -> {
                System.out.printf("%s: ", customer);
                productMap.forEach((product, price) ->
                System.out.printf("%s - %.2f\n", product, price));
        });

        System.out.printf("Total income: %.2f", totalIncome);
    }

    /*  works better in judge
        public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String regex = "%(?<customerName>[A-Z][a-z]+)%[^\\|$%\\.]*<(?<product>\\w+)>[^\\|\\$%\\.]*\\|(?<count>[0-9]+)\\|[^\\|\\$%\\.]*?(?<price>[0-9]+\\.?[0-9]*)\\$";
        Pattern pattern = Pattern.compile(regex); //шаблон

        double totalIncome = 0; //приход от всички поръчки

        String input = scanner.nextLine(); //входни данни
        while (!input.equals("end of shift")) {
            //входни данни представляват поръчка
            //input = "%George%<Croissant>|2|10.3$"
            Matcher matcher = pattern.matcher(input);

            if (matcher.find()) {
                //валидна поръчка
                //matcher = "%(?<customerName>George)%<(?<product>Croissant)>|(?<count>2)|(?<price>10.3)$"
                String customerName = matcher.group("customerName"); //"George"
                String product = matcher.group("product"); //"Croissant"
                int count = Integer.parseInt(matcher.group("count")); //"2" -> parse -> 2
                double price = Double.parseDouble(matcher.group("price")); //"10.3" -> parse -> 10.3

                double totalPricePerOrder = count * price; //цена за текушата поръчка
                totalIncome += totalPricePerOrder;
                System.out.printf("%s: %s - %.2f%n", customerName, product, totalPricePerOrder);
            }
            input = scanner.nextLine();
        }

        System.out.printf("Total income: %.2f", totalIncome);
    }*/
}