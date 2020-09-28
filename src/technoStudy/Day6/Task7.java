package technoStudy.Day6;

public class Task7 {
    // replace first ! character with ? mark "Hi, there! Hello techno study!"
    public static void main(String[] args) {
        String testString = "Hi, there! Hello techno study!";
        String replacedString = testString.replaceFirst("!", "?");
        System.out.println(replacedString);
    }
}
