package technoStudy.Day16;

import java.util.Arrays;
import java.util.Random;

public class _01_ArraysToStringTask1 {
    // create an array of 4 elements
    // assign each element a random value from 10 to 99
    // print the array using toString method
    // Part2: swap first and last elements, print the array again
    public static void main(String[] args) {
        int[] array = new int[4];
        Random generator = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = 10 + generator.nextInt(89);
        }
        System.out.println(Arrays.toString(array));

        int temp = array[0]; // first store the first element in temp variable
        array[0] = array[array.length - 1]; // assign value of last element to first element
        array[array.length - 1] = temp; // assign temp into last element

        System.out.println(Arrays.toString(array));
    }
}
