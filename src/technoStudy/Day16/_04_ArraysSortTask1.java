package technoStudy.Day16;

import java.util.Arrays;
import java.util.Random;

public class _04_ArraysSortTask1 {
    // create an int array of random numbers of size 5
    // sort the array
    // print the first element as min
    // print the last element as max
    // print the middle element as middle
    public static void main(String[] args) {
        int[] array = new int[6];

        Random generator = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = 10 + generator.nextInt(89);
        }
        System.out.println(Arrays.toString(array));
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
        System.out.println("smallest: " + array[0]);
        System.out.println("biggest: " + array[array.length - 1]);
        System.out.println("middle: " + array[array.length/2]);
    }
}
