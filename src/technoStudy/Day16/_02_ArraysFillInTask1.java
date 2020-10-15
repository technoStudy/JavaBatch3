package technoStudy.Day16;

import java.util.Arrays;

public class _02_ArraysFillInTask1 {
    // create an array of strings of size 10
    // print the array
    // fill in with value "*"
    // print the array
    public static void main(String[] args) {
        String[] list = new String[10];
        System.out.println(Arrays.toString(list));
        Arrays.fill(list, "*");
        System.out.println(Arrays.toString(list));
    }
}
