package technoStudy.Day17;

import java.util.Arrays;

public class _03_2DArraysInitialization {
    public static void main(String[] args) {
        String[] list1 = {"1", "2"};
        String[] list2 = {"3", "4"};
        String[] list3 = {"5", "6"};

        String[][] listOfList = {{"1", "2"}, {"3", "4"}, {"5", "6"}};
        System.out.println("listOfList  length is " + listOfList.length);
        for (int i = 0; i < listOfList.length; i++) {
            for (int j = 0; j < listOfList[i].length; j++) {
                System.out.print(listOfList[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
