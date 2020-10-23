package technoStudy.Day25;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class _01_Map {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap();

        map.put("QA Tester", 150000);
        map.put("QA Tester", 180000);
        map.put("SDET Engineer", 200000);
        map.put("SDET", 210000);

        System.out.println(map);

        Integer salary = map.get("SDET Engineer");
        System.out.println("SDET Engineer: " + salary);

        // getting set of keys
        Set<String> keys = map.keySet();
        System.out.println(keys);

        for (String key: keys) {
            Integer value = map.get(key);
            System.out.println(key +" = " + value);
        }

        // getting list of values
        Collection<Integer> values = map.values();
        for (Integer value: values) {
            System.out.println(value);
        }

        // getting entries from map
        Set<Map.Entry<String, Integer>> entries = map.entrySet();
        for (Map.Entry<String, Integer> entry : entries) {
            String key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println(key +" = " + value);
        }

        int size = map.size(); // how many entries are inside
        System.out.println(size);

        boolean isEmpty = map.isEmpty();
        System.out.println(isEmpty);

        map.clear();
        System.out.println(map.isEmpty());
        System.out.println(map);
    }
}
