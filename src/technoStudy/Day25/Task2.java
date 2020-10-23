package technoStudy.Day25;

import java.util.HashMap;

public class Task2 {
    // check, does this map contain key "Six", hashMap.get("Six")
    // if not put the it as "Six" = 6

    // part 2: check does this map contain key "Three"
    // if yes, change the value of it to 33
    public static void main(String[] args) {
        HashMap<String, Integer> hashMap = new HashMap<>();
        hashMap.put("One", 1);
        hashMap.put("Two", 2);
        hashMap.put("Three", 3);
        hashMap.put("Four", 4);
        hashMap.put("Five", 5);

        // part 1
//        Integer valueOfSix = hashMap.get("Six");
//        if(valueOfSix == null) { // means map does not contain "Six"
//            hashMap.put("Six", 6); // put the value
//        }
        if(!hashMap.containsKey("Six")) {
            hashMap.put("Six", 6);
        }

        // part 2
//        Integer valueOfThree = hashMap.get("Three");
//        if(valueOfThree != null) { // means map contains "Three"
//            hashMap.put("Three", 33); // update the value
//        }
        if(hashMap.containsKey("Three")) {
            hashMap.put("Three", 33);
        }

        System.out.println(hashMap);
    }
}
