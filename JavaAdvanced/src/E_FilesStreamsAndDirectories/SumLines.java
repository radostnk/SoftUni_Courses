package E_FilesStreamsAndDirectories;

import java.io.*;

public class SumLines {
    public static void main(String[] args) {
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader("src/Resources/input.txt"))) {

            String line = bufferedReader.readLine();

            while (line != null) {
                int sum = 0;

                for (int i = 0; i < line.length(); i++) {
                    sum += line.charAt(i);
                }

                System.out.println(sum);
                line = bufferedReader.readLine();
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

//FileInputStream - bytes
//FileReader - chars
//BufferedInputStream - many bytes taken at once (better performance)
//BufferedReader - many chars taken at once (better performance)