package technoStudy.Day8;

public class _10_Assignment {
    public static void main(String[] args) {
        int x = 1; // simple assignment of value a variable
        int y = x; // assignment of variable x's value to a variable y

        x = x + 4;  // assigning a new value to x, old value of x plus 4
        System.out.println(x);
        y += 4;  // y = y + 4;  += is a shorthand of "y = y + 4"
        System.out.println(y);

        x -= 2; // decreased the value of x by 2
        System.out.println(x);

        y *= 2; // multiply the value of y by 2: 5 * 2  ; y = y * 2;
        System.out.println(y);

        y /= 2; // divide the value of y by 2: 10 / 2   ;  y = y / 2;
        System.out.println(y);

        x %= 2; // take the modulus of x and assign it to x
        System.out.println("x %= 2 =>" + x);
    }
}
