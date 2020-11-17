package technoStudy.Day38.task3;

import java.util.ArrayList;
import java.util.Scanner;

public class Task3Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Double> list = new ArrayList<>();
        String input = null;
        do {
            System.out.println("Please enter a number or type 'exit' to finish");
            input = scanner.nextLine();
            addPriceToList(input, list);
        } while (!input.equals("exit"));

        System.out.println(list);
    }

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
