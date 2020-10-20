package technoStudy.Day23;

import java.util.ArrayList;
import java.util.HashSet;

public class _01_SetCreatingAndAddingTask {
    // create a String[] array of student name in your group, you might make duplicates
    // add all of them to a set

    // create a method that takes set and varargs of String and adds all elements to the set
    // public static void addAll(HashSet<String> set, Strings... elements) {}

    // create a method that takes set and String[], method should adds all elements to the set

    public static void main(String[] args) {
        String[] list = {"Muharrem", "Ali", "Tuba", "Shavkat", "Ali", "Yusuf", "Tuba"};
        HashSet<String> uniqueMentors = new HashSet<>();
        for (int i = 0; i < list.length; i++) {
            uniqueMentors.add(list[i]);
        }
        System.out.println(uniqueMentors);

        HashSet<String> uniqueMentors2 = new HashSet<>();

        addAll(uniqueMentors2, "Muharrem", "Ali", "Ali", "Yusuf", "Tuba");
        System.out.println(uniqueMentors2);

        HashSet<String> uniqueMentors3 = new HashSet<>();

        addAllAsArray(uniqueMentors3, list);
        System.out.println(uniqueMentors3);
    }

    public static void addAll(HashSet<String> set, String... elements) {
        for (int i = 0; i < elements.length; i++) {
            set.add(elements[i]);
        }
    }

    public static void addAllAsArray(HashSet<String> set, String[] elements) {
        for (int i = 0; i < elements.length; i++) {
            set.add(elements[i]);
        }
    }
}
