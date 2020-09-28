package technoStudy.Day6;

public class Task5 {
    // get the count of characters in " Hello, Techno Study!   "
    // trim the string and get count of characters again
    public static void main(String[] args) {
        String testString = " Hello, Techno Study!   ";
        System.out.println("Length before trimming: " + testString.length());
        String testStringTrimmed = testString.trim();
        System.out.println("Length after trimming: " + testStringTrimmed.length());
    }
}
