package slidingWindow;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class MaxSumSubArrayOfSizeKTest {

    @Test
    public void findMaxSumSubArray() {
        Assert.assertEquals(9, MaxSumSubArrayOfSizeK.findMaxSumSubArray(3, new int[]{2, 1, 5, 1, 3, 2}));
        Assert.assertEquals(7, MaxSumSubArrayOfSizeK.findMaxSumSubArray(2, new int[]{2, 3, 4, 1, 5}));
    }
}