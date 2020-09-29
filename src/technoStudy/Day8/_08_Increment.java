package technoStudy.Day8;

public class _08_Increment {
    public static void main(String[] args) {
        //  increment = increase the value by 1
        // pre-increment, value increased first and then returned
        int x = 1;
        System.out.println(++x); // x = x + 1;

        // post-increment, value is returned first and then it is incremented
        int y = 1;
        System.out.println(y); // the value of y is 1
        System.out.println(y++); // will print 1, then the value of y is incremented
        System.out.println(y); // the value of y is 2 already
        System.out.println(y++); // the value of y is 2, that's why 2 is printed, then it's incremented
        System.out.println(y); // the value of y is 3 already
    }
}
