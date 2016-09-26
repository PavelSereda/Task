package epam.com.task1_6;

import com.epam.task1_6.Matrix;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


public class MatrixTest {
    Matrix m = new Matrix();

    @DataProvider(name = "dp")
    public Object[][] createSomeData() {
        int[] mass = {0, 4, 3, 5, 2};
        return new Object[][]{{mass},};
    }

    @Test(dataProvider = "dp")
    public void testCreateMass(int[] mass) throws Exception {
        int[] n = new int[]{2, 0, 4, 3, 5};
        Assert.assertEquals(m.left(n, n.length), mass);
    }


    @Test
    public void testCreateMass2() throws Exception {
        int[] mass = {1, 2, 3, 4, 5};
        int[] n = new int[]{5, 1, 2, 3, 4};
        Assert.assertEquals(m.left(n, n.length), mass);
    }

    @Test
    public void testCreateMass3() throws Exception {
        int[] mass = {0, 0, 0, 0, 0};
        int[] n = new int[]{0, 0, 0, 0, 0};
        Assert.assertEquals(m.left(n, n.length), mass);
    }


}