package technoStudy.Day6;

public class Task6 {
    // convert "Hi, there! Hello techno study!" every sentence to a question
    public static void main(String[] args) {
        String testString = "Hi, there! Hello techno study!";
        String questionString = testString.replace('!', '?');
        System.out.println(questionString);

        // convert "Hi, there! Hello techno study." every sentence to a question
        String testString2 = "Hi, there! Hello techno study.";
        String questionString2 = testString2.replace('!', '?').replace('.', '?');
        System.out.println(testString2);
        System.out.println(questionString2);
    }
}
