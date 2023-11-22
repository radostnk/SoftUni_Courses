package OOP.L_Reflection;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

@Subject(categories = {"Test", "Annotation"})
public class Tracker {

    @Author(name = "Radost")
    public static void main(String[] args) {
        Tracker.printMethodsByAuthor(Tracker.class);
    }

    @Author(name = "Koleva")
    public static void printMethodsByAuthor(Class<?> clazz) {

        Class<Tracker> trackerClass = Tracker.class;
        Method[] methods = trackerClass.getDeclaredMethods();

        for (Method method : methods) {
            Annotation[] curAnnotations = method.getAnnotations();
            Author authorAnnotation = (Author) curAnnotations[0];

            System.out.printf("%s: %s()\n", authorAnnotation.name(), method.getName());
        }
    }
}
