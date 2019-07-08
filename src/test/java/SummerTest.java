import org.junit.Assert;
import org.junit.Test;

public class SummerTest {

    @Test
    public void summerCanSum() {
        Summer summer = new Summer();

        int result = summer.sum(1, 2);

        Assert.assertEquals(3, result);
    }

    @Test
    public void summerCanSumNegative() {
        Summer summer = new Summer();

        int result = summer.sum(1, -2);

        Assert.assertEquals(-1, result);
    }

}
