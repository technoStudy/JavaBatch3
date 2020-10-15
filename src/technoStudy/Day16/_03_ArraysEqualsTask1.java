package technoStudy.Day16;

import java.util.Arrays;

public class _03_ArraysEqualsTask1 {
    // create an String array of {"1", "2"}
    // create an int array of {1, 2}
    // convert String array into int array
    // compare them together
    public static void main(String[] args) {
        String[] strings = {"1", "2"};
        int[] ints = {1, 2};

        // create an int array of the same size as Strings array to hold the converted values
        int[] converted = new int[strings.length];
        System.out.println(Arrays.toString(converted));
        // iterate over the Strings array
        for (int i = 0; i < strings.length; i++) {
            // convert and copy values one by one
            String element = strings[i];
            int parsedInt = Integer.parseInt(element);
            converted[i] =  parsedInt;
        }
        System.out.println(Arrays.toString(converted));
        // compare the ints array and converted array
        System.out.println(Arrays.equals(ints, converted));
    }
}
