package twoPointers;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class DutchFlagTest {

    @Test
    public void sort() {
        int[] arr = new int[] { 1, 0, 2, 1, 0 };
        DutchFlag.sort(arr);
        Assert.assertArrayEquals(new int[] {0, 0, 1, 1, 2}, arr);

        System.out.println();

        arr = new int[] { 2, 2, 0, 1, 2, 0 };
        DutchFlag.sort(arr);
        Assert.assertArrayEquals(new int[]{0, 0, 1, 2, 2, 2}, arr);
    }
}