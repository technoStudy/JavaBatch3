package technoStudy.Day34;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DemoJUnit {

    @Test
    public void testCase1(){
        List<Integer> input = new ArrayList<>(Arrays.asList(1,2,3));
        Integer expected = 3;

        ListStatistics testedClass = new ListStatistics(input);
        Integer actual = testedClass.getMax();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testCase2(){
        List<Integer> input = new ArrayList<>(Arrays.asList(4,2,3,7));
        Integer expected = 7;

        ListStatistics testedClass = new ListStatistics(input);
        Integer actual = testedClass.getMax();

        Assert.assertEquals(expected, actual);
    }
}
