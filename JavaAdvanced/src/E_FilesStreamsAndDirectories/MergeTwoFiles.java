package E_FilesStreamsAndDirectories;

import java.io.*;

public class MergeTwoFiles {
    public static void main(String[] args) {
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader("src/Resources/inputOne.txt"));
             BufferedReader bufferedReaderTwo = new BufferedReader(new FileReader("src/Resources/inputTwo.txt"));
             PrintWriter printWriter = new PrintWriter("src/Resources/mergedOneAndTwo.txt")) {

            String lineOne = bufferedReader.readLine();

            while (lineOne != null) {
                printWriter.println(lineOne);
                lineOne = bufferedReader.readLine();
            }

            String lineTwo = bufferedReaderTwo.readLine();

            while (lineTwo != null) {
                printWriter.println(lineTwo);
                lineTwo = bufferedReaderTwo.readLine();
            }

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
