package technoStudy.Day38.task3;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

public class TaskTestsSolution {
    @Test
    public void test1(){
        String string = "1";
        ArrayList<Double> list = new ArrayList<>();
        boolean result = Task3Solution.addPriceToList(string, list);
//        Assert.assertEquals(true, result);
        Assert.assertTrue(result);
    }

    @Test
    public void test2(){
        String string = "a";
        ArrayList<Double> list = new ArrayList<>();
        boolean result = Task3Solution.addPriceToList(string, list);
        Assert.assertFalse(result);
    }

    @Test
    public void test3(){
        String string = null;
        ArrayList<Double> list = new ArrayList<>();
        boolean result = Task3Solution.addPriceToList(string, list);
        Assert.assertFalse(result);
    }

    @Test
    public void test4(){
        String string = "1";
        ArrayList<Double> list = new ArrayList<>(Arrays.asList(1.0));
        boolean result = Task3Solution.addPriceToList(string, list);
        Assert.assertTrue(result);
        Assert.assertEquals(2, list.size());
    }

    @Test(expected = RuntimeException.class)
    public void test5(){
        String string = "1";
        ArrayList<Double> list = null;
        Task3Solution.addPriceToList(string, list);
    }

    @Test
    public void test6(){
        String string = "";
        ArrayList<Double> list = new ArrayList<>();
        boolean result = Task3Solution.addPriceToList(string, list);
        Assert.assertFalse(result);
    }

    @Test(expected = Exception.class)
    public void test7() throws Exception {
        ArrayList<Double> list = new ArrayList<>();
        Task3Solution.getAverage(list);
    }

    @Test
    public void test8() throws Exception {
        ArrayList<Double> list = new ArrayList<>(Arrays.asList(1.0));
        Double average = Task3Solution.getAverage(list);
        Assert.assertEquals(new Double(1.0), average);
    }

    @Test
    public void test9() throws Exception {
        ArrayList<Double> list = new ArrayList<>(Arrays.asList(1.0, 2.0, 3.0));
        Double average = Task3Solution.getAverage(list);
        Assert.assertEquals(new Double(2.0), average);
    }

    @Test(expected = NullPointerException.class)
    public void test10() throws Exception {
        ArrayList<Double> list = null;
        Task3Solution.getAverage(list);
    }
}
