package technoStudy.Day38.task1;

import java.util.ArrayList;
import java.util.Collections;

public class ExceptionsTask1 {
    public static void main(String[] args) {
        // 1) where does exception occur
        // 2) catch and handle specific exception
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(0,1);
        arrayList.add(1,2);
        arrayList.add(2,3);
        arrayList.add(3,null);
        arrayList.get(4);
        Collections.max(arrayList);
        arrayList.add(1,2);
        arrayList.add(2,3);
        arrayList.add(0,null);
        System.out.println(arrayList);
    }
}
