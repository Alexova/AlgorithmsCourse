package twoPointers;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class BackspaceCompareTest {

    @Test
    public void compare() {
        Assert.assertTrue("xz", BackspaceCompare.compare("xy#z", "xzz#"));
        Assert.assertFalse("xz and zy", BackspaceCompare.compare("xy#z", "xyz#"));
        Assert.assertTrue("x", BackspaceCompare.compare("xp#", "xyz##"));
        Assert.assertFalse("x and px", BackspaceCompare.compare("p#x", "pxyz##"));
    }
}