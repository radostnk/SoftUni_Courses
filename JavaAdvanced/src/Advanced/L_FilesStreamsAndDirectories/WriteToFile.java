package Advanced.L_FilesStreamsAndDirectories;

import java.io.*;

public class WriteToFile {
    public static void main(String[] args) {
        try (FileInputStream fileInputStream = new FileInputStream("src/Advanced.Resources/inputL.txt");
             FileOutputStream fileOutputStream = new FileOutputStream("src/Advanced.Resources/outputL1.txt")) {

            int el = fileInputStream.read();

            while (el >= 0) {
                char elAsChar = (char) el;

                if (!isPunctuation(elAsChar)) {
                    fileOutputStream.write(elAsChar);
                }

                el = fileInputStream.read();
            }

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static boolean isPunctuation(char el) {
        return el == '.' || el == ',' || el == '!' || el == '?';
    }
}