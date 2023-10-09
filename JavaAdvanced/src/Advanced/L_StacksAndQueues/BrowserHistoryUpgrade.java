package Advanced.L_StacksAndQueues;

import java.util.ArrayDeque;
import java.util.Scanner;

public class BrowserHistoryUpgrade {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        String currentUrl = null;
        ArrayDeque<String> historyStack = new ArrayDeque<>();
        ArrayDeque<String> forwardStack = new ArrayDeque<>();

        while (!input.equals("Home")) {

            if (input.equals("back")) {

                if (historyStack.isEmpty()) {
                    System.out.println("no previous URLs");
                } else {
                    forwardStack.push(currentUrl);
                    currentUrl = historyStack.pop();
                    System.out.println(currentUrl);
                }

            } else if (input.equals("forward")) {

                if (forwardStack.isEmpty()) {
                    System.out.println("no next URLs");
                } else {
                    historyStack.push(currentUrl);
                    currentUrl = forwardStack.pop();
                    System.out.println(currentUrl);
                }
            } else {

                if (currentUrl != null) {
                    historyStack.push(currentUrl);
                }
                currentUrl = input;
                System.out.println(currentUrl);
            }

            input = scan.nextLine();
        }
    }
}
