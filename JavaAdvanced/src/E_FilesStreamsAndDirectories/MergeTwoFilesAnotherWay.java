package E_FilesStreamsAndDirectories;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.List;

public class MergeTwoFilesAnotherWay {
    public static void main(String[] args) throws IOException {
        Path pathOne = Paths.get("src/Resources/inputOne.txt");
        Path pathTwo = Paths.get("src/Resources/inputTwo.txt");
        Path newFilePath = Paths.get("src/Resources/newFileMerged.txt");
        List<String> fileOne = Files.readAllLines(pathOne);
        List<String> fileTwo = Files.readAllLines(pathTwo);
        Files.write(newFilePath, fileOne, StandardOpenOption.APPEND);
        Files.write(newFilePath, fileTwo, StandardOpenOption.APPEND);
    }
}
