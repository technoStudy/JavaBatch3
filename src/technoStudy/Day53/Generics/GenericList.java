package technoStudy.Day53.Generics;

import java.util.ArrayList;
import java.util.List;

public class GenericList {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add("a string");
        list.add(new Integer(4));
        for (Object o: list) {
            String str = (String) o;
            System.out.println(str);
        }

        List<String> stringList = new ArrayList<>();
        stringList.add("a string");
//        stringList.add(new Integer(4));
        for (String o : stringList) {
            System.out.println(o);
        }

        List<Integer> integerList = new ArrayList<>();
//        integerList.add("A");
        integerList.add(new Integer(4));

    }
}
