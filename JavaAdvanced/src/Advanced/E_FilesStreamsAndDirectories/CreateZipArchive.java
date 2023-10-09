package Advanced.E_FilesStreamsAndDirectories;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class CreateZipArchive {
    public static void main(String[] args) {
        try (ZipOutputStream zos = new ZipOutputStream(new FileOutputStream("src/Advanced.Resources/files.zip"))) {

            ZipEntry entry1 = new ZipEntry("input.txt");
            zos.putNextEntry(entry1);
            ZipEntry entry2 = new ZipEntry("inputOne.txt");
            zos.putNextEntry(entry2);
            ZipEntry entry3 = new ZipEntry("inputTwo.txt");
            zos.putNextEntry(entry3);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
