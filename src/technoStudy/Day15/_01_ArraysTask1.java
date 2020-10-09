package technoStudy.Day15;

import java.util.Random;

public class _01_ArraysTask1 {
    // declare an array of bytes [-128, 127]
    // init it with size 3
    // give each element a random value
    // print all elements
    public static void main(String[] args) {
        byte[] array;
        array = new byte[3];

        Random random = new Random();
//        array[0] = (byte) random.nextInt(127);
//        array[1] = (byte) random.nextInt(127);
//        array[2] = (byte) random.nextInt(127);
        for (int i = 0; i < array.length; i++) { // when ever you see repetition like above, consider using loop
            array[i] = (byte) random.nextInt(127); // only positive bytes generated
        }

//        random.nextBytes(array); // fills our array with random bytes, could include negative values

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }

    }
}
