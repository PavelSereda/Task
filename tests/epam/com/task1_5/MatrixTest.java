package epam.com.task1_5;

import com.epam.task1_5.Matrix;
import org.testng.Assert;
import org.testng.annotations.Test;


public class MatrixTest {

    @Test
    public void testMinCountSimple() throws Exception {
        int[] a = new int[]{1, 2, 3, 2, 4};
        int n = a.length;
        int[] d = new int[n];
        Matrix m = new Matrix(a, n, d);
        m.minCount();
        Assert.assertEquals(m.minCount(), 1);
    }


    @Test
    public void testMinCountDifficult() throws Exception {
        int[] a = new int[]{2, 2, 3, 1, 1, 5, 6, 3, 3, 3};
        int n = a.length;
        int[] d = new int[n];
        Matrix m = new Matrix(a, n, d);
        m.minCount();
        Assert.assertEquals(m.minCount(), 6);
    }

    @Test
    public void testMinCountNull() throws Exception {
        int[] a = new int[]{1, 2, 3, 4};
        int n = a.length;
        int[] d = new int[n];
        Matrix m = new Matrix(a, n, d);
        m.minCount();
        Assert.assertEquals(m.minCount(), 0);
    }

}