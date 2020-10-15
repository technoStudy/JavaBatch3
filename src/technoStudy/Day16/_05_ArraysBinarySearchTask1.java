package technoStudy.Day16;

import java.util.Arrays;

public class _05_ArraysBinarySearchTask1 {
    // create an array of fruits
    // sort the array
    // search for index of you favorite fruit
    public static void main(String[] args) {
        String[] fruits = {"banana", "apple", "orange", "peach", "watermelon"};
        Arrays.sort(fruits);
        int watermelon = Arrays.binarySearch(fruits, "watermelon");
        System.out.println(fruits[watermelon] + " is at index " + watermelon);
    }
}
