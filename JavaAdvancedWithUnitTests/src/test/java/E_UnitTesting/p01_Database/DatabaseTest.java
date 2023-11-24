package E_UnitTesting.p01_Database;

import org.junit.Before;
import org.junit.Test;

import javax.naming.OperationNotSupportedException;

import static org.junit.Assert.*;

public class DatabaseTest {

    private Database database;
    private static final Integer[] NUMBERS = {1, 2, 3, 4, 5};
    private static final int INITIAL_SIZE = NUMBERS.length;

    @Before
    public void setUp() throws OperationNotSupportedException {
        database = new Database(NUMBERS);
    }

    @Test(expected = OperationNotSupportedException.class)
    public void testCreateDatabase_Throws_WhenElements_AreLessThan_1() throws OperationNotSupportedException {
        Database emptyDatabase = new Database();
    }

    @Test(expected = OperationNotSupportedException.class)
    public void testCreateDatabase_Throws_WhenElements_AreMoreThan_16() throws OperationNotSupportedException {
        Integer[] numbers = new Integer[17];
        Database overflowDatabase = new Database(numbers);
    }

    @Test
    public void testCreateDatabase() throws OperationNotSupportedException {
        Integer[] dbElements = database.getElements();

        assertEquals(NUMBERS.length, dbElements.length);
        assertArrayEquals(NUMBERS, dbElements);
    }

    @Test(expected = OperationNotSupportedException.class)
    public void testAdd_Throws_IfAnElement_IsNull() throws OperationNotSupportedException {
        database.add(null);
    }

    @Test
    public void testAddElement() throws OperationNotSupportedException {

        int addElement = 6;

        database.add(addElement);
        Integer[] dbElementsAfterAdd = database.getElements();
        int afterAddSize = dbElementsAfterAdd.length;
        int newLastElement = dbElementsAfterAdd[afterAddSize - 1];

        assertEquals(addElement, newLastElement);
        assertEquals(INITIAL_SIZE + 1, afterAddSize);
    }

    @Test(expected = OperationNotSupportedException.class)
    public void testRemove_Throws_IfDatabase_IsEmpty() throws OperationNotSupportedException {
        for (int i = 0; i <= INITIAL_SIZE; i++) {
            database.remove();
        }
    }

    @Test
    public void testRemove() throws OperationNotSupportedException {
        int expectedLastElement = NUMBERS[NUMBERS.length - 2];

        database.remove();
        Integer[] dbElementsAfterRemove = database.getElements();
        int actualLastElement = dbElementsAfterRemove[dbElementsAfterRemove.length - 1];
        int afterRemoveSize = dbElementsAfterRemove.length;

        assertEquals(expectedLastElement, actualLastElement);
        assertEquals(INITIAL_SIZE - 1, afterRemoveSize);
    }

}