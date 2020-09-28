package technoStudy.Day5;

public class Task789 {
    // part1: find out if this "Hello Techno Study!" string is empty
    // part2: find out if this "" is empty
    // part3: find out if this "Hello Techno Study!" string contains Techno
    // part4: find out if this "Hello Techno Study!" string equals  "hello techno study!" ignoring the case
    // part5: find the first word of "Hello Techno Study!" string, and check if it equals "Hello", considering the case
    public static void main(String[] args) {
        // part1
        String string = "Hello Techno Study!";
        System.out.println(string.isEmpty());

        // part2
        String emptyString = "";
        System.out.println(emptyString.isEmpty());

        // part3
        String techno = "Techno";
        System.out.println(string.contains(techno));

        // part4
        String lowerCaseString = "hello techno study!";
        System.out.println(string.equalsIgnoreCase(lowerCaseString));

        // part5
        String hello = "Hello";
        int firstIndexOfSpace = string.indexOf(' ');
        String firstWord = string.substring(0, firstIndexOfSpace);
        System.out.println(firstWord.equals(hello));

    }
}
