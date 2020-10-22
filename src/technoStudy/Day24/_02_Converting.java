package technoStudy.Day24;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class _02_Converting {
    public static void main(String[] args) {
        // converting array to list
        Integer[] integers = new Integer[]{1,2,3,4,5};
        List<Integer> fixedSizeList = Arrays.asList(integers); // returns a fixed-size list backed by the specified array.
        // fixedSizeList.add(1); // UnsupportedOperationException
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(integers)); // good
        list.add(1); // ok, no errors

        // converting list to array
        Integer[] arrayOfIntegers = list.toArray(new Integer[0]);
        System.out.println(Arrays.toString(arrayOfIntegers));

        // converting array to set
        HashSet<Integer> set = new HashSet<>(Arrays.asList(arrayOfIntegers));
        System.out.println(set);

        // converting set to an array
        Integer[] array = set.toArray(new Integer[0]);
        System.out.println(Arrays.toString(array));

        // convert a list into set
        HashSet<Integer> integerHashSet = new HashSet<>(list);

        // convert a set into a list
        ArrayList<Integer> arrayList = new ArrayList<>(integerHashSet);
        arrayList.add(1);
        System.out.println(arrayList);
    }
}
