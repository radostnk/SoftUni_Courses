package E_Lists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class CardsGame {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        List<Integer> playerOne = new ArrayList<>(Arrays.stream(scan.nextLine()
                        .split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList()));

        List<Integer> playerTwo = new ArrayList<>(Arrays.stream(scan.nextLine()
                        .split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList()));

        while (!(playerOne.size() == 0 || playerTwo.size() == 0)) {

            int playerOneCard = playerOne.get(0);
            int playerTwoCard = playerTwo.get(0);

            if (playerOneCard > playerTwoCard) {
                playerOne.add(playerOneCard);
                playerOne.add(playerTwoCard);
            } else if (playerOneCard < playerTwoCard) {
                playerTwo.add(playerTwoCard);
                playerTwo.add(playerOneCard);
            }
            playerOne.remove(0);
            playerTwo.remove(0);
        }

        int sum = 0;

        if (playerOne.size() != 0) {

            for (int num : playerOne) {
                sum += num;
            }

            System.out.println("First player wins! Sum: " + sum);
        } else if (playerTwo.size() != 0) {

            for (int num : playerTwo) {
                sum += num;
            }

            System.out.println("Second player wins! Sum: " + sum);
        }
    }
}
