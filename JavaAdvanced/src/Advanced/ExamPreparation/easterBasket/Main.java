package Advanced.ExamPreparation.easterBasket;

public class Main {
    public static void main(String[] args) {
        Basket basket = new Basket("Wooden", 20);
        Egg egg = new Egg("red", 10, "oval");
        Egg egg1 = new Egg("white", 8, "square");
        Egg egg2 = new Egg("black", 7, "circle");
        Egg egg3 = new Egg("green", 11, "extraordinary");
        Egg egg4 = new Egg("yellow", 2, "triangle");

        basket.addEgg(egg);
        basket.addEgg(egg1);
        basket.addEgg(egg2);
        basket.addEgg(egg3);
        basket.addEgg(egg4);

        basket.addEgg(new Egg("orange", 13, "square"));
        Egg myEgg = basket.getEgg("orange");
        basket.removeEgg("orange");
        Egg strongestEgg = basket.getStrongestEgg();
        System.out.printf(basket.report());;
    }
}
