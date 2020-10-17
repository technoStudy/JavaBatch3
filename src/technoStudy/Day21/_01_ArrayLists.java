package technoStudy.Day21;

import java.util.ArrayList;

public class _01_ArrayLists {
    public static void main(String[] args) {
        int[] array = new int[2];
        ArrayList<Integer> arrayList = new ArrayList<>();
        // adding element
        arrayList.add(1);
        arrayList.add(2);

        // getting element at specific index
        Integer integer = arrayList.get(1);
        System.out.println(integer);

        // add at specific index
        arrayList.add(1, 3);
        integer = arrayList.get(1);
        System.out.println(integer);

        // print the array list
        System.out.println(arrayList);

        // add will append at the end of the list
        arrayList.add(4);
        System.out.println(arrayList);

        Integer numberOne = 1;
        // remove the first occurrence of the element
        arrayList.remove(numberOne);

        System.out.println(arrayList);

        // remove element at specific index
        arrayList.remove(1);
        System.out.println(arrayList);

        // set element at specific index (index, element)
        arrayList.set(0, 5);
        System.out.println(arrayList);

        // get the number of element inside the list
        int size = arrayList.size();
        System.out.println(size);

        // remove all the elements inside
        arrayList.clear();
        System.out.println(arrayList.size());

        // check is arraylist is empty
        boolean empty = arrayList.isEmpty();
        System.out.println(empty);
    }
}
