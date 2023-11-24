package E_UnitTesting.p03_IteratorTest;

import org.junit.Before;
import org.junit.Test;

import javax.naming.OperationNotSupportedException;

import static org.junit.Assert.*;

public class ListIteratorTest {

    private ListIterator listIterator;
    private static final String[] ELEMENTS = {"el1", "el2", "el3"};

    @Before
    public void setUp() throws OperationNotSupportedException {
        listIterator = new ListIterator(ELEMENTS);
    }

    @Test(expected = OperationNotSupportedException.class)
    public void testCreateListIterator_Throws_IfElementsIsNull() throws OperationNotSupportedException {
        ListIterator emptyListIterator = new ListIterator(null);
    }

    @Test
    public void testMove_ReturnsTrueAndMovesOnNextIndex_IfThereIsNextElement() {
        for (int i = 0; i < ELEMENTS.length - 1; i++) {
            assertTrue(listIterator.move());
        }
    }

    @Test
    public void testMove_ReturnsFalse_IfThereIsNoNextElement() {

        for (int i = 0; i < ELEMENTS.length - 1; i++) {
            listIterator.move();
        }

        assertFalse(listIterator.move());
    }

    @Test
    public void testHasNext_ReturnsTrue_IfThereIsNextElement() {
        for (int i = 0; i < ELEMENTS.length; i++) {
            assertTrue(listIterator.hasNext());
        }
    }

    @Test
    public void testHasNext_ReturnsFalse_IfThereIsNoNextElement() {

        for (int i = 0; i < ELEMENTS.length; i++) {
            listIterator.move();
        }

        assertFalse(listIterator.move());
    }

    @Test(expected = IllegalStateException.class)
    public void testPrint_Throws_IfNoElements() throws OperationNotSupportedException {
        ListIterator emptyIterator = new ListIterator();
        emptyIterator.print();
    }

    @Test
    public void testPrint_ReturnsElement_OnCurrentIndex() {

        for (int i = 0; i < ELEMENTS.length; i++) {
            assertEquals(ELEMENTS[i], listIterator.print());
            listIterator.move();
        }
    }
}