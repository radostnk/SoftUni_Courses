package L_Generics.ArrayCreator;

public class Main {
    public static void main(String[] args) {
        Integer[] arr = ArrayCreator.create(5, 13);

        for (Integer el : arr) {
            System.out.println(el);
        }

        String[] arr2 = ArrayCreator.create(String.class, 6, "Mau");

        for (String el : arr2) {
            System.out.println(el);
        }
    }
}
