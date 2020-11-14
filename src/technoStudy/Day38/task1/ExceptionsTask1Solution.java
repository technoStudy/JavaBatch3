package technoStudy.Day38.task1;

import java.util.ArrayList;
import java.util.Collections;

public class ExceptionsTask1Solution {
    public static void main(String[] args) {
        // 1) where does exception occur
        // 2) catch and handle specific exception
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(0,1);
        arrayList.add(1,2);
        arrayList.add(2,3);
        arrayList.add(3,null);
        try {
            arrayList.get(4);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Cannot get element that you requested, index not found");
        }
        try {
            Collections.max(arrayList);
        } catch (NullPointerException e) {
            System.out.println("Cannot get max of a list where null value exists");
        }
        arrayList.add(1,2);
        arrayList.add(2,3);
        arrayList.add(0,null);
        System.out.println(arrayList);
    }
}
