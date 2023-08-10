package E_WhileLoop;

import java.util.Scanner;

public class Cake {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int width = Integer.parseInt(scan.nextLine());
        int length = Integer.parseInt(scan.nextLine());
        int pieces = length * width;
        boolean breakFlag = false;
        String command = scan.nextLine();

        while (!command.equals("STOP")) {
            int piecesTaken = Integer.parseInt(command);
            pieces -= piecesTaken;

            if (pieces <= 0) {
                System.out.printf("No more cake left! You need %d pieces more.", Math.abs(pieces));
                breakFlag = true;
                break;
            }

            command = scan.nextLine();
        }
        if (!breakFlag) {
            System.out.printf("%d pieces are left.", pieces);
        }
    }
}
