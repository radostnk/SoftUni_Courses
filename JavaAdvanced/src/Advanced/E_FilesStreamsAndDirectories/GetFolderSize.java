package Advanced.E_FilesStreamsAndDirectories;

import java.io.File;
import java.util.ArrayDeque;

public class GetFolderSize {
    public static void main(String[] args) {
        File rootFolder = new File("src/Advanced.Resources/Folders/Exercises Advanced.Resources");
        ArrayDeque<File> filesQueue = new ArrayDeque<>();
        filesQueue.offer(rootFolder);
        int totalSize = 0;

        while (!filesQueue.isEmpty()) {
            File curFile = filesQueue.poll();
            File[] nestedFiles = curFile.listFiles();

            for (File file : nestedFiles) {
                if (file.isDirectory()) {
                    filesQueue.offer(file);
                } else {
                    totalSize += file.length();
                }
            }
        }
        System.out.println("Folder size: " + totalSize);
    }
}
