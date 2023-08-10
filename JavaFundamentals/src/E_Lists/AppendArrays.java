package E_Lists;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class AppendArrays {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String input = scan.nextLine();
        List<String> startList = Arrays.stream(input.split("\\|")).collect(Collectors.toList());
        Collections.reverse(startList);
        System.out.println(startList.toString().replaceAll("[\\[\\],]", "").replaceAll("\\s+", " ").trim());
    }
}