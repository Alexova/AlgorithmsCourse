package slidingWindow;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class StringAnagramsTest {

    @Test
    public void findStringAnagrams() {
        Assert.assertEquals(Arrays.asList(1, 2), StringAnagrams.findStringAnagrams("ppqp", "pq"));
        Assert.assertEquals(Arrays.asList(2, 3, 4), StringAnagrams.findStringAnagrams("abbcabc", "abc"));
        Assert.assertEquals(Arrays.asList(6), StringAnagrams.findStringAnagrams("abbdcdabc", "abc"));
    }
}