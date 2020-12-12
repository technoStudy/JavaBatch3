package technoStudy.Day53.Generics.task1;

import technoStudy.Day53.Generics.GenericClass.StringHolder;

public class Swapper {
    public static <T> void swapElements(T[] array, int index1, int index2){
        if(array == null || array.length < 2) {
            throw new RuntimeException("Array should have at least 2 elements");
        }
        if(index1 < 0 || index2 < 0) {
            throw new RuntimeException("Indexes cannot be less than zero");
        }
        if(index1 >= array.length || index2 >= array.length) {
            throw new RuntimeException("Indexes cannot more than number of items in array");
        }
        T temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }

    public static void swapStringElements(String[] array, int index1, int index2){
        if(array == null || array.length < 2) {
            throw new RuntimeException("Array should have at least 2 elements");
        }
        if(index1 < 0 || index2 < 0) {
            throw new RuntimeException("Indexes cannot be less than zero");
        }
        if(index1 >= array.length || index2 >= array.length) {
            throw new RuntimeException("Indexes cannot more than number of items in array");
        }
        String temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }
}
