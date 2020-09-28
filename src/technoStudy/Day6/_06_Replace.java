package technoStudy.Day6;

public class _06_Replace {
    public static void main(String[] args) {
        String someString = "Hello World!";
        String replacedString = someString.replace('l', '*');
        System.out.println(replacedString);

        String replacingWord = someString.replace("Hello", "Hi");
        System.out.println(replacingWord);
    }
}
