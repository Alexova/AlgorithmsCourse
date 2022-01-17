package twoPointers;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class RemoveDuplicatesTest {

    @Test
    public void remove() {
        Assert.assertEquals(4, RemoveDuplicates.remove( new int[] { 2, 3, 3, 3, 6, 9, 9 }) );
        Assert.assertEquals(2, RemoveDuplicates.remove( new int[] {  2, 2, 2, 11 }) );
        Assert.assertEquals(5, RemoveDuplicates.remove( new int[] {  1, 2, 3, 4, 5 }) );
    }
}