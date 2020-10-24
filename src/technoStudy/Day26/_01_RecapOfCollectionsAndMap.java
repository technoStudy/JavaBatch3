package technoStudy.Day26;

import java.util.*;

public class _01_RecapOfCollectionsAndMap {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        HashSet<Integer> set = new HashSet<>();
        HashMap<Integer, String> map = new HashMap<>();

        list.add("1");
        list.add("2");

        System.out.println(list);
        System.out.println(list.get(1));

        set.add(1);
        set.add(-1);
        set.add(3);

        System.out.println(set);
//        System.out.println(set.);// cannot get by index

        map.put(1, "1");
        map.put(2, "2");
        map.put(-1, "-1");

        System.out.println(map);
        System.out.println(map.get(1)); // can get by key, like getting by index

        Set<Integer> integers = map.keySet();
        Collection<String> values = map.values();
    }
}
