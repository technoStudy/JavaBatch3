package technoStudy.Day5;

public class Task5 {
    // part1: find the last index of 0 in "0000000012300231"
    // part2: find the last index of 1 in "0000000012300231"
    public static void main(String[] args) {
        String var = "0000000012300231";
        System.out.println(var.lastIndexOf('0'));
        System.out.println(var.lastIndexOf('1'));

        System.out.println(var.length()); // is 16 because indexes start with 0
    }
}
