import org.apache.commons.lang3.StringUtils;
import org.redrover.Utils;
import org.testng.Assert;
import org.testng.annotations.Test;
public class TestUtils {
    @Test
    public void testSum() {
        Assert.assertEquals(Utils.sum(4,5), 9);
    }
    @Test
    public void testAbbr(){
        Assert.assertEquals(Utils.abbr("1234567890",9),"123456...");
    }
    @Test
    public void testAbbrApache(){
        Assert.assertEquals(StringUtils.abbreviate("1234567890",9),"123456...");
    }

}
