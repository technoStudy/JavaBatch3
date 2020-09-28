package technoStudy.Day4;

public class Task3 {
    // create 3 variables: an int, a double and a char
    // and print them together
    public static void main(String[] args) {
        int age = 33;
        double height = 164.24;
        char sex = 'M';

        System.out.println(age + height + sex); // math will happen here
        System.out.println("" + age + height + sex); // "" + this coverts everything after into a string
    }
}
