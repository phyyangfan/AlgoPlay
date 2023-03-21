package common.sample;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class QuickSortTest {
    @DataProvider
    Object[][] testSortDataProvider() {
        return new Object[][] {
            {
                new int[] {},
                new int[] {},
            },
            {
                new int[] {3, 3, 2, 2, 2, 1},
                new int[] {1, 2, 2, 2, 3, 3},
            },
            {
                new int[] {4, 5, 2, 14, 25, 5, 4, 5, 2, 2, 1, 98, -34, 35},
                new int[] {-34, 1, 2, 2, 2, 4, 4, 5, 5, 5, 14, 25, 35, 98},
            },
            {
                new int[] {9, 1, 1, 1, 1, 1, 1},
                new int[] {1, 1, 1, 1, 1, 1, 9},
            },
            {
                new int[] {1, 1, 2, 5, 5, 0},
                new int[] {0, 1, 1, 2, 5, 5},
            },
        };
    }

    @Test(dataProvider = "testSortDataProvider")
    void testSort(int[] inputArray, int[] expectedSortedArray) {
        new QuickSort().sort(inputArray);
        Assert.assertEquals(inputArray.length, expectedSortedArray.length);
        for (int i = 0; i < expectedSortedArray.length; i++) {
            Assert.assertEquals(inputArray[i], expectedSortedArray[i]);
        }
    }
}
