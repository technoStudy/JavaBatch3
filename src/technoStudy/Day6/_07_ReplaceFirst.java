package technoStudy.Day6;

public class _07_ReplaceFirst {
    public static void main(String[] args) {
        String someString = "Hello world";
        String replacedString = someString.replaceFirst("l", "*");
        System.out.println(replacedString);

        String someStringWithNumbers = "Hello number 535, hi number 1";
        String result = someStringWithNumbers.replaceFirst("[0-9]", "one");
        System.out.println(result);
    }
}
