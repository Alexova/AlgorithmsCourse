package slidingWindow;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class MaxFruitCountOf2TypesTest {

    @Test
    public void findLength() {
        Assert.assertEquals(3,
                MaxFruitCountOf2Types.findLength(new char[]{'A', 'B', 'C', 'A', 'C'}));
        Assert.assertEquals(5, MaxFruitCountOf2Types.findLength(new char[]{'A', 'B', 'C', 'B', 'B', 'C'}));
    }
}