import org.junit.Assert;
import org.junit.Test;

public class MyFirstTest {

    @Test
    public void test(){
        int sum = 1 + 1;
        Assert.assertEquals(2, sum);
    }

    @Test
    public void failedTtest(){
        int sum = 1 + 1;
        Assert.assertEquals(3, sum);
    }
}
