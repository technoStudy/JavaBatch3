package technoStudy.Day13;

public class _04_Task1 {
    // print a square 4x4 wide out of '*' character
    // ****
    // ****
    // ****
    // ****
    public static void main(String[] args) {
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print('*');
            }
            System.out.println();
        }
    }
}
