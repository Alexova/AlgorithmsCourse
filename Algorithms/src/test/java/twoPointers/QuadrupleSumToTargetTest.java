package twoPointers;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class QuadrupleSumToTargetTest {

    @Test
    public void searchQuadruplets() {
        Assert.assertEquals(2, QuadrupleSumToTarget.searchQuadruplets(new int[] {4, 1, 2, -1, 1, -3}, 1).size());
        Assert.assertEquals(2, QuadrupleSumToTarget.searchQuadruplets(new int[]{2, 0, -1, 1, -2, 2}, 2).size());
    }
}