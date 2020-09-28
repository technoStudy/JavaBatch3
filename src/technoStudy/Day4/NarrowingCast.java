package technoStudy.Day4;

public class NarrowingCast {
    public static void main(String[] args) {
        short shortByte = 127;
        System.out.println(shortByte);

        byte smallByte = (byte) shortByte; // because short could be bigger than byte, you need explicit casting
        System.out.println(smallByte);

        // if the short is bigger than byte
        short shortByte2 = 129;
        System.out.println(shortByte2);

        byte smallByte2 = (byte) shortByte2; // because short is bigger than byte, it will overflow to the other side
        System.out.println(smallByte2); // overflowed by 2

    }
}
