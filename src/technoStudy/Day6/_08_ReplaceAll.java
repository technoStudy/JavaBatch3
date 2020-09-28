package technoStudy.Day6;

public class _08_ReplaceAll {
    public static void main(String[] args) {
        String someString = "Hello world!";
        String replacedString = someString.replaceAll("l", "*");
        System.out.println(replacedString);

        String someStringWithNumbers = "Hello number 535, hi number 1";
        String result = someStringWithNumbers.replaceAll("[5-9]", "-");
        System.out.println(result);

        // difference between replace and replaceAll
        // replace accepts strings and characters
        // replaceAll accepts regex

        String result2 = someStringWithNumbers.replace("[5-9]", "-");
        System.out.println(result2);
    }
}
