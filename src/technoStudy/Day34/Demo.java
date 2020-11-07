package technoStudy.Day34;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Demo {
    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>(Arrays.asList(1,2,3));

        ListStatistics list1Stats = new ListStatistics(list1);

        list1Stats.printList();
    }
}
