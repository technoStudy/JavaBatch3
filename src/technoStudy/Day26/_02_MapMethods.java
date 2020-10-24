package technoStudy.Day26;

import java.util.HashMap;

public class _02_MapMethods {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();
        map.put(1, "1");
        map.put(2, "2");
//        map.put(3, "3!"); // comment out to see difference

        System.out.println(map.getOrDefault(3, "3?"));
        System.out.println(map);

        System.out.println(map.putIfAbsent(3, "3?"));
        System.out.println(map);
    }
}
