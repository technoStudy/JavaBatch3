package technoStudy.Day50;

public class InfiniteLoop {
    public static void main(String[] args) {
        int x = 5;
        while (x >= 0) {
            int y = 3;
            while (y > 0) {
                if (x < 2) continue;
                x--;
                y--;
                System.out.print(x * y + " ");
            }
        }
    }
}
