package technoStudy.Day20;

import java.util.Arrays;

public class Task2 {
    // create a method that takes a strings and reverses it, it should return reversed string
    //
    // create a method that takes an array of strings and reverses all the strings in it,
    // it should return an array of reversed strings
    //
    // create a method that takes a 2d array of strings and reverses all the strings in it,
    // it should return a 2d array of reversed strings

    public static String reverse(String input) {
        String result = "";
        int lastIndex = input.length() - 1;
        for (int i = lastIndex; i >= 0; i--) { // start from last index, until the first index
            result += input.charAt(i);
        }
        return result;
    }

    public static String[] reverse(String[] arrayInput) {
        String[] result = new String[arrayInput.length];
        for (int i = 0; i < arrayInput.length; i++) {
//            String element = arrayInput[i];
//            String reversed = reverse(element);
//            result[i] = reversed;
            result[i] = reverse(arrayInput[i]);
        }

        return result;
    }

    public static String[][] reverse(String[][] arrayOfArrayInput) {
        String[][] result = new String[arrayOfArrayInput.length][];
        for (int i = 0; i < arrayOfArrayInput.length; i++) {
//            String[] arrayInput = arrayOfArrayInput[i];
//            String[] reversedArray = reverse(arrayInput);
//            result[i] = reversedArray;
            result[i] = reverse(arrayOfArrayInput[i]);
        }
        return result;
    }

    public static void main(String[] args) {
        String reversed = reverse("Hello");
        System.out.println(reversed);

        System.out.println();

        String[] array = {"Hello", "Techno"};
        String[] reversedArray = reverse(array);
        System.out.println(Arrays.toString(reversedArray));

        System.out.println();

        String[][] arrayOfArrays = {
                {"Hello", "Techno"},
                {"Hello", "Study"}
        };
        String[][] reversedArrayOfArrays = reverse(arrayOfArrays);
//        for (int i = 0; i < reversedArrayOfArrays.length; i++) {
//            System.out.println(Arrays.toString(reversedArrayOfArrays[i]));
//        }

        System.out.println(Arrays.deepToString(reversedArrayOfArrays));

    }
}
