package technoStudy.Day17;

public class Task1 {
    // given an array
    // print all elements in rows and columns
    // get sum and average of all elements
    // get sum and average of each row
    // get sum and average of each column
    public static void main(String[] args) {
        int[][] ints = {{1,2,3}, {4,5,6}, {7,8,9}};

        for (int i = 0; i < ints.length; i++) {
            for (int j = 0; j < ints[i].length; j++) {
                System.out.print(ints[i][j] + "\t");
            }
            System.out.println();
        }

        int sum = 0;
        int count = 0;
        for (int i = 0; i < ints.length; i++) {
            count += ints[i].length;
            for (int j = 0; j < ints[i].length; j++) {
                sum += ints[i][j];
            }
        }
        System.out.println("total sum is " + sum);
        System.out.println("average is " + sum/count);

        for (int i = 0; i < ints.length; i++) {
            int rowSum = 0;
            for (int j = 0; j < ints[i].length; j++) {
                rowSum += ints[i][j];
            }
            System.out.println("the row " + i + " sum is " + rowSum + " and the average is " + rowSum/ints[i].length); // ints[i] represent the row
        }

        int columnSum0 = 0;
        int columnSum1 = 0;
        int columnSum2 = 0;

        // int[] columnSums = new int[3];
        for (int i = 0; i < ints.length; i++) {
            columnSum0 +=  ints[i][0];
            columnSum1 +=  ints[i][1];
            columnSum2 +=  ints[i][2];
        }
        System.out.println(columnSum0);
        System.out.println(columnSum1);
        System.out.println(columnSum2);

    }
}
