package OOP.L_Reflection;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.TreeSet;
import java.util.function.Function;


import static OOP.L_Reflection.ReflectionUtils.*;

public class HighQualityMistakes {
    public static void main(String[] args) {
        Class<Reflection> clazz = Reflection.class;

        Method[] allMethods = clazz.getDeclaredMethods();
        Field[] allFields = clazz.getDeclaredFields();

        TreeSet<Field> fields = collectMembers(
                filterMembersByPredicate(allFields, f -> !Modifier.isPrivate(f.getModifiers())));

        TreeSet<Method> getMethods = collectMembers(filterMembersByPredicate(
                filterMembersByName(allMethods, "get"),
                m -> !Modifier.isPublic(m.getModifiers())));

        TreeSet<Method> setMethods = collectMembers(filterMembersByPredicate(
                filterMembersByName(allMethods, "set"),
                m -> !Modifier.isPrivate(m.getModifiers())));

        Function<Class<?>, String> printReturnType = c -> c == int.class ? "class int" : c.toString();

        fields.forEach(
                f -> System.out.printf("%s must be private!\n", f.getName()));

        getMethods.forEach(
                m -> System.out.printf("%s have to be public!\n",
                        m.getName(), printReturnType.apply(m.getReturnType())));

        setMethods.forEach(
                m -> System.out.printf("%s have to be private!\n",
                        m.getName(), printReturnType.apply(m.getParameterTypes()[0])));
    }
}
