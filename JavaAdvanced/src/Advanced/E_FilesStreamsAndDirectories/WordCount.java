package Advanced.E_FilesStreamsAndDirectories;

import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Scanner;

public class WordCount {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(new FileReader("src/Advanced.Resources/words.txt"));
             Scanner scanTwo = new Scanner(new FileReader("src/Advanced.Resources/text.txt"));
             PrintWriter printWriter = new PrintWriter("src/Advanced.Resources/outputWordCount.txt");) {

            LinkedHashMap<String, Integer> wordsMap = new LinkedHashMap<>();
            Arrays.stream(scan.nextLine().split(" ")).forEach(word -> wordsMap.put(word,0));

            while (scanTwo.hasNext()) {
                String nextWord = scanTwo.next();

                if (wordsMap.containsKey(nextWord)) {
                    wordsMap.put(nextWord, wordsMap.get(nextWord) + 1);
                }
            }

            wordsMap.forEach((key, value) -> printWriter.printf("%s - %d\n", key, value));

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
