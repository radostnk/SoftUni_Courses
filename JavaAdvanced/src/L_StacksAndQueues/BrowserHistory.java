package L_StacksAndQueues;

import java.util.ArrayDeque;
import java.util.Scanner;

public class BrowserHistory {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        String currentUrl = null;
        ArrayDeque<String> historyStack = new ArrayDeque<>();

        while (!input.equals("Home")) {

            if (!input.equals("back")) {
                if (currentUrl != null) {
                    historyStack.push(currentUrl);
                }
                currentUrl = input;
                System.out.println(currentUrl);

            } else {
                if (historyStack.isEmpty()) {
                    System.out.println("no previous URLs");
                } else {
                    currentUrl = historyStack.pop();
                    System.out.println(currentUrl);
                }
            }

            input = scan.nextLine();
        }
    }
}

