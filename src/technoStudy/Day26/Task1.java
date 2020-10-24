package technoStudy.Day26;

import java.util.ArrayList;

public class Task1 {
    // create a method that takes a string and a character
    // it must return an arraylist of indexes of that character inside the string
    // input = getPositions("Hello world!", 'l');
    // output = [2,3,9]
    public static void main(String[] args) {
        ArrayList<Integer> result = getPositions("Hello world!", 'l');
        System.out.println(result);
    }

    public static ArrayList<Integer> getPositions(String input, Character character) {
        ArrayList<Integer> result = new ArrayList<>();
        // iterate over input string
        for (int i = 0; i < input.length(); i++) {
            char charAt = input.charAt(i);
            // check if character at index i is the same as character from parameters
            if(charAt == character) {
                // if same, insert index i of that character in result
                result.add(i);
            }
        }
        return result;
    }
}
