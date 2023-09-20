package L_FilesStreamsAndDirectories;

import java.io.*;

public class CopyBytes {
    public static void main(String[] args) {
        try (FileInputStream fileInputStream = new FileInputStream("src/Resources/input.txt");
             PrintWriter printWriter = new PrintWriter(new FileOutputStream("src/Resources/output2.txt"))) {

            int curEl = fileInputStream.read();
            while (curEl >= 1) {
                char elAsChar = (char) curEl;

                if (elAsChar == ' ') {
                    printWriter.print(elAsChar);
                } else if (curEl == 10){
                    printWriter.println();
                } else {
                    printWriter.print(curEl);
                }

                curEl = fileInputStream.read();
            }

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}