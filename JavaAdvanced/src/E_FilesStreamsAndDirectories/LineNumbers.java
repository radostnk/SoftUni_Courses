package E_FilesStreamsAndDirectories;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class LineNumbers {
    public static void main(String[] args) {

        try (PrintWriter printWriter = new PrintWriter("src/Resources/outputLineNumbers.txt")) {

            Path path = Paths.get("src/Resources/inputLineNumbers.txt");
            List<String> lines = Files.readAllLines(path);

            for (int i = 0; i < lines.size(); i++) {
                printWriter.printf("%d. %s\n", i + 1, lines.get(i));
            }


        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
