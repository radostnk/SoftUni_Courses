package Advanced.L_StacksAndQueues;

import java.util.ArrayDeque;
import java.util.Scanner;

public class PrinterQueue {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        ArrayDeque<String> filesQueue = new ArrayDeque<>();

        while (!input.equals("print")) {

            if (input.equals("cancel")) {

                if (filesQueue.isEmpty()) {
                    System.out.println("Printer is on standby");
                } else {
                    String cancelledFile = filesQueue.poll();
                    System.out.printf("Canceled %s\n", cancelledFile);
                }

            } else {
                filesQueue.offer(input);
            }

            input = scan.nextLine();
        }

//        filesQueue.forEach(file -> System.out.printf("%s\n", file));

        while (!filesQueue.isEmpty()) {
            System.out.printf("%s\n", filesQueue.poll());
        }
    }
}
