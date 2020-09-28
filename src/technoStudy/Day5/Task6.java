package technoStudy.Day5;

public class Task6 {
    // part1: return the last word from "Hello Techno Study!"
    // part2: return the first word from "Hello Techno Study!"
    public static void main(String[] args) {
        String var = "Hello Techno Study!";
        int indexOfLastSpace = var.lastIndexOf(' '); // find the index of last space
        String part1 = var.substring(indexOfLastSpace + 1); // +1 to start with character after the last space and until the end of string
        System.out.println(part1);

        int firstIndexOfSpace = var.indexOf(' '); // first index of space character
        String part2 = var.substring(0, firstIndexOfSpace); // no need for +1 because it will not be included
        System.out.println(part2);
    }
}
