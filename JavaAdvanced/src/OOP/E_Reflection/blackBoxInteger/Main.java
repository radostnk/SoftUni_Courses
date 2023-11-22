package OOP.E_Reflection.blackBoxInteger;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException, NoSuchFieldException {

        Scanner scan = new Scanner(System.in);
        String command = scan.nextLine();

        Class<BlackBoxInt> blackBoxIntClass = BlackBoxInt.class;
        Constructor<BlackBoxInt> constructor = blackBoxIntClass.getDeclaredConstructor();
        constructor.setAccessible(true);
        BlackBoxInt instance = constructor.newInstance();

        Method[] methods = blackBoxIntClass.getDeclaredMethods();
        Field innerValueField = blackBoxIntClass.getDeclaredField("innerValue");
        innerValueField.setAccessible(true);

        while (!command.equals("END")) {

            String[] tokens = command.split("_");
            String action = tokens[0];
            int value = Integer.parseInt(tokens[1]);

            for (Method method : methods) {
                if (method.getName().equals(action)) {
                    method.setAccessible(true);
                    method.invoke(instance, value);
                    System.out.println(innerValueField.get(instance));
                }
            }

            command = scan.nextLine();
        }
    }
}
