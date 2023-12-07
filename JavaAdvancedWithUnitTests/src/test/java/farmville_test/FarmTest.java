package farmville_test;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class FarmTest {

    private static final String NAME = "coolFarm";
    private static final int CAPACITY = 2;
    private Farm myFarm;
    private Animal turtle;
    private Animal dog;
    private Animal cat;

    @Before
    public void setUp() {
        myFarm = new Farm(NAME, CAPACITY);
        turtle = new Animal("turtle", 50);
        dog = new Animal("dog", 150);
        cat = new Animal("cat", 10);
    }

    @Test(expected = NullPointerException.class)
    public void testCreateFarm_Throws_IfNameIsNull() {
        Farm newFarm = new Farm(null, 5);
    }

    @Test(expected = NullPointerException.class)
    public void testCreateFarm_Throws_IfNameIsEmpty() {
        Farm newFarm = new Farm("", 5);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testCreateFarm_Throws_IfCapacityIsNegative() {
        Farm newFarm = new Farm("farm", -1);
    }

    @Test
    public void testGetCapacity() {
        int capacityActual = myFarm.getCapacity();
        assertEquals(CAPACITY, capacityActual);
    }

    @Test
    public void testGetName() {
        String nameActual = myFarm.getName();
        assertEquals(NAME, nameActual);
    }

    @Test
    public void testGetCount() {
        int countActual = myFarm.getCount();
        assertEquals(0, countActual);
    }


    @Test(expected = IllegalArgumentException.class)
    public void testAddAnimal_Throws_IfCapacityIsNotEnough() {
        myFarm.add(dog);
        myFarm.add(cat);
        myFarm.add(turtle);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAddAnimal_Throws_IfAnimalAlreadyExists() {
        myFarm.add(dog);
        myFarm.add(dog);
    }

    @Test
    public void testAddAnimal() {
        myFarm.add(turtle);
    }

    @Test
    public void testRemoveAnimal_ReturnsTrue_IfAnimalDeletedSuccessfully() {
        myFarm.add(turtle);
        assertTrue(myFarm.remove("turtle"));
    }

    @Test
    public void testRemoveAnimal_ReturnsFalse_IfAnimalDoesNotExist() {
        assertFalse(myFarm.remove("kitty"));
    }
}