package E_WhileLoop;

import java.util.Scanner;

public class Moving {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int width = Integer.parseInt(scan.nextLine());
        int length = Integer.parseInt(scan.nextLine());
        int height = Integer.parseInt(scan.nextLine());
        String command = scan.nextLine();

        boolean breakFlag = false;
        int freeSpace = height * width * length;

        while (!command.equals("Done")) {
            int boxes = Integer.parseInt(command);
            freeSpace -= boxes;

            if (freeSpace <= 0) {
                System.out.printf("No more free space! You need %d Cubic meters more.", Math.abs(freeSpace));
                breakFlag = true;
                break;
            }
            command = scan.nextLine();
        }
        if (!breakFlag) {
            System.out.printf("%d Cubic meters left.", freeSpace);
        }
    }
}