package technoStudy.Day15;

public class _02_EnhancedForLoopForArrays {
    public static void main(String[] args) {
        String[] list = {"fruits", "vegetables", "meat", "milk"};

        for (String element : list) { // the index and array length is handled by java
            System.out.println(element);
        }
        //  System.out.println(element); // not availabe outside

    }
}
