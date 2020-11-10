package technoStudy.Day35._02_manipulatingDateAndTime.task;

import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class TasksSolution {
    @Test
    public void task1(){
        LocalDate now = LocalDate.now();
        Assert.assertEquals("2020-11-10", now.toString());
    }

    // task2
    // test that date 5 days ago is 2020-11-04
    @Test
    public void task2(){
        LocalDate now = LocalDate.now();
        Assert.assertEquals("2020-11-05", now.minusDays(5).toString());
    }

    // task3
    // test that time 2 hours from now is 10pm -> 22
    @Test
    public void task3(){
        LocalTime now = LocalTime.now();
        Assert.assertEquals(22, now.plusHours(2).getHour());
    }

    // task4
    // create a dateTime for April 1, 1996, 3:11pm
    // test that date time is "1996-04-01T15:11"
    @Test
    public void task4(){
        LocalDateTime localDateTime = LocalDateTime.of(1996, 4, 1, 15, 11);
        Assert.assertEquals("1996-04-01T15:11", localDateTime.toString());
    }

}
