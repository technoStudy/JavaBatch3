package technoStudy.Day19;

import java.util.Arrays;

public class Task1 {
    // create a method that takes a strings and reverses it, it should return reversed string
    //
    // create a method that takes an array of strings and reverses all the strings in it,
    // it should return an array of reversed strings
    //
    // create a method that takes a 2d array of strings and reverses all the strings in it,
    // it should return a 2d array of reversed strings
    public static String reverseIt(String string) {
        String reversed = "";
        for (int i = string.length() - 1; i >= 0; i--) {
            reversed += string.charAt(i);
        }
        return  reversed;
    }

    public static String[] reverseIt(String[] arrayOfStrings) {
        String[] reversed = new String[arrayOfStrings.length];
        for (int i = 0; i < arrayOfStrings.length; i++) {
            reversed[i] = reverseIt(arrayOfStrings[i]);
        }
        return reversed;
    }

    public static  String[][] reverseIt(String[][] arrayOfArrayOfStrings) {
        String[][] reversed =  new String[arrayOfArrayOfStrings.length][];
        for (int i = 0; i < arrayOfArrayOfStrings.length; i++) {
            reversed[i] = reverseIt(arrayOfArrayOfStrings[i]);
        }
        return reversed;
    }

    public static void main(String[] args) {
        String reversedString = reverseIt("Hello World!");
        System.out.println(reversedString);

        System.out.println();

        String[] array = {"Hello", "World!"};
        String[] reversedArray = reverseIt(array);
        System.out.println(Arrays.toString(reversedArray));

        System.out.println();

        String[][] arrayOfArrays = {
                {"Hello", "World!"},
                {"Hello", "Techno!"}
        };
        String[][] reversedArrayOfArrays = reverseIt(arrayOfArrays);
        for (int i = 0; i < reversedArrayOfArrays.length; i++) {
            System.out.println(Arrays.toString(reversedArrayOfArrays[i]));
        }

    }
}
