package slidingWindow;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class MinSizeSubArraySumTest {

    @Test
    public void findMinSubArray() {
        Assert.assertEquals(2, MinSizeSubArraySum.findMinSubArray(7, new int[]{2, 1, 5, 2, 3, 2}));
        Assert.assertEquals(1, MinSizeSubArraySum.findMinSubArray(7, new int[]{2, 1, 5, 2, 8}));
        Assert.assertEquals(3, MinSizeSubArraySum.findMinSubArray(8, new int[]{3, 4, 1, 1, 6}));
    }

    @Test
    public void findMinSubArrayNotFound() {
        Assert.assertEquals(0, MinSizeSubArraySum.findMinSubArray(77, new int[]{2, 1, 5, 2, 3, 2}));
    }
}