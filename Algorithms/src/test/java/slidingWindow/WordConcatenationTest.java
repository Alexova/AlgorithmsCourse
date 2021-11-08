package slidingWindow;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class WordConcatenationTest {

    @Test
    public void findWordConcatenation1() {
        List<Integer> result = WordConcatenation.findWordConcatenation("catfoxcat", new String[]{"cat", "fox"});
        Assert.assertEquals(2, result.size());
        Assert.assertTrue(result.contains(0));
        Assert.assertTrue(result.contains(3));
    }

    @Test
    public void findWordConcatenation2() {
        List<Integer> result = WordConcatenation.findWordConcatenation("catcatfoxfox", new String[]{"cat", "fox"});
        Assert.assertEquals(1, result.size());
        Assert.assertTrue(result.contains(3));
    }

    @Test
    public void findWordConcatenation3() {
        List<Integer> result = WordConcatenation.findWordConcatenation("abdncjsjscatkdkdjkcatfoxfox", new String[]{"cat", "fox"});
        Assert.assertEquals(1, result.size());
        Assert.assertTrue(result.contains(18));
    }

    @Test
    public void findWordConcatenation4() {
        List<Integer> result = WordConcatenation.findWordConcatenation("mycatfoxcat", new String[]{"cat", "fox"});
        Assert.assertEquals(2, result.size());
        Assert.assertTrue(result.contains(2));
        Assert.assertTrue(result.contains(5));
    }

    @Test
    public void findWordConcatenation5() {
        List<Integer> result = WordConcatenation.findWordConcatenation("abdncjsjscatkdkdjkcatfoxghhhhfox", new String[]{"cat", "fox"});
        Assert.assertEquals(1, result.size());
        Assert.assertTrue(result.contains(18));
    }


}