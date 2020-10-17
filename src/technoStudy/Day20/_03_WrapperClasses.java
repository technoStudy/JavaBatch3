package technoStudy.Day20;

public class _03_WrapperClasses {
    public static void main(String[] args) {
        int primitiveInt = 1;
        //primitiveInt. // no methods for primitive type
        Integer nonPrimitiveInt = 1;
        String string = nonPrimitiveInt.toString(); // wrapper classes has methods

        // int cannotAssignNull = null; cannot assign null to int
        Integer canAssignNull = null; // can assign null to wrapper

        int[] ints = new int[2];
        System.out.println(ints[0]); // always has a value
        System.out.println(ints[1]);

        Integer[] intsOf = new Integer[2];
        System.out.println(intsOf[0]); // can be null
        System.out.println(intsOf[1]);

        String aNullString = null;
        String aNotNullString = "Another string";

//        System.out.println(aNullString.concat(aNotNullString)); //NullPointerException
        System.out.println(aNullString + aNotNullString); // with + concatenation there's no null pointer
        System.out.println(aNotNullString + aNullString); // with + concatenation there's no null pointer
    }
}
