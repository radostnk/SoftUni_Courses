package OOP.L_Reflection;

import java.lang.reflect.Method;
import java.util.TreeSet;
import java.util.function.Function;

import static OOP.L_Reflection.ReflectionUtils.filterByNameAndCollect;

public class GettersAndSetters {
    public static void main(String[] args) {
        Class<Reflection> clazz = Reflection.class;

        Method[] allMethods = clazz.getDeclaredMethods();

        TreeSet<Method> getMethods = filterByNameAndCollect(allMethods, "get");
        TreeSet<Method> setMethods = filterByNameAndCollect(allMethods, "set");

        Function<Class<?>, String> printReturnType = c -> c == int.class ? "class int" : c.toString();

        getMethods.forEach(
                m -> System.out.printf("%s will return %s\n",
                        m.getName(), printReturnType.apply(m.getReturnType())));

        setMethods.forEach(
                m -> System.out.printf("%s and will set field of %s\n",
                        m.getName(), printReturnType.apply(m.getParameterTypes()[0])));
    }


}
