package epam.com.task1_2;

import com.epam.task1_2.Checker;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


public class CheckerTest {
    @DataProvider(name = "dp")
    public Object[][] createSomeData() {
        return new Object[][]{
                {6.0, -3.0, true},//positive params
                {-6.0, -3.0, true},//positive params
                {4.0, 5.0, true},//positive params
                {-4.0, 5.0, true},//positive params
                {0.0, 0.0, true},//positive params
                {0.0, 0.0, true},//nulls
                {6.0, -4.0, false},//negative params
                {-7.0, -3.0, false},//negative
                {5.0, 5.0, false},//negative params
                {-4.0, 6.0, false},//negative params
                {99999999999999999999999999999999999999999999999999999999999999999999999.0,
                        9999999999999999999999999999999999999999999999999999999.0, false},//big values
        };
    }

    @Test(dataProvider = "dp")
    public void testChecker(double x, double y, boolean result) throws Exception {
        Checker c = new Checker(x, y);
        Assert.assertEquals(c.checker(), result);
    }
}