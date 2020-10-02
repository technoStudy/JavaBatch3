package technoStudy.Day9;

public class _04_StringToPrimitive {
    public static void main(String[] args) {
        String integer = "123";
        int firstInteger = Integer.parseInt(integer);
        int secondInteger = 1;

        System.out.println(firstInteger + secondInteger);

        String doubleNumber = "123";
        double firstDouble = Double.parseDouble(doubleNumber);
        double secondDouble = 5.5;

        System.out.println(firstDouble + secondDouble);

    }
}
