package technoStudy.Day8;

public class _05_NumericPromotion {
    public static void main(String[] args) {
        int intNumber = 2;
        long longNumber = 2;

        int intResult = (int) (intNumber + longNumber);
        byte byteResult = (byte) (intNumber + longNumber);
        long longResult = intNumber + longNumber;

        System.out.println(intResult);
        System.out.println(byteResult);
        System.out.println(longResult);

    }
}
