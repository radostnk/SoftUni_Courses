package L_FilesStreamsAndDirectories;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ReadFile {
    public static void main(String[] args) {
        try (FileInputStream fileInputStream = new FileInputStream("src/Resources/input.txt")) {

            int curEl = fileInputStream.read();
            while (curEl >= 1) {

                System.out.printf("%s ", Integer.toBinaryString(curEl));
                curEl = fileInputStream.read();
            }

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}