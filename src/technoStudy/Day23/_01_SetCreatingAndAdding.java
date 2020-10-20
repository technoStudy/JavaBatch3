package technoStudy.Day23;

import java.util.ArrayList;
import java.util.HashSet;

public class _01_SetCreatingAndAdding {
    public static void main(String[] args) {
        HashSet<Integer> set =  new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(1);
        set.add(3);
        set.add(3);
        System.out.println(set);
        System.out.println(set.size());
        System.out.println(set.isEmpty());
        System.out.println(set.contains(4));
        System.out.println(set.contains(1));
        set.remove(2);
        System.out.println(set);
        set.clear();
        System.out.println(set);

        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(1);
        list.add(3);
        list.add(3);
        System.out.println(list);
    }
}
