package twoPointers;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class ShortestWindowSortTest {

    @Test
    public void sort() {
        Assert.assertEquals("Sort 5, 3, 7, 10, 9", 5, ShortestWindowSort.sort(new int[]{1, 2, 5, 3, 7, 10, 9, 12}));
        Assert.assertEquals("Sort 1, 2, 2, 0, -1", 5, ShortestWindowSort.sort(new int[]{1, 3, 2, 0, -1, 7, 10}));
        Assert.assertEquals("Array is sorted", 0, ShortestWindowSort.sort(new int[]{1, 2, 3}));
        Assert.assertEquals("Sort 3, 2, 1",3, ShortestWindowSort.sort(new int[]{3, 2, 1}));
    }
}