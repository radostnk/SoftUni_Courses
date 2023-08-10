package MidExam;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ProblemTwo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<String> friendsList = Arrays.stream(scan.nextLine().split(", ")).collect(Collectors.toList());
        String command = scan.nextLine();

        while (!command.equals("Report")) {
            String[] commandArr = command.split(" ");
            String task = commandArr[0];

            switch (task) {
                case "Blacklist":
                    String nameToBlacklist = commandArr[1];
                    if (friendsList.contains(nameToBlacklist)) {
                        int index = friendsList.indexOf(nameToBlacklist);
                        friendsList.set(index, "Blacklisted");
                        System.out.printf("%s was blacklisted.\n", nameToBlacklist);
                    } else {
                        System.out.printf("%s was not found.\n", nameToBlacklist);
                    }

                    break;

                case "Error":
                    int errorIndex = Integer.parseInt(commandArr[1]);

                    if (isValidIndex(errorIndex, friendsList)) {
                        String curItem = friendsList.get(errorIndex);

                        if (!curItem.equals("Blacklisted") && !curItem.equals("Lost")) {
                            friendsList.set(errorIndex, "Lost");
                            System.out.printf("%s was lost due to an error.\n", curItem);
                        }

                    } else {
                        break;
                    }

                    break;

                case "Change":
                    int changeIndex = Integer.parseInt(commandArr[1]);

                    if (isValidIndex(changeIndex, friendsList)) {
                        String changedItem = friendsList.get(changeIndex);
                        String newItem = commandArr[2];
                        friendsList.set(changeIndex, newItem);
                        System.out.printf("%s changed his username to %s.\n", changedItem, newItem);
                    } else {
                        break;
                    }

                    break;
            }

            command = scan.nextLine();
        }
        int blacklistedCount = 0;
        int lostCount = 0;

        for (int i = 0; i < friendsList.size(); i++) {
            if (friendsList.get(i).equals("Blacklisted")) {
                blacklistedCount ++;
            } else if (friendsList.get(i).equals("Lost")) {
                lostCount ++;
            }
        }

        System.out.printf("Blacklisted names: %d\n", blacklistedCount);
        System.out.printf("Lost names: %d\n", lostCount);
        System.out.println(friendsList.toString().replaceAll("[\\[\\],]", ""));
    }

    public static boolean isValidIndex(int index, List<String> list) {
        if (index >= 0 && index < list.size()) {
            return true;
        } else {
            return false;
        }
    }
}
