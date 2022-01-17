package twoPointers;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class TripletSumToZeroTest {

    @Test
    public void searchTriplets() {
        Assert.assertEquals(5, TripletSumToZero.searchTriplets(new int[] { -3, 0, 1, 0, 0, 2, 1, -1, 1, -2 }).size());
        Assert.assertEquals(2, TripletSumToZero.searchTriplets(new int[] { -5, 2, -1, -2, 3 }).size());
        Assert.assertEquals(1, TripletSumToZero.searchTriplets(new int[] { 0, 0, 0 }).size());
    }
}