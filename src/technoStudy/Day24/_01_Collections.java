package technoStudy.Day24;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Random;

public class _01_Collections {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        HashSet<Integer> set = new HashSet<>();

        Random generator = new Random();
        for (int i = 0; i < 5; i++) {
            list.add(generator.nextInt(10));
            set.add(generator.nextInt(10));
        }

        System.out.println(list);

        Collections.reverse(list);
        System.out.println(list);

        Collections.sort(list);
        System.out.println(list);

        Collections.sort(list, Collections.reverseOrder());
        System.out.println(list);

        Collections.rotate(list, -1); // minus will rotate to left
        System.out.println(list);

        Collections.shuffle(list);
        System.out.println(list);

        Collections.replaceAll(list, 2, 10);
        System.out.println(list);

        Integer max = Collections.max(list);
        System.out.println("Max is " + max);
        Integer min = Collections.min(list);
        System.out.println("Min is " + min);

        System.out.println(set);
        Integer maxOfSet = Collections.max(set);
        System.out.println("Max of set is " + maxOfSet);
        Integer minOfSet = Collections.min(set);
        System.out.println("Min of set is " + minOfSet);

    }
}
