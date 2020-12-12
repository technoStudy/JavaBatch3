package technoStudy.Day53.preDefinedFunctionalInterfaces.task2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Version1 {
    public static void main(String[] args) {
        Integer[] array = {1,2,1,3,5};
        // [2,3,5] -> remove all 1
        System.out.println(Arrays.toString(removeAllOnes(array)));
        // [1,2,1] -> filter numbers larger 2
        System.out.println(Arrays.toString(removeLargerThanTwo(array)));

    }

    public static Integer[] removeAllOnes(Integer[] arr) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]!= 1) {
                list.add(arr[i]);
            }
        }
       return list.toArray(new Integer[0]);
    }

    public static Integer[] removeLargerThanTwo(Integer[] arr) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] <= 2) {
                list.add(arr[i]);
            }
        }
       return list.toArray(new Integer[0]);
    }
}
