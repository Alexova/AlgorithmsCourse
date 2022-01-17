package twoPointers;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class SortedArraySquaresTest {

    @Test
    public void makeSquares() {
        Assert.assertArrayEquals(new int[]{0, 1, 4, 4, 9}, SortedArraySquares.makeSquares(new int[] { -2, -1, 0, 2, 3 }) );
    }
}