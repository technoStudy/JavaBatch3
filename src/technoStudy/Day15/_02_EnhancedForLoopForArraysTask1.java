package technoStudy.Day15;

public class _02_EnhancedForLoopForArraysTask1 {
    // given the provided array
    // print the length of each string element
    public static void main(String[] args) {
        String[] list = {"fruits", "vegetables", "meat", "milk"};

        for (String element : list){
            System.out.println(element + " " + element.length());
        }

        System.out.println();
        for (int i = 0; i < list.length; i++) {
            System.out.println(list[i] + " " + list[i].length());
        }
    }
}
