package technoStudy.Day8;

public class _09_Decrement {
    public static void main(String[] args) {
        //  decrement = decrease the value by 1
        // pre-decrement, value decreased first and then returned
        int x = 5;
        System.out.println(--x);  // x = x - 1

        // post-decrement, value is returned first and then it is decreased by 1
        int y = 5;
        System.out.println(y--);
        System.out.println(y);
    }
}
