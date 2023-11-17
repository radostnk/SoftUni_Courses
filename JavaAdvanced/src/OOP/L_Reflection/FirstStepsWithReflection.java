package OOP.L_Reflection;

import java.lang.reflect.*;

public class FirstStepsWithReflection {

    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException,
            InvocationTargetException, InstantiationException, IllegalAccessException, NoSuchFieldException {

        //Example:
        Class<Reflection> reflection = Reflection.class;
        Class<?> reflection1 = Class.forName("L_Reflection.Reflection");

        System.out.println(reflection);
        System.out.println(reflection.getSuperclass());

        Class<?>[] interfaces = reflection.getInterfaces();

        for (Class<?> anInterface : interfaces) {
            System.out.println(anInterface);
        }

        Constructor<Reflection> declaredConstructor = reflection.getDeclaredConstructor();
        Object newReflectionInstance = declaredConstructor.newInstance();
        System.out.println(newReflectionInstance);


    //Ways to obtain interfaces and super classes

        Class<?>[] interface1 = reflection.getInterfaces();
        Class<?> superClass = reflection.getSuperclass();

    //Ways to obtain constructors:

        // - only public constructors
        Constructor<?>[] publicConstructors = reflection.getConstructors();

        // - all constructors
        Constructor<?>[] declaredConstructors = reflection.getDeclaredConstructors();

        // - constructor taking specific parameter(s)
        // could be used with getDeclaredConstructor() and getConstructor()
        Constructor<?> specificConstructor = reflection
                .getDeclaredConstructor(String.class, String.class, String.class);

        // - if the constructor is private, it should be made accessible
        specificConstructor.setAccessible(true);

        // - we can also get parameter types of a constructor
        Class<?>[] parameterTypes = declaredConstructor.getParameterTypes();

    //Ways to create a new instance with the help of the constructor

        Reflection newReflectionInstance1 = (Reflection) specificConstructor.newInstance("str1", "str2", "str3");

        // - if we specify the type of the constructor, no type cast will be needed
        Constructor<Reflection> specificConstructor1 = reflection
                .getDeclaredConstructor(String.class, String.class, String.class);

        specificConstructor1.setAccessible(true);
        Reflection newReflectionInstance2 = specificConstructor1.newInstance("str1", "str2", "str3");

    //Wildcards can be used to avoid specifying type

    //Ways to obtain fields:

        // - public fields only
        Field publicField = reflection.getField("name");
        Field[] publicFields = reflection.getFields();

        // - all fields
        Field privateField = reflection.getDeclaredField("webAddress");
        Field[] privateFields = reflection.getDeclaredFields();

        // - field name and type
        String fieldName = publicField.getName();
        Class<?> fieldType = privateField.getType();

    //Ways to set value to a field

        // - first, we make it accessible
        privateField.setAccessible(true);

        // - second, we call set method for the field and pass
        // the instance for which we want to change the field and the new value
        privateField.set(newReflectionInstance, "address");

    //Ways to obtain methods

        // - public methods only
        Method publicMethod = reflection.getMethod("getName");
        Method[] publicMethods = reflection.getMethods();

        // - all methods
        Method privateMethod = reflection.getDeclaredMethod("setZip", int.class);
        Method[] privateMethods = reflection.getDeclaredMethods();
        Method staticMethod = reflection.getDeclaredMethod("count", int.class);

    //Ways to call methods
        //before invoking a private method, we should make it accessible
        privateMethod.setAccessible(true);
        staticMethod.setAccessible(true);

        // - void method with input parameters
        // no variable needed
        // we pass to the invoke method the instance and the values
        privateMethod.invoke(newReflectionInstance, 55);

        // - method returning some value with no input parameters
        // variable is needed to store the returned value
        // we pass to the invoke method only the instance
        Object name = publicMethod.invoke(newReflectionInstance);

        // - static method
        // as it is not called for a specific instance, we pass null
        Object returnValue = staticMethod.invoke(null, 4);

    //Ways to obtain access modifiers

        // - for methods
        int methodModifiers = staticMethod.getModifiers();

        // - for fields
        int fieldModifiers = publicField.getModifiers();

        // - static methods for class Modifier
        boolean isAbstract = Modifier.isAbstract(fieldModifiers);
        boolean isPublic = Modifier.isPublic(fieldModifiers);
        boolean isFinal = Modifier.isFinal(fieldModifiers);
        boolean isStatic = Modifier.isStatic(fieldModifiers);

    //Way to make your private field/method/etc untouchable by reflection

        // - using SecurityManager will throw AccessControlException when trying to use setAccessible(true)
        //System.setSecurityManager(new SecurityManager());

    //Using reflection for arrays

        int[] arr = (int[]) Array.newInstance(int.class, 3);
        Array.set(arr, 0, 5);
    }
}
