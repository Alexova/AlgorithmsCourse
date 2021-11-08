package slidingWindow;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class LongestSubstringKDistinctTest {

    @Test
    public void findLength() {
        Assert.assertEquals(4, LongestSubstringKDistinct.findLength("araaci", 2));
        Assert.assertEquals(2, LongestSubstringKDistinct.findLength("araaci", 1));
        Assert.assertEquals(5, LongestSubstringKDistinct.findLength("cbbebi", 3));
    }
}