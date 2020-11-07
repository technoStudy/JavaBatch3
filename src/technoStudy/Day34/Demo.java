package technoStudy.Day34;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Demo {
    public static void main(String[] args) {
//        testCase1();
//        testCase2();
//        testCase3();
        testCase4();
    }

    private static void testCase1() {
        List<Integer> list1 = new ArrayList<>(Arrays.asList(1,2,3));
        ListStatistics list1Stats = new ListStatistics(list1);
        Integer actual = list1Stats.getMax();
        Integer expected = 3;

        if(expected.equals(actual)){
            System.out.println("Test case 1 is correct!");
        } else {
            System.out.println("Test case 1 is incorrect, expected " + expected + " but got " + actual);
        }
    }

    private static void testCase2() {
        List<Integer> list1 = new ArrayList<>(Arrays.asList(4,2,3,7));
        Integer expected = 7;

        ListStatistics list1Stats = new ListStatistics(list1);
        Integer actual = list1Stats.getMax();

        if(expected.equals(actual)){
            System.out.println("Test case 2 is correct!");
        } else {
            System.out.println("Test case 2 is incorrect, expected " + expected + " but got " + actual);
        }
    }

    private static void testCase3() {
        List<Integer> list1 = new ArrayList<>(Arrays.asList(10,2,3,7));
        Integer expected = 10;

        ListStatistics list1Stats = new ListStatistics(list1);
        Integer actual = list1Stats.getMax();

        if(expected.equals(actual)){
            System.out.println("Test case 3 is correct!");
        } else {
            System.out.println("Test case 3 is incorrect, expected " + expected + " but got " + actual);
        }
    }

    private static void testCase4() {
        List<Integer> list1 = new ArrayList<>();
        Integer expected = null;

        ListStatistics list1Stats = new ListStatistics(list1);
        Integer actual = list1Stats.getMax();

        if(expected == actual){
            System.out.println("Test case 4 is correct!");
        } else {
            System.out.println("Test case 4 is incorrect, expected " + expected + " but got " + actual);
        }
    }
}
