package E_FilesStreamsAndDirectories;

import java.io.*;

public class SerializeCustomObject {
    public static void main(String[] args) {
        Course course = new Course();
        course.name = "Java Advanced";
        course.studentsNum = 50;

        try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("src/Resources/course.ser"));
             ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("src/Resources/course.ser"))) {

            objectOutputStream.writeObject(course);
            Course courseFromFile = (Course) objectInputStream.readObject();

            System.out.println(courseFromFile.name);
            System.out.println(courseFromFile.studentsNum);

       } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
