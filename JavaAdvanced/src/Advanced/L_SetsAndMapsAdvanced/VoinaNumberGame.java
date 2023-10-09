package Advanced.L_SetsAndMapsAdvanced;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.stream.Collectors;

public class VoinaNumberGame {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

//        LinkedHashSet<Integer> playerOne = new LinkedHashSet<>();
//        LinkedHashSet<Integer> playerTwo = new LinkedHashSet<>();
//
////        int[] firstHand = Arrays.stream(scan.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
////        int[] secondHand = Arrays.stream(scan.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
////
////        for (int i = 0; i < firstHand.length; i++) {
////            playerOne.add(firstHand[i]);
////        }
////
////        for (int i = 0; i < secondHand.length; i++) {
////            playerTwo.add(secondHand[i]);
////        }

        LinkedHashSet<Integer> playerOne = Arrays.stream(scan.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toCollection(LinkedHashSet :: new));
        LinkedHashSet<Integer> playerTwo = Arrays.stream(scan.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toCollection(LinkedHashSet :: new));


        int step = 1;

        while (!playerOne.isEmpty() && !playerTwo.isEmpty()) {

            if (step >= 50) {
                break;
            }

            Integer playerOneCard = playerOne.iterator().next();
            Integer playerTwoCard = playerTwo.iterator().next();

            playerOne.remove(playerOneCard);
            playerTwo.remove(playerTwoCard);

            if (playerOneCard > playerTwoCard) {
                playerOne.add(playerOneCard);
                playerOne.add(playerTwoCard);
            } else if (playerOneCard < playerTwoCard) {
                playerTwo.add(playerOneCard);
                playerTwo.add(playerTwoCard);
            }

            step ++;
        }

        if (playerOne.size() < playerTwo.size()) {
            System.out.println("Second player win!");
        } else if (playerOne.size() > playerTwo.size()) {
            System.out.println("First player win!");
        } else {
            System.out.println("Draw!");
        }
    }
}
