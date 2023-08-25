package E_StacksAndQueues;

import java.util.ArrayDeque;
import java.util.Scanner;

public class SimpleTextEditor {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        StringBuilder textSb = new StringBuilder();
        ArrayDeque<String> memory = new ArrayDeque<>();

        while (n > 0) {
            String[] command = scan.nextLine().split(" ");
            switch (command[0]) {
                case "1":
                    memory.push(textSb.toString());
                    String strToAppend = command[1];
                    textSb.append(strToAppend);
                    break;

                case "2":
                    memory.push(textSb.toString());
                    int count = Integer.parseInt(command[1]);
                    textSb.delete(textSb.length() - count, textSb.length());
                    break;

                case "3":
                    int index = Integer.parseInt(command[1]);
                    System.out.println(textSb.charAt(index - 1));
                    break;

                case "4":
                    if (!memory.isEmpty()) {
                        String lastState = memory.pop();
                        textSb = new StringBuilder(lastState);
                    }
                    break;
            }
            n--;
        }
    }
}
//· "1 {string}" - appends [string] to the end of the text.
//· "2 {count}" - erases the last [count] elements from the text.
//· "3 {index}" - returns the element at position [index] from the text.
//· "4" - undoes the last not-undone command of type 1 or 2 and returns the text to the state before that operation.