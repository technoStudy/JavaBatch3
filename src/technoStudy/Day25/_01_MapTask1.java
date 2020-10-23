package technoStudy.Day25;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class _01_MapTask1 {
    // create a map of zipcodes and Cities, at least 3 entries
    // get the keySet and iterate over it, print the map like below:
    // zipcode1 => city1
    // zipcode2 => city2

    // part 2: print all the keys of the map
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        map.put("0000231", "New York");
        map.put("0223250", "Atlanta");
        map.put("0033120", "New Jersey");

        Set<String> keys = map.keySet();

        for (String key: keys) {
            System.out.println(key + " => " + map.get(key));
        }

        System.out.println(keys);
    }
}
