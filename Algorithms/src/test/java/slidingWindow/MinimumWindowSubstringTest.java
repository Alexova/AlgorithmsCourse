package slidingWindow;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class MinimumWindowSubstringTest {

    @Test
    public void findSubstring() {
//        Assert.assertEquals("abdec", MinimumWindowSubstring.findSubstring("aabdec", "abc"));
        Assert.assertEquals("bca", MinimumWindowSubstring.findSubstring("abdbca", "abc"));
        Assert.assertEquals("", MinimumWindowSubstring.findSubstring("adcad", "abc"));
    }
}