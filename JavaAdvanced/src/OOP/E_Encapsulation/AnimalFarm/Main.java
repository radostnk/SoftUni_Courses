package OOP.E_Encapsulation.AnimalFarm;

public class Main {
    public static void main(String[] args) {
        try {
            Chicken chick = new Chicken(null, 14);
            System.out.println(chick);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
