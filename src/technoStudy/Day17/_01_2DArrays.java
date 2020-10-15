package technoStudy.Day17;

public class _01_2DArrays {
    public static void main(String[] args) {
        int[] oneDimensional = new int[4];
        int i = oneDimensional[1];

        int[][] twoDimensional = new int[4][4];

        System.out.println(twoDimensional[0][0]);
        twoDimensional[0][0] = 2; // [0-1][0-3]
        System.out.println(twoDimensional[0][0]);

        System.out.println(twoDimensional[1][3]);
        twoDimensional[1][3] = 5; // [0-1][0-3]
        System.out.println(twoDimensional[1][3]);

        System.out.println();
        for (int j = 0; j < twoDimensional.length; j++) { //j =0,1
            for (int k = 0; k < twoDimensional[j].length; k++) {
                int element = twoDimensional[j][k];
                System.out.print(j+":"+k+"->"+element + " ");
            }
            System.out.println();
        }

    }
}
