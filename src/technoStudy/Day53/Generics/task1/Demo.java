package technoStudy.Day53.Generics.task1;


import java.util.Arrays;

public class Demo {
    public static void main(String[] args) {
        String[] array1 = new String[3];
        for (int i = 0; i < array1.length; i++) {
            array1[i] = "Element " + (i+1);
        }
        System.out.println(Arrays.toString(array1));
        Swapper.swapElements(array1, 0, 2);
        System.out.println(Arrays.toString(array1));


        Integer[] array2 = new Integer[3];
        for (int i = 0; i < array2.length; i++) {
            array2[i] = (i+1);
        }
        System.out.println(Arrays.toString(array2));
        Swapper.swapElements(array2, 0, 2);
        System.out.println(Arrays.toString(array2));

        Swapper.swapStringElements(array1, 1, 2);
//        Swapper.swapStringElements(array2, 1, 2);
    }
}
