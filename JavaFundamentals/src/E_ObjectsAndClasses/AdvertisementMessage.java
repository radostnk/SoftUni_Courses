package E_ObjectsAndClasses;

import java.util.Random;
import java.util.Scanner;

public class AdvertisementMessage {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());

        Advertisement add = new Advertisement();

        for (int i = 1; i <= n; i++) {
            System.out.println(add.generateAdd());
        }
    }

    public static class Advertisement{
        private String[] phrase = {"Excellent product.",
                "Such a great product.",
                "I always use that product.",
                "Best product of its category.",
                "Exceptional product.",
                "I can’t live without this product."};
        private String[] event = {"Now I feel good.",
                "I have succeeded with this product.",
                "Makes miracles. I am happy of the results!",
                "I cannot believe but now I feel awesome.",
                "Try it yourself, I am very satisfied.",
                "I feel great!"};
        private String[] person = {"Diana",
                "Petya",
                "Stella",
                "Elena",
                "Katya",
                "Iva",
                "Annie",
                "Eva",
        };
        private String[] city = {"Burgas",
                "Sofia",
                "Plovdiv",
                "Varna",
                "Ruse"};

        Random rand = new Random();

        public String generateAdd() {
            return String.format("%s %s %s - %s",
                    phrase[rand.nextInt(phrase.length)],
                    event[rand.nextInt(event.length)],
                    person[rand.nextInt(person.length)],
                    city[rand.nextInt(city.length)]
            );
        }
    }
}