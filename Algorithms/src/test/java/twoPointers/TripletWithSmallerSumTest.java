package twoPointers;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class TripletWithSmallerSumTest {

    @Test
    public void searchTriplets() {
        Assert.assertEquals(2, TripletWithSmallerSum.searchTriplets(new int[]{-1, 0, 2, 3}, 3));
        Assert.assertEquals(4, TripletWithSmallerSum.searchTriplets(new int[]{-1, 4, 2, 1, 3}, 5));
    }
}