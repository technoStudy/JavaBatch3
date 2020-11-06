package technoStudy.Day32.enums._02_task;

public class Demo {
    public static void main(String[] args) {
        Months current = Months.Nov;

        System.out.println(current);
        System.out.println(current.fullName);

        current.printTheFirstLetter();
    }
}
