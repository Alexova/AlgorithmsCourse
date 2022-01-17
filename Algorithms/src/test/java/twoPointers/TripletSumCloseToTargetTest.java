package twoPointers;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class TripletSumCloseToTargetTest {

    @Test
    public void test(){
        Assert.assertEquals(1 ,TripletSumCloseToTarget.searchTriplet(new int[] { -2, 0, 1, 2 }, 2) );
        Assert.assertEquals(0 ,TripletSumCloseToTarget.searchTriplet(new int[] { -2, 0, 1, 2 }, 0) );
        Assert.assertEquals(0 ,TripletSumCloseToTarget.searchTriplet(new int[] { -3, -1, 1, 2 }, 1) );
        Assert.assertEquals(3 ,TripletSumCloseToTarget.searchTriplet(new int[] { 1, 0, 1, 1 }, 100) );

    }
}