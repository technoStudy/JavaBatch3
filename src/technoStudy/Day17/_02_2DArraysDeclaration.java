package technoStudy.Day17;

import java.util.Arrays;
import java.util.Random;

public class _02_2DArraysDeclaration {
    public static void main(String[] args) {
        int[] oneDimensional = new int[4];

//        int[][] twoDimensional = new int[][];
        int[][] twoDimensional = new int[3][];


        for (int i = 0; i < twoDimensional.length; i++) {
            System.out.println(twoDimensional[i]);
        }
        // twoDimensional[0] = null
        // twoDimensional[1] = null
        // twoDimensional[2] = null

        for (int i = 0; i < twoDimensional.length; i++) {
            twoDimensional[i] = new int[4];
            System.out.println(Arrays.toString(twoDimensional[i]));
        }
        // twoDimensional[0] = [0,0,0,0]
        // twoDimensional[1] = [0,0,0,0]
        // twoDimensional[2] = [0,0,0,0]

        System.out.println();
        for (int i = 0; i < twoDimensional.length; i++) {
            twoDimensional[i] = new int[i+1];
            System.out.println(Arrays.toString(twoDimensional[i]));
        }
        // twoDimensional[0] = [0]
        // twoDimensional[1] = [0,0]
        // twoDimensional[2] = [0,0,0]
    }
}
