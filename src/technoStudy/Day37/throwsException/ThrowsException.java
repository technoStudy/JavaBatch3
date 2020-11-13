package technoStudy.Day37.throwsException;

import java.util.Random;

public class ThrowsException {
    public static void main(String[] args) {
        method1();

        try {
            method2();
            System.out.println("This message sometimes will not be printed");
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

    public static void method1() {
        System.out.println("method 1");
        Random random = new Random();
        boolean shouldThrow = random.nextBoolean();
        if(shouldThrow) {
            throw new RuntimeException("Exception in Method 1!");
        }
    }

    public static void method2() throws Exception {
        System.out.println("Method 2");
        Random random = new Random();
        boolean shouldThrow = random.nextBoolean();
        if(shouldThrow) {
            throw new Exception("Exception in Method 2!");
        }
    }
}
