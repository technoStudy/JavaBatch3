package technoStudy.Day52.LambdaExpressions;

import java.util.ArrayList;

public class _02_SimpleLambdaWithCodeBlock {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(5);
        numbers.add(9);
        numbers.add(8);
        numbers.add(1);

        for (Integer numInteger : numbers) {
            System.out.print(numInteger);
        }
        System.out.println();
        numbers.forEach(n -> {
            n = n * 2;
            System.out.print(n);
        }); // using lambda
        System.out.println();
        System.out.println(numbers);
    }
}

