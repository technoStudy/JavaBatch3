package technoStudy.Day49.task3;

import org.junit.Assert;
import org.junit.Test;

public class StringSetTest2 {
    @Test
    public void test1(){
        StringSet set = new StringSetImplementation2();
        set.add("1");
        Assert.assertEquals(1, set.size());
    }

    @Test
    public void test2(){
        StringSet set = new StringSetImplementation2();
        set.add("1");
        set.add("2");
        Assert.assertEquals(2, set.size());
    }

    @Test
    public void test3(){
        StringSet set = new StringSetImplementation2();
        set.add("1");
        set.remove("1");
        Assert.assertEquals(0, set.size());
    }
    @Test
    public void test4(){
        StringSet set = new StringSetImplementation2();
        set.add("1");
        set.add("1");
        Assert.assertEquals(1, set.size());
    }
}
