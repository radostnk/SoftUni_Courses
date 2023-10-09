package Advanced.E_FilesStreamsAndDirectories;

import java.io.*;

public class AllCapitals {
    public static void main(String[] args) {
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader("src/Advanced.Resources/input.txt"));
             PrintWriter printWriter = new PrintWriter(new FileWriter("src/Advanced.Resources/output.txt"));) {

            bufferedReader.lines().forEach(curLine -> printWriter.println(curLine.toUpperCase()));

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
