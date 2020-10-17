package technoStudy.Day20;

public class Task1 {
    // create a method that accepts a int
    // and returns twice of that int
    // overload this method with wrapper class Integer
    // input 2, output 4
    public static void main(String[] args) {
        twiceTheValue(2);
        Integer number = 2;
        twiceTheValue(number);
//        twiceTheValue(2);
    }

    public static Integer twiceTheValue(int number) {
        System.out.println("1st method");
        return number * 2;
    }

    public static Integer twiceTheValue(Integer number) {
        System.out.println("2nd method");
        return number * 2;
    }
}
