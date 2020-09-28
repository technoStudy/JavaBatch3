package technoStudy.Day5;

public class _03_Concat {
    public static void main(String[] args) {
        String first = "Hello";
        String second = "World!";
        String third = "TechnoStudy!";

        String result = first.concat(second);
        String result2 = result.concat(third);
        System.out.println(result2);
        System.out.println(first);
        System.out.println(second);
        System.out.println(third);

        System.out.println(first + second + third);
    }
}

