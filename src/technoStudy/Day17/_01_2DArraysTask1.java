package technoStudy.Day17;

import java.util.Random;

public class _01_2DArraysTask1 {
    // declare an array of ints of size 3x3
    // give each element random value from 1 to 9
    // print all elements in rows and columns
    public static void main(String[] args) {
        int[][] ints = new int[3][3];

        Random generator = new Random();
        for (int i = 0; i < ints.length; i++) {
            for (int j = 0; j < ints[i].length; j++) {
                ints[i][j] =  generator.nextInt(8) + 1;
            }
        }

        for (int i = 0; i < ints.length; i++) {
            for (int j = 0; j < ints[i].length; j++) {
                System.out.print(ints[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
