package technoStudy.Day25;

import java.util.*;

public class Task3 {
    // create a map groups and members of group
    // "Group1" = ["Member1", "Member2"]
    // "Group2" = ["Member3", "Member4", "Member5"]

    // part2: count how many members each group has

    // part3: store inside a new map, the number of members each group has
    // "Group1" = 2
    // "Group2" = 3
    public static void main(String[] args) {
        //Part 1
        HashMap<String, ArrayList<String>> map = new HashMap<>();
        ArrayList<String> list1 = new ArrayList<>(Arrays.asList("Member1", "Member2"));
        ArrayList<String> list2 = new ArrayList<>(Arrays.asList("Member3", "Member4", "Member5"));

        map.put("Group1", list1);
        map.put("Group2", list2);

        System.out.println(map);

        //Part 2
        Set<String> groups = map.keySet();
        for (String group: groups) {
            ArrayList<String> members = map.get(group);
            System.out.println(group + " has " + members.size() + " members");
        }

        // Part 3
        HashMap<String, Integer> memberCounts = new HashMap<>();
        Set<Map.Entry<String, ArrayList<String>>> entries = map.entrySet();

        for(Map.Entry<String, ArrayList<String>> entry: entries) {
            String groupName = entry.getKey();
            int memberCount = entry.getValue().size();
            memberCounts.put(groupName, memberCount);
        }

        System.out.println(memberCounts);

    }
}
