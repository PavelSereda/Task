package epam.com.task1_1;

import com.epam.task1_1.Calculation;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


public class CalculationTest {

    @DataProvider(name = "params")
    public Object[][] createSomeData() {
        return new Object[][]{
                {2.0, 3.0,0.49321405061051643},//positive params
                {0.0, 0.0,0.5},//nulls
                {-1.0, -1.0, 0.913410905215903},//negative params
                {99999999999999999999999999999999999999999999999999999999999999999999999.0,
                        9999999999999999999999999999999999999999999999999999999.0, 1.9045914240736837E-71},//big values
        };
    }


    @Test(dataProvider = "params")
    public void testCalculation(double x, double y,double result) throws Exception {
        Calculation c = new Calculation(x, y);
        Assert.assertEquals(c.calculation(), result);
    }
}