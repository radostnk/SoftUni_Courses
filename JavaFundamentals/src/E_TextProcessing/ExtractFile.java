package E_TextProcessing;

import java.util.Scanner;

public class ExtractFile {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] input = scan.nextLine().split("\\\\");
        String fileFullName = input[input.length - 1];

        String fileName = fileFullName.split("\\.")[0];
        String fileExtension = fileFullName.split("\\.")[1];

        System.out.println("File name: " + fileName);
        System.out.println("File extension: " + fileExtension);
    }
}
