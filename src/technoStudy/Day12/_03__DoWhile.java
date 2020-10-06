package technoStudy.Day12;

public class _03__DoWhile {
    public static void main(String[] args) {
        int count = 0;

        do { // the block is guaranteed to execute at least once
            ++count;
            System.out.println(count);
        } while (count < 5); // the condition check is after

        System.out.println();

        int count2 = 0;
        while (count2 < 5) { // the condition check is before
            ++count2;
            System.out.println(count2);
        }
    }
}
