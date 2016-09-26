package epam.com.task1_7;

import com.epam.task1_7.Sort;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.Random;

public class SortTest {


    public double[] rand() {
        double[] mass = new double[10];
        Random r = new Random();
        for (int i = 0; i < mass.length; i++) {
            mass[i] = r.nextInt(1000);
        }
        return mass;
    }

    @DataProvider(name = "dp")
    public Object[][] createSomeData() {

        double[] mass = rand();
        double[] arraysSort = mass;
        Arrays.sort(arraysSort);
        return new Object[][]{{mass, arraysSort}};
    }

    @Test(dataProvider = "dp")
    public void testSort(double[] mass, double[] arraysSort) throws Exception {
        Sort s = new Sort(mass);
        Assert.assertEquals(s.sort(), arraysSort);
    }
}