package technoStudy.Day21;

import java.util.ArrayList;

public class Task1 {
    // create an arraylist of Strings
    // add Red, Green and Blue inside
    // print out all the elements, each element on new line

    // Part2: create a method that accepts an arraylist and element
    // it should add the element at the first position to arraylist

    // Part3: create a method that accepts an arraylist and element
    // it should add element before last  [1, 2, 3]  -> [1, 2, 4, 3]

    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Red");
        arrayList.add("Green");
        arrayList.add("Blue");

        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println(arrayList.get(i));
        }

        addElementAtFirstPosition(arrayList, "Purple");
        System.out.println();

        for (String element: arrayList) { // if you don't need the index, you can use enhanced for-loop
            System.out.println(element);
        }

        addElementBeforeLast(arrayList, "Pink");

        System.out.println(arrayList);
    }

    public static void addElementAtFirstPosition(ArrayList<String> list, String element){
        list.add(0, element);
    }

    public static void addElementBeforeLast(ArrayList<String> list, String element){
        list.add(list.size() - 1, element);
    }
}
