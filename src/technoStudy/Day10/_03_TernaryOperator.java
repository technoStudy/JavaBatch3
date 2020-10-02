package technoStudy.Day10;

public class _03_TernaryOperator {
    public static void main(String[] args) {
        boolean condition = false;

        String result = condition ? "first" : "second";

        // shorter version of ifelse with assignment, it also called elvis
//        if(condition) {
//            result = "first";
//        } else {
//            result = "second";
//        }

        System.out.println(result);
    }
}
