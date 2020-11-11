package technoStudy.Day36.task2;

import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;

public class Tests {
    @Test
    public void test1() {
        LocalDate localDate = Task2Solution.convertToDate("05 05 1995");
        Assert.assertEquals(LocalDate.of(1995, 5, 5), localDate);
    }

    @Test
    public void test2() {
        LocalDate localDate = Task2Solution.convertToDate("05/05/1995");
        Assert.assertEquals(LocalDate.of(1995, 5, 5), localDate);
    }

    @Test
    public void test3() {
        LocalDate localDate = Task2Solution.convertToDate("05.05.1995");
        Assert.assertEquals(LocalDate.of(1995, 5, 5), localDate);
    }

    @Test
    public void test4() {
        LocalDate localDate = Task2Solution.convertToDate("05-05-1995");
        Assert.assertEquals(LocalDate.of(1995, 5, 5), localDate);
    }

    @Test
    public void test5() {
        LocalDate localDate = Task2Solution.convertToDate(null);
        Assert.assertEquals(null, localDate);
    }

    @Test
    public void test6() {
        LocalDate localDate = Task2Solution.convertToDate("55-05-1995");
        Assert.assertEquals(null, localDate);
    }
}
