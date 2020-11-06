package technoStudy.Day32;

import java.util.ArrayList;
import java.util.Arrays;

public class _02_FinalReferenceVariable {
    public static void main(String[] args) {
        final String[] months = {"January","February","March","April","May","June","July","August","September","October","November","December"};

        System.out.println(Arrays.toString(months));
//        months = new String[2];
        months[3] = "Forth Months";
        System.out.println(Arrays.toString(months));

        final ArrayList<String> list = new ArrayList<>();

        list.add("1st");
        list.add("2nd");

        System.out.println(list);

//        list = new ArrayList<>();
    }
}

