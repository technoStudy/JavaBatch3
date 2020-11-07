package technoStudy.Day34;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MedianMethodTest {
    @Test
    public void testCase1(){
        List<Integer> input = new ArrayList<>(Arrays.asList(3, 5, 12));
        Integer expected = 5;

        ListStatistics testedClass = new ListStatistics(input);
        Integer actual = testedClass.getMedian();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testCase2(){
        List<Integer> input = new ArrayList<>(Arrays.asList(3, 13, 7, 5, 21, 23, 39, 23, 40, 23, 14, 12, 56, 23, 29));
        Integer expected = 23;

        ListStatistics testedClass = new ListStatistics(input);
        Integer actual = testedClass.getMedian();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testCase3(){
        List<Integer> input = new ArrayList<>(Arrays.asList(3, 13, 7, 5, 21, 23, 23, 40, 23, 14, 12, 56, 23, 29));
        Integer expected = 22;

        ListStatistics testedClass = new ListStatistics(input);
        Integer actual = testedClass.getMedian();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testCase4(){
        List<Integer> input = new ArrayList<>();
        Integer expected = null;

        ListStatistics testedClass = new ListStatistics(input);
        Integer actual = testedClass.getMedian();

        Assert.assertEquals(expected, actual);
    }
}
