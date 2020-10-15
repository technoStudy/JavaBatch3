package technoStudy.Day16;

import java.util.Arrays;

public class _03_ArraysEquals {
    // check if both of arrays have same order of values
    public static void main(String[] args) {
        int[] first = { 1, 3, 9 };
        int[] second = { 1, 4, 9 };
        int[] third = { 1, 3, 9 };

        System.out.println(Arrays.equals(first, second));
        System.out.println(Arrays.equals(first, third));
        System.out.println(Arrays.equals(second, third));

//        int[]
    }
}
