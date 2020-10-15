package technoStudy.Day16;

import java.util.Arrays;

public class _02_ArraysFillIn {
    public static void main(String[] args) {
        int[] ints = new int[4];

        System.out.println(Arrays.toString(ints));

        Arrays.fill(ints, 99);

        System.out.println(Arrays.toString(ints));

        int value = 55;
        for (int i = 0; i < ints.length; i++) {
            ints[i] = value;
        }

        System.out.println(Arrays.toString(ints));
    }
}
