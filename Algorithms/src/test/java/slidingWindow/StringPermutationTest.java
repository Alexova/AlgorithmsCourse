package slidingWindow;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static org.junit.Assert.*;

public class StringPermutationTest {

    @Test
    public void findPermutation() {
        Assert.assertTrue(StringPermutation.findPermutation("oidbcaf", "abc"));
        Assert.assertTrue(StringPermutation.findPermutation("bcdxabcdy", "bcdyabcdx"));
        Assert.assertTrue(StringPermutation.findPermutation("aaacb", "abc"));
        Assert.assertFalse(StringPermutation.findPermutation("odicf", "dc"));
        Assert.assertFalse(StringPermutation.findPermutation("bcdxabcdkbcdyabcdfbcdybcdx", "bcdyabcdx"));



        String val = "JIRA-89 COLLAB-42 and SOLC-76";
        Pattern pattern = Pattern.compile("((?<!([A-Z]{1,10})-?)[A-Z]+-\\d+)");
        Matcher matcher = pattern.matcher(val);
        List<String> result = new ArrayList<>();
//        Assert.assertTrue(matcher.matches());
        while (matcher.find()) {
            result.add(matcher.group());
        }
        Assert.assertEquals(result.size(), 2);

    }
}