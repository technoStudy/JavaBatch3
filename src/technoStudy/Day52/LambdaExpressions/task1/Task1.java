package technoStudy.Day52.LambdaExpressions.task1;

import java.util.Arrays;
import java.util.Random;

interface RandomLambda {
    Integer getRandom(Integer lowerBound, Integer upperBound);
}
public class Task1 {
    public static RandomLambda impl1 = (lower, upper) -> {
        Random random = new Random();
        int randomNumber = random.nextInt(upper - lower - 1) + lower + 1;
        return randomNumber;
    };
    public static RandomLambda impl2 = (lower, upper) -> {
        Random random = new Random();
        int randomNumber = random.nextInt(upper - lower + 1) + lower;
        return randomNumber;
    };

    public static RandomLambda impl3 = (lower, upper) -> {
        Random random = new Random();
        int randomNumber = random.nextInt(upper - lower) + lower + 1;
        return randomNumber;
    };

    public static RandomLambda impl4 = (lower, upper) -> {
        Random random = new Random();
        int randomNumber = random.nextInt(upper - lower) + lower;
        return randomNumber;
    };
    public static void main(String[] args) {
        System.out.println(impl1.getRandom(1, 3));
        System.out.println(impl2.getRandom(1, 3));
        System.out.println(impl3.getRandom(1, 3));
        System.out.println(impl4.getRandom(1, 3));
    }
}
