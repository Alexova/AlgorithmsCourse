package slidingWindow;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class ReplacingOnesTest {

    @Test
    public void findLength() {
        Assert.assertEquals( 6, ReplacingOnes.findLength(new int[] { 0, 1, 1, 0, 0, 0, 1, 1, 0, 1, 1 }, 2));
        Assert.assertEquals( 9, ReplacingOnes.findLength(new int[] { 0, 1, 0, 0, 1, 1, 0, 1, 1, 0, 0, 1, 1 }, 3));
    }
}