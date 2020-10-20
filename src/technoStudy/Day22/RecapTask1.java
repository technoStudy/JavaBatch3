package technoStudy.Day22;

public class RecapTask1 {
    // Creates a 2D array of integers 5x10, fills it with increasing
    // integer values, then print them out.
    /*
        0 1 2 3 4 5 6 7 8 9
        10 11 12 13 14 15 16 17 18 19
        20 21 22 23 24 25 26 27 28 29
        30 31 32 33 34 35 36 37 38 39
        40 41 42 43 44 45 46 47 48 49
    */


    // part two: create a method that takes a 2D array and an integer
    // it returns the number of elements that is divisible by this integer
    // public static int getNumberOfElementsDivisibleBy(int[][] array, int integer) {}
    // ({{1,2,4}, {1,5,6}}, 2) => 3 elements are divisible by 2, so return 3

    public static int getNumberOfElementsDivisibleBy(int[][] array, int integer) {
        int result = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                int element = array[i][j];
                if(element != 0 && element % integer == 0) {
                    result++;
                }
            }
        }
        return result;
    }


    public static void main(String[] args) {
        int[][] array = new int[5][10];

        int counter = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = counter++; // post increment, gives value first then increments
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }

        int[][] testArray = {{1,2,4}, {1,5,6}};
        int result = getNumberOfElementsDivisibleBy(testArray, 2);
        System.out.println(result);

        result = getNumberOfElementsDivisibleBy(array, 12);
        System.out.println(result);
    }
}
