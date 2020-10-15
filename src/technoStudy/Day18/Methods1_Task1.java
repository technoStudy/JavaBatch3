package technoStudy.Day18;

import java.util.Arrays;
import java.util.Random;

public class Methods1_Task1 {
    // create an array of size 5, assign some random values from 1 to 10
    // create a method that prints array like "2 3 1 10 2", space between elements of array
    // part 2: create a method that prints the sum of an array
    // part 3: create a method that prints the max element of an array
    public static void main(String[] args) {
        int[] array =  new int[5];

        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(9) + 1;
        }

        // call method to print array, pass in array inside the parentheses
        printAnArray(array);
        // call method to print the sum of the array, pass in array inside the parentheses
        printASumOfArray(array);

        printAnArray(array);
        printMaxOfArray(array);
        printAnArray(array);

    }

    // create method definition to print array, method argument should be an array of ints,
    // return type should be void because we just printing, not returning anything
    public static void printAnArray(int[] theArrayToPrint){
        for (int i = 0; i < theArrayToPrint.length; i++) {
            System.out.print(theArrayToPrint[i] + " ");
        }
        System.out.println();
    }

    public static void printASumOfArray(int[] theArray){
        int sum = 0;
        for (int i = 0; i < theArray.length; i++) {
            sum += theArray[i];
        }
        System.out.println("The array sum is " + sum);
    }

    public static void printMaxOfArray(int[] theArray){
        int max = theArray[0];
        for (int i = 0; i < theArray.length; i++) {
            if(theArray[i] > max){
                max =  theArray[i];
            }
        }
        System.out.println("The max element is " + max);
    }
}
