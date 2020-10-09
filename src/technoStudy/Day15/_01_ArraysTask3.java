package technoStudy.Day15;

public class _01_ArraysTask3 {
    // declare an array of doubles and initialize it with some values, use array = {}
    // get the sum and average of all values in the array
    public static void main(String[] args) {
        double[] myList = {1.1, 2.2, 3.3, 4.5};
        double sum = 0.0;

        for (int i = 0; i < myList.length; i++) {
            sum += myList[i];
        }

        System.out.println(sum);
        System.out.println(sum/myList.length);
    }
}
