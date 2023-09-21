package E_FilesStreamsAndDirectories;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyImage {
    public static void main(String[] args) throws IOException {
        byte[] buffer = new byte[1024];

        FileInputStream fis = new FileInputStream("src/Resources/flower.jpg");
        FileOutputStream fos = new FileOutputStream("src/Resources/flowerOutput.jpg");

        while (fis.read(buffer) != -1) {
            fos.write(buffer);
        }

        fos.close();
    }
}
