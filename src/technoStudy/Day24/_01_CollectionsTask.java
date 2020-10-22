package technoStudy.Day24;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class _01_CollectionsTask {
    // create list of 5 numbers from user input
    // sort the list in reverse order(!= reversing) and print it
    // shuffle the list and print it
    // rotate right by 3 places and print it

    // part 2: find the max number and min number, print them
    // replace all max number with min number
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            list.add(scanner.nextInt());
        }

        System.out.println(list);

        Collections.sort(list, Collections.reverseOrder());
        System.out.println(list);

        Collections.shuffle(list);
        System.out.println(list);

        Collections.rotate(list, 3);
        System.out.println(list);

        Integer max = Collections.max(list);
        System.out.println(max);
        Integer min = Collections.min(list);
        System.out.println(min);

        Collections.replaceAll(list, max, min);
        System.out.println(list);
    }
}
