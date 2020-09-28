package technoStudy.Day6;

public class Task8 {
    // replace all numbers between 1 and 3 with "-" in "Hello number 1453!"
    // FYI: the dollar sign $ is a special character of regex
    // part2:  replace all capital letters using regex [A-Z] in "Hello NUMBER 1453!" with "*"
    public static void main(String[] args) {
        String testString = "Hello number 1453!";
        System.out.println(testString.replaceAll("[1-3]", "-"));

        // part2 solution:
        String testString2 = "Hello NUMBER 1453!";
        System.out.println(testString2.replaceAll("[A-Z]", "*"));
    }
}
