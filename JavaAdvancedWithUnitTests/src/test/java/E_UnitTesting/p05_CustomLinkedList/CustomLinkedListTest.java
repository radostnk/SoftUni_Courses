package E_UnitTesting.p05_CustomLinkedList;

import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CustomLinkedListTest {

    private CustomLinkedList<String> customLinkedList;

    @Before
    public void setUp() {
        customLinkedList = new CustomLinkedList<>();
        customLinkedList.add("cat");
        customLinkedList.add("dog");
        customLinkedList.add("rabbit");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGet_Throws_IfIndexIsOutOfBounds_LowBoundary() {
        customLinkedList.get(-1);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGet_Throws_IfIndexIsOutOfBounds_HighBoundary() {
        customLinkedList.get(101);
    }

    @Test
    public void testGet_ReturnsCorrectObject() {
        String actualObject = customLinkedList.get(1);
        Assert.assertEquals("dog", actualObject);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSet_Throws_IfIndexIsOutOfBounds_LowBoundary() {
        customLinkedList.set(-1, "bug");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSet_Throws_IfIndexIsOutOfBounds_HighBoundary() {
        customLinkedList.set(3, "bug");
    }

    @Test
    public void testSet_ReturnsCorrectObject() {
        customLinkedList.set(2, "aunt");
        Assert.assertEquals("aunt", customLinkedList.get(2));
    }

    @Test
    public void testAdd_AppendsAnElement_AtTheEnd_OfNonEmptyList() {
        customLinkedList.add("caw");
        Assert.assertEquals("caw", customLinkedList.get(3));
    }

    @Test
    public void testAdd_AppendsAnElement_ToEmptyList() {
        CustomLinkedList<String> emptyList = new CustomLinkedList<>();
        emptyList.add("caw");
        Assert.assertEquals("caw", emptyList.get(0));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testRemoveAt_Throws_IfIndexIsOutOfBounds_LowBoundary() {
        customLinkedList.removeAt(-1);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testRemoveAt_Throws_IfIndexIsOutOfBounds_HighBoundary() {
        customLinkedList.removeAt(3);
    }

    @Test
    public void testRemoveAt_ReturnsTheObject_AtTheGivenIndex() {
        String actualResult = customLinkedList.removeAt(2);
        Assert.assertEquals("rabbit", actualResult);
    }

    @Test
    public void testRemoveAt_RemovesTheObject_AtTheGivenIndex() {
        customLinkedList.removeAt(1);
        Assert.assertNotEquals("dog", customLinkedList.get(1));
        Assert.assertFalse(customLinkedList.contains("dog"));
    }

    @Test
    public void testRemove_ReturnsTheIndex_OfTheRemovedObject() {
        int actualResult = customLinkedList.remove("cat");
        Assert.assertEquals(0, actualResult);
    }

    @Test
    public void testRemove_ReturnsMinusOne_IfTheObjectDoesNotExist() {
        int actualResult = customLinkedList.remove("fish");
        Assert.assertEquals(-1, actualResult);
    }

    @Test
    public void testRemove_RemovesTheGivenObject() {
        customLinkedList.remove("cat");
        Assert.assertFalse(customLinkedList.contains("cat"));
    }

    @Test
    public void testIndexOf_ReturnsTheIndex_AtTheGivenObject() {
        int actualIndex = customLinkedList.indexOf("rabbit");
        Assert.assertEquals(2, actualIndex);
    }

    @Test
    public void testIndexOf_ReturnsMinusOne_IfTheObjectDoesNotExist() {
        int actualIndex = customLinkedList.indexOf("kitty");
        Assert.assertEquals(-1, actualIndex);
    }

    @Test
    public void testContains_ReturnsTrue_IfTheObjectIsInTheList() {
        boolean actualResult = customLinkedList.contains("rabbit");
        Assert.assertTrue(actualResult);
    }

    @Test
    public void testContains_ReturnsFalse_IfTheObjectIsNotInTheList() {
        boolean actualResult = customLinkedList.contains("turtle");
        Assert.assertFalse(actualResult);
    }
}