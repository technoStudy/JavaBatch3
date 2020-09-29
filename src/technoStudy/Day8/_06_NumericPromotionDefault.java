package technoStudy.Day8;

public class _06_NumericPromotionDefault {
    public static void main(String[] args) {
        byte x = 2;
        byte y = 4;

        int intResult = x + y; // all values in your code by default are ints
        byte byteResult = (byte) (x + y);
        System.out.println(intResult);

    }
}
