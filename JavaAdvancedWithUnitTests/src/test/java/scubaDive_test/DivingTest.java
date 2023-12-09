package scubaDive_test;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class DivingTest {

    private static final String NAME = "Wavy Diving";
    public static final int CAPACITY = 3;
    private DeepWaterDiver diverOne;
    private DeepWaterDiver diverTwo;
    private Diving diving;


    @Before
    public void setUp() {
        diving = new Diving(NAME, CAPACITY);
        diverOne = new DeepWaterDiver("Margo", 15.2);
        diverTwo = new DeepWaterDiver("Tomi", 20);
        diving.addDeepWaterDiver(diverOne);
        diving.addDeepWaterDiver(diverTwo);
    }

    @Test(expected = NullPointerException.class)
    public void testCreateDiving_Throws_IfNameIsNull() {
        Diving invalidDiving = new Diving(null, 5);
    }

    @Test(expected = NullPointerException.class)
    public void testCreateDiving_Throws_IfNameIsEmpty() {
        Diving invalidDiving = new Diving("", 5);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testCreateDiving_Throws_IfCapacityIsLessThanZero() {
        Diving invalidDiving = new Diving("Fun Dive", -1);
    }

    @Test
    public void testGetCount() {
        assertEquals(2, diving.getCount());
    }

    @Test
    public void testGetName() {
        assertEquals(NAME, diving.getName());
    }

    @Test
    public void testGetCapacity() {
        assertEquals(CAPACITY, diving.getCapacity());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAddDiver_Throws_IfNoCapacity() {
        diving.addDeepWaterDiver(new DeepWaterDiver("John", 12));
        diving.addDeepWaterDiver(new DeepWaterDiver("Maria", 8));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAddDiver_Throws_IfDiverAlreadyExists() {
        diving.addDeepWaterDiver(diverOne);
    }

    @Test
    public void testAddDeepWaterDiver() {
        diving.addDeepWaterDiver(new DeepWaterDiver("Jimmy", 22));
        assertEquals(3, diving.getCount());
    }

    @Test
    public void testRemoveDiver_ReturnsFalse_IfDiverDoesNotExist() {
        assertFalse(diving.removeDeepWaterDiver("Lili"));
    }

    @Test
    public void testRemoveDiver_ReturnsTrue_IfDiverExists() {
        assertTrue(diving.removeDeepWaterDiver("Margo"));
    }

    @Test
    public void testRemoveDeepWaterDiver() {
        diving.removeDeepWaterDiver("Margo");
        assertEquals(1, diving.getCount());
    }
}