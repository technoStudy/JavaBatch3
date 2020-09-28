package technoStudy.Day6;

public class Task1 {
    // check whether string "Hi, world!" starts with "Hi"
    // part2: "Hi world,Hello world" check whether second part of the string starts with Hello
    public static void main(String[] args) {
        String testString = "Hi, world!";
        System.out.println(testString.startsWith("Hi"));

        // part2
        String str1="Hi Techno Study,world Hello";
        System.out.println(str1.startsWith("Hello",9));

        int indexOfComma = str1.indexOf(',');
        System.out.println(indexOfComma);
        System.out.println(str1.startsWith("Hello",indexOfComma + 1)); // start search after the comma

    }
}
