import org.junit.jupiter.api.Test;
import org.testng.Assert;

import java.math.BigDecimal;

/**
 * Created by jarek on 4/24/17.
 */
class powerSumTest extends powerSum {

    @Test
    public void testPower() {
        powerSum ps = new powerSum();
        Assert.assertEquals(BigDecimal.valueOf(8.0), ps.powerCalculate(2, 3));
        Assert.assertEquals(BigDecimal.valueOf(16.0), ps.powerCalculate(2, 4));
    }

    @Test
    public void testPowerSum() {
        powerSum ps = new powerSum();
        Assert.assertEquals(7, ps.powerSum(ps.powerCalculate(2,4)));

    }
}