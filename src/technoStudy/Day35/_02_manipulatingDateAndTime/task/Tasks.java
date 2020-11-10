package technoStudy.Day35._02_manipulatingDateAndTime.task;

import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;

public class Tasks {
    @Test
    public void task1(){
        LocalDate now = LocalDate.now();
        Assert.assertEquals("2020-11-10", now.toString());
    }

    // task2
    // test that date 5 days ago is 2020-11-04
}
