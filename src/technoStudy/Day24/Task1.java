package technoStudy.Day24;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Task1 {
    // create a method that takes 3 arguments: length number, min number, max number
    // return a list of provided length, and fill it with random numbers generated from min to max

    // part2: create a list of 5 lists of random numbers, each list should be of 5 length and random number from 1 to 5

    // part3: create a list of 5 numbers gotten from the user input
    // check of your list of lists contains the user list, if yes print "you guessed correctly", if no print "you lose"
    public static ArrayList<Integer> generateRandomList(Integer length, Integer min, Integer max) {
        ArrayList<Integer> list = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < length; i++) {
            Integer randomNum = min + random.nextInt(max + 1 - min);
            list.add(randomNum);
        }
        return list;
    }

    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> listOfLists = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            ArrayList<Integer> arrayList = generateRandomList(5, 1, 5);
            listOfLists.add(arrayList);
        }
//        System.out.println(listOfLists);

        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> userList = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            userList.add(scanner.nextInt());
        }
        System.out.println(userList);

        if(listOfLists.contains(userList)) {
            System.out.println("You guessed correctly");
        } else {
            System.out.println("You lose");
        }

        System.out.println(listOfLists);
    }

}
