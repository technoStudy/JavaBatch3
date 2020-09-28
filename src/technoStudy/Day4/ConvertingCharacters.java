package technoStudy.Day4;

public class ConvertingCharacters {
    public static void main(String[] args) {
        char zeroCharacter = '0'; // character is signed number from 0 upto 65535

        byte byteCharacter = (byte) zeroCharacter;
        short shortCharacter = (short) zeroCharacter; // short upper limit is 32767
        int intCharacter = zeroCharacter;

        System.out.println(zeroCharacter);
        System.out.println(byteCharacter);
        System.out.println(shortCharacter);
        System.out.println(intCharacter);

        byte byteExc = 33; // byte is signed and can be negative
        char charExc = (char) byteExc;
        System.out.println("exclamation: " + charExc);
    }
}
