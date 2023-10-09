package Advanced.E_StacksAndQueues;

import java.util.ArrayDeque;
import java.util.Scanner;

public class BalancedParentheses {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        boolean isBalanced = true;
        ArrayDeque<Character> openBracketStack = new ArrayDeque<>();

        for (int i = 0; i < input.length(); i++) {
            char curBracket = input.charAt(i);

            if (curBracket == '(' || curBracket == '{' || curBracket == '[') {
                openBracketStack.push(curBracket);
            } else {
                if (openBracketStack.isEmpty()) {
                    isBalanced = false;
                    break;
                }
                char correspondingOpenBracket = openBracketStack.pop();

                if (correspondingOpenBracket == '(' && curBracket != ')') {
                    isBalanced = false;
                    break;
                } else if (correspondingOpenBracket == '[' && curBracket != ']') {
                    isBalanced = false;
                    break;
                } else if (correspondingOpenBracket == '{' && curBracket != '}') {
                    isBalanced = false;
                    break;
                }
            }
        }

        if (isBalanced && openBracketStack.isEmpty()) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
