package technoStudy.Day12;

public class _04_BreakInsideLoop {
    public static void main(String[] args) {
        int count = 0;
        while (count < 10) {
            count++;
            System.out.println(count);
            if(count == 5) {
                break;
            }
        }
    }
}
