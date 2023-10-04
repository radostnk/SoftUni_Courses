package L_Generics.JarOfT;

public class Main {
    public static void main(String[] args) {
        Jar<Pickle> jar = new Jar<>();

        jar.add(new Pickle());
        jar.add(new Pickle());
        jar.remove();
    }
}
