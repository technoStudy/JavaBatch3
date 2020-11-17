package technoStudy.Day38.task3;

import java.util.ArrayList;

public class Task3Solution {


    public static boolean addPriceToList(String string, ArrayList<Double> list) {
        Double parsed = null;
        try {
            parsed = Double.parseDouble(string);
        } catch (NullPointerException e) {
            System.out.println("The string you are adding to list is null");
            return false;
        } catch (NumberFormatException e) {
            System.out.println("The string you are adding to list is not a number");
            return false;
        }
        list.add(parsed);
        return true;
    }
}
