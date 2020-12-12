package technoStudy.Day53.Generics.GenericMethod;

import java.util.Arrays;

public class GenericMethodClass {
    public static void printObjectTypeOfArray(Object[] array){
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

    public static <T> void printAnyTypeOfArray(T[] array){
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

    public static <T> T[] sortAnyTypeOfArray(T[] array){
        T[] clone = array.clone();
        Arrays.sort(clone);
        return clone;
    }



}
