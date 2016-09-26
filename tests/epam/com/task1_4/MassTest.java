package epam.com.task1_4;

import com.epam.task1_4.Mass;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class MassTest {

    @DataProvider(name = "dp")
    public Object[][] createSomeData() {
        return new Object[][]{
                {2, true},
                {3, true},
                {5, true},
                {7, true},
                {11, true},
                {13, true},
                {17, true},
                {157, true},
                {0, false},
                {1, false},
                {4, false},
                {6, false},
                {8, false},
                {10, false},
                {18, false},
        };
    }

    @Test(dataProvider = "dp")
    public void testCheckNumber(int number, boolean check) throws Exception {
        int n = 10;
        int[] mass = new int[n];
        Mass m = new Mass(n, mass);
        Assert.assertEquals(m.checkNumber(number), check);
    }
}