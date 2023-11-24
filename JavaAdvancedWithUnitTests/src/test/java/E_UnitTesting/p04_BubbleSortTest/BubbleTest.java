package E_UnitTesting.p04_BubbleSortTest;

import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;

import static E_UnitTesting.p04_BubbleSortTest.Bubble.sort;

public class BubbleTest {

    private final static int[] arr = new int[] {10, 5, 8, -8, 2, 22, 56, 1};

    @Test
    public void test() {
        sort(arr);

        for (int i = 0; i < arr.length - 1; i++) {
            Assert.assertTrue(arr[i] < arr[i + 1]);
        }
    }
}