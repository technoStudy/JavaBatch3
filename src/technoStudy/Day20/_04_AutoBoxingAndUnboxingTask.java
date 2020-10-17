package technoStudy.Day20;

public class _04_AutoBoxingAndUnboxingTask {
    // autobox and unbox all all the values below
    public static void main(String[] args) {
        byte primitiveByte = 127;
        Byte aByte = primitiveByte; // autoboxing
        byte unboxedByte = aByte; // unboxing

        short primitiveShort = 1234;
        Short aShort = primitiveShort;
        short unboxedShort = aShort;

        int primitiveInt = 123123;
        Integer anInteger = primitiveInt;
        int unboxedInt = anInteger;

        long primitiveLong = 1231241241l;
        Long aLong = primitiveLong;
        long unboxedLong = aLong;

        float primitiveFloat = 123.3F;
        Float aFloat = primitiveFloat;
        float unboxedFloat = aFloat;

        double pritiveDouble = 123.3;
        Double aDouble = pritiveDouble;
        double unboxedDouble = aDouble;

        boolean primitiveBolean = true;
        Boolean aBoolean = primitiveBolean;
        boolean unboxedBolean = aBoolean;

        char primitiveChar = 'A';
        Character aCharacter = primitiveChar;
        char unboxedChar = aCharacter;

        Character aNullCharacter = null;
        char unboxedNullChar = aNullCharacter;
        System.out.println(unboxedNullChar); //NullPointerException
    }
}
