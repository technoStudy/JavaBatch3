package technoStudy.Day24;

import java.util.ArrayList;
import java.util.HashSet;

public class _03_2D_Collections {
    public static void main(String[] args) {
        int[][] twoDimensional = new int[1][];

        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(4);
        ArrayList<ArrayList<Integer>> twoDimensionalList = new ArrayList<>(); // this is a list that can contain lists of Integers

        twoDimensionalList.add(list);
        twoDimensionalList.add(list2);

        System.out.println(twoDimensionalList);

        ArrayList<HashSet<String>> aListOfSets =  new ArrayList<>();
        HashSet<String> set1 = new HashSet<>();
        set1.add("1");
        set1.add("2");
        HashSet<String> set2 = new HashSet<>();
        set2.add("3");
        set2.add("4");
        set2.add("4");

        aListOfSets.add(set1);
        aListOfSets.add(set2);

        System.out.println(aListOfSets);
    }
}
