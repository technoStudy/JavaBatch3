package technoStudy.Day53.preDefinedFunctionalInterfaces.task2;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Version2 {
    public static void main(String[] args) {
        Integer[] array = {1,2,1,3,5};
        String[] array2 = {"1","2","1","3","5"};

        // [2,3,5] -> remove all 1
        Predicate<Integer> filter1 = p -> p != 1;
        System.out.println(Arrays.toString(filter(array, filter1)));
        // [1,2,1] -> filter numbers larger 2
        Predicate<Integer> filter2 = p -> p <= 2 ;
        System.out.println(Arrays.toString(filter(array, filter2)));

        Predicate<String> filter3 = s -> s.equals("1");
        String[] filtered = filter(array2, filter3);
        System.out.println(Arrays.toString(filtered));

    }

    public static <T> T[] filter(T[] arr, Predicate<T> filter) {
        List<T> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if(filter.test(arr[i])) {
                list.add(arr[i]);
            }
        }
        T[] emptyArrayOfSameSizeAsList = (T[]) Array.newInstance(list.get(0)
                .getClass(), list.size());
        return list.toArray(emptyArrayOfSameSizeAsList);
    }

}
