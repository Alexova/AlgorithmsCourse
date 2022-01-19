package fastAndSlow;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class HappyNumberTest {

    @Test
    public void find() {
        Assert.assertTrue(HappyNumber.find(23));
        Assert.assertFalse(HappyNumber.find(12));
    }
}