package slidingWindow;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class NoRepeatSubstringTest {

    @Test
    public void findLength() {
        Assert.assertEquals(3,  NoRepeatSubstring.findLength("aabccbb"));
        Assert.assertEquals(2, NoRepeatSubstring.findLength("abbbb"));
        Assert.assertEquals(3, NoRepeatSubstring.findLength("abccde"));
    }
}