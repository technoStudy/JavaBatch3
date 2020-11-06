package technoStudy.Day32.enums._01_task;

import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        Months currentMonth = Months.valueOf(input);

        switch (currentMonth) {
            case Jan:
                System.out.println("The start of the year!");
                break;
            case Jun:
                System.out.println("It's summer!");
                break;
            case Nov:
                System.out.println("Election month!");
                break;
            default:
                System.out.println(currentMonth);
                System.out.println("I dont know what this months is known for");
                for (Months month: Months.values()){
                    System.out.println(month);
                }
        }
    }
}
