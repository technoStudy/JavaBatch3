package technoStudy.Day15;

import java.util.Random;

public class _01_ArraysTask4 {
    // declare an array of ints of size 10
    // give each element random value from 1 to 100
    // print all elements in same line
    // print the min(smallest) and max(largest) elements in separate lines
    public static void main(String[] args) {
        int[] array =  new int[10];

        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(99) + 1;
            System.out.println(array[i]);
        }

        int smallest = array[0]; // let's assume that first element is the smallest
        for (int i = 0; i < array.length; i++) {
            if(array[i] < smallest) { // check if the next element is smaller than current smallest
                smallest = array[i]; // if yes, assign current smallest to that element
            }
        }
        System.out.println("Smallest: " + smallest);

        int largest = array[9]; // let's assume that last element is the largest
        for (int i = 0; i < array.length; i++) {
            if(array[i] > largest) { // check if the current element is larger that the assumed largest element
                largest = array[i]; // if yes, not assume that current element is the largest, so we assign it to largest
            }
        }
        System.out.println("Largest: " + largest);

    }
}
