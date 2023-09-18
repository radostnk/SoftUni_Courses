package E_FilesStreamsAndDirectories;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.PrintWriter;

public class CountCharacterTypes {
    public static void main(String[] args) {

        int vowelsCount = 0;
        int consonantsCount = 0;
        int punctuationsCount = 0;

        try (FileInputStream fileInputStream = new FileInputStream("src/Resources/input.txt")) {
            PrintWriter printWriter = new PrintWriter("src/Resources/sumsOutput.txt");

            int symbolAsInt = fileInputStream.read();

            while (symbolAsInt >= 0) {

                char symbol = (char) symbolAsInt;

                if (isVowel(symbol)) {
                    vowelsCount ++;
                } else if (isPunctuation(symbol)) {
                    punctuationsCount ++;
                } else if (!Character.isWhitespace(symbol)){
                    consonantsCount ++;
                }

                symbolAsInt = fileInputStream.read();
            }

            printWriter.println("Vowels: " + vowelsCount);
            printWriter.println("Other symbols: " + consonantsCount);
            printWriter.println("Punctuation: " + punctuationsCount);

            printWriter.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static boolean isPunctuation(char symbol) {
        return (symbol == '!' || symbol == '.' || symbol == ',' || symbol == '?');
    }

    private static boolean isVowel(char symbol) {
        return (symbol == 'a' || symbol == 'o' || symbol == 'u' || symbol == 'e' || symbol == 'i');
    }
}

//· a, e, i, o, u are vowels, only lower case.
//· All others are other symbols.
//· Punctuation marks are (! , . ?).
//· Do not count whitespace.