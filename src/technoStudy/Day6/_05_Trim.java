package technoStudy.Day6;

public class _05_Trim {
    public static void main(String[] args) {
        String someString = " Hello,    friend";
        System.out.println(someString);
        String someStringTrimmed = someString.trim(); // like using scissors
        System.out.println(someStringTrimmed); // it will not remove spaces in between
    }
}
