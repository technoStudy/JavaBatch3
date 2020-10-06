package technoStudy.Day12;

public class _02__WhileInfiniteErrorExample {
    public static void main(String[] args) {

        int count = 0;
        while (count < 5) {
            --count;
            System.out.println(count);
        }

        // be aware of infinite loop, make sure your condition will become false after sometime
    }
}
