package technoStudy.Day16;

import java.util.Arrays;
import java.util.Random;

public class _05_ArraysBinarySearch {
    // return index of given value in sorted array, otherwise returns -1
    // if the array is not sorted the return value is not predictable
    public static void main(String[] args) {
        int[] ints = {6, 2, 3 ,5, 1, 2}; // what if you have 1000000 elements
        System.out.println(Arrays.toString(ints));
        Arrays.sort(ints);
        System.out.println(Arrays.toString(ints));

        int indexOfTheElement = Arrays.binarySearch(ints, 5);

        System.out.println(indexOfTheElement);

        int key = 5;
        for (int i = 0; i < ints.length; i++) { // this loop will be 1000000 iterations
            if(ints[i] == 5) {
                System.out.println(i);
                break;
            }
        }
    }
}
