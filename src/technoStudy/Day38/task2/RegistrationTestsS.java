package technoStudy.Day38.task2;

import org.junit.Assert;
import org.junit.Test;

public class RegistrationTestsS {
    @Test
    public void test1(){
        int count = RegistrationS.countLetters("abc123");
        Assert.assertEquals(3, count);
    }
    @Test
    public void test2(){
        int count = RegistrationS.countLetters("A123");
        Assert.assertEquals(1, count);
    }
    @Test
    public void test3(){
        int count = RegistrationS.countLetters("123");
        Assert.assertEquals(0, count);
    }
    @Test(expected = IllegalArgumentException.class)
    public void test4(){
//        try {
            RegistrationS.countLetters(null);
//        } catch (IllegalArgumentException e) {
//            String message = e.getMessage();
//            Assert.assertEquals("The input cannot be null", message);
//            throw e;
//        }
        // if want to check the exception message, then catch and re-throw
    }


    @Test
    public void test5(){
        int count = RegistrationS.countNumbers("abc123");
        Assert.assertEquals(3, count);
    }
    @Test
    public void test6(){
        int count = RegistrationS.countNumbers("A123");
        Assert.assertEquals(3, count);
    }
    @Test
    public void test7(){
        int count = RegistrationS.countNumbers("123");
        Assert.assertEquals(3, count);
    }

    @Test(expected = IllegalArgumentException.class)
    public void test8(){
        RegistrationS.countNumbers(null);
    }
}
