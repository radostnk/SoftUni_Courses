package E_FinalExamPreparation;

import java.util.Scanner;

public class TheLimitationGame {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String message = scan.nextLine();
        StringBuilder sb = new StringBuilder(message);
        String input = scan.nextLine();

        while (!input.equals("Decode")) {
            String[] inputArr = input.split("\\|");
            String command = inputArr[0];

            switch (command) {

                case "Move": {
                    int numOfLetters = Integer.parseInt(inputArr[1]);
                    String substr = sb.substring(0, numOfLetters);
                    sb.delete(0, numOfLetters);
                    sb.append(substr);
                }
                break;

                case "Insert": {
                    int index = Integer.parseInt(inputArr[1]);
                    String value = inputArr[2];
                    sb.insert(index, value);
                }
                break;

                case "ChangeAll": {
                    String substr = inputArr[1];
                    String replacement = inputArr[2];

                    while (sb.indexOf(substr) != -1) {
                        int index = sb.indexOf(substr);
                        sb.delete(index, index + 1);
                        sb.insert(index, replacement);
                    }
                }
                break;
            }
            input = scan.nextLine();
        }
        System.out.println("The decrypted message is: " + sb.toString());
    }
}