package technoStudy.Day32.task2;

import java.util.Arrays;

public class Months {
    final static String[] months = {"January","February","March","April","May","June","July","August","September","October","November","December"};

    public static void main(String[] args) {
        System.out.println(Arrays.toString(months));
        months[1] = "Other";
        System.out.println(Arrays.toString(months));
    }
}
