package epam.com.task1_3;

import com.epam.task1_3.Function;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


public class FunctionTest {
    @DataProvider(name = "dp")
    public Object[][] createSomeData() {
        return new Object[][]{
                {4.0, 3.0, 0.1, 1},
                {4.0, 5.0, 0.1, 1},
                {-4.0, -3.0, 0.1, 1},
                {1.0, 1.0, 1.0, 0},
                {0.0, 0.0, 0.0, 0},
                {1.0, 1.0, 0.1, 0},
        };
    }

    @Test(dataProvider = "dp")
    public void testFunction(double a, double b, double h, int result) throws Exception {
        Function f = new Function(a, b, h);
        Assert.assertEquals(f.function(), result);
    }
}