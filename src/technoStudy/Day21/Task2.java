package technoStudy.Day21;

import java.util.ArrayList;
import java.util.Random;

public class Task2 {
    // create a method that will create an arrayList of integers with 5 random numbers(1 to 10) and return it

    // part2: create a method that updates the middle element to the element that's provided in parameter
    // [3, 4, 1, 6, 9]  -> provided parameter 100 -> [3, 4, 100, 6, 9]

    public static ArrayList<Integer> createRandomList(){
        ArrayList<Integer> result = new ArrayList<>();
        Random generator = new Random();

//        result.add(generator.nextInt(9)+1);
//        result.add(generator.nextInt(9)+1);
//        result.add(generator.nextInt(9)+1);
//        result.add(generator.nextInt(9)+1);
//        result.add(generator.nextInt(9)+1);

        for (int i = 0; i < 5; i++) {
            result.add(generator.nextInt(9)+1);
        }

        return  result;
    }

    public static void updateMiddleElement(ArrayList<Integer> list, Integer element) {
        int middleIndex = list.size() / 2;
        list.set(middleIndex, element);
    }

    public static void main(String[] args) {
        ArrayList<Integer> firstList = createRandomList();
        System.out.println(firstList);

        updateMiddleElement(firstList, 100);
        System.out.println(firstList);
    }
}
