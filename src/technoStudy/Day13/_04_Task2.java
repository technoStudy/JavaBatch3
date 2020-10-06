package technoStudy.Day13;

public class _04_Task2 {
    // print the following pattern
    // *
    // **
    // ***
    // ****
    public static void main(String[] args) {
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print('*');
            }
            System.out.println();
        }

        for (int i = 1; i <=4; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i = 1; i <=4; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
