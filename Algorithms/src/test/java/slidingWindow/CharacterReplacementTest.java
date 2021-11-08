package slidingWindow;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class CharacterReplacementTest {

    @Test
    public void findLength() {
        Assert.assertEquals(5, CharacterReplacement.findLength("aabccbb", 2));
        Assert.assertEquals(4, CharacterReplacement.findLength("abbcb", 1));
        Assert.assertEquals(3, CharacterReplacement.findLength("abccde", 1));
    }
}