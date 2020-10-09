package technoStudy.Day15;

import java.util.Random;

public class _01_ArraysTask2 {
    // declare an array of fruits and initialize it with some values use array = {}
    // print all elements
    // part2: make a copy of that array
    public static void main(String[] args) {
        String[] fruits = {"banana", "apple", "orange"};

        for (int i = 0; i < fruits.length; i++) {
            System.out.println(fruits[i]);
        }


        // copying an array
        // step0: declare a variable of the same type as the array
        String[] copyOfFruits;

        // step1: init the copy with the same size
        copyOfFruits = new String[fruits.length];

        // step2: iterate over the array and assign each element one by one
        for (int i = 0; i < fruits.length; i++) {
            copyOfFruits[i] = fruits[i]; // copying the value with the same index
        }
        fruits[1] = "not fruit"; // this will not change the value of second element inside copyOfFruits



        System.out.println();
        for (int i = 0; i < copyOfFruits.length; i++) {
            System.out.println(copyOfFruits[i]);
        }

        System.out.println();
        String[] copyByReference = fruits; // after copying
        fruits[2] = "not fruit"; // this will change the value of third element inside copyByReference
        for (int i = 0; i < copyByReference.length; i++) {
            System.out.println(copyByReference[i]);
        }
    }
}
