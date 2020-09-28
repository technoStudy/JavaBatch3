package technoStudy.Day4;

public class WideningCast {
    public static void main(String[] args) {
        byte smallByte = 127;
        System.out.println(smallByte);

        short shortByte = smallByte; // conversion from byte to shor happens automatically
        System.out.println(shortByte); // implicitly converted into short
    }
}
