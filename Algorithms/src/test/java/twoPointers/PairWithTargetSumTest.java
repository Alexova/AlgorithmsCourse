package twoPointers;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class PairWithTargetSumTest {
    @Test
    public void testSearch1(){
        int[] res = PairWithTargetSum.search(new Integer[]{1, 2, 3, 4, 6}, 6);
        Assert.assertEquals(1, res[0]);
        Assert.assertEquals(3, res[1]);
    }

    @Test
    public void testSearch2(){
        int[] res = PairWithTargetSum.search(new Integer[]{2, 5, 9, 11}, 11);
        Assert.assertEquals(0, res[0]);
        Assert.assertEquals(2, res[1]);
    }

    @Test
    public void testSearchNegative(){
        int[] res = PairWithTargetSum.search(new Integer[]{2, 5, 9, 11}, 19);
        Assert.assertEquals(-1, res[0]);
        Assert.assertEquals(-1, res[1]);
    }

}