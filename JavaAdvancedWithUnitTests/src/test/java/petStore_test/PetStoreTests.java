package petStore_test;

import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class PetStoreTests {
    private PetStore petStore;
    private List<Animal> animals;
    private Animal turtle;
    private Animal cat;
    private Animal dog;

    @Before
    public void setUp() {
        petStore = new PetStore();

        turtle = new Animal("turtle", 20, 100);
        cat = new Animal("cat", 6, 80);
        dog = new Animal("dog", 30, 150);
        animals = List.of(turtle, cat, dog);

        petStore.addAnimal(turtle);
        petStore.addAnimal(cat);
        petStore.addAnimal(dog);
    }

    @Test
    public void testGetAnimals() {
        List<Animal> animalsActual = petStore.getAnimals();
        assertArrayEquals(animals.toArray(), animalsActual.toArray());
    }

    @Test
    public void testGetCount() {
        int countActual = petStore.getAnimals().size();
        assertEquals(3, countActual);
    }

    @Test
    public void testFindAllAnimalsWithMaxKilograms() {
        int moreThanKg = 19;
        Animal[] expectedAnimals = {turtle, dog};
        List<Animal> actualAnimals = petStore.findAllAnimalsWithMaxKilograms(moreThanKg);
        assertArrayEquals(expectedAnimals, actualAnimals.toArray());
    }

    @Test
    public void testAddAnimal_AddsTheNewAnimal() {
        Animal newAnimal = new Animal("frog", 2, 30);
        petStore.addAnimal(newAnimal);
        assertTrue(petStore.getAnimals().contains(newAnimal));
    }

    @Test
    public void testAddAnimal_AddsTheNewAnimal_AtTheEndOfTheList() {
        Animal newAnimal = new Animal("frog", 2, 30);
        petStore.addAnimal(newAnimal);

        assertEquals(newAnimal, petStore.getAnimals().get(3));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAddAnimal_Throws_IfAnimalIsNull() {
        petStore.addAnimal(null);
    }

    @Test
    public void testGetTheMostExpensiveAnimal() {
        Animal actualAnimal = petStore.getTheMostExpensiveAnimal();
        assertEquals(dog, actualAnimal);
    }

    @Test
    public void testGetTheMostExpensiveAnimal_ReturnsNull_IfPetShopIsEmpty() {
        PetStore emptyStore = new PetStore();
        Animal actualAnimal = emptyStore.getTheMostExpensiveAnimal();
        assertNull(actualAnimal);
    }

    @Test
    public void testFindAllAnimalBySpecie() {
        Animal newTurtle = new Animal("turtle", 28, 200);
        petStore.addAnimal(newTurtle);
        Animal[] expectedAnimals = {turtle, newTurtle};
        List<Animal> actualAnimals = petStore.findAllAnimalBySpecie("turtle");

        assertEquals(expectedAnimals, actualAnimals.toArray());
    }
}

