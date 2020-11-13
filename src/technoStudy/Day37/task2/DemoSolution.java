package technoStudy.Day37.task2;

public class DemoSolution {
    public static void main(String[] args) {
        CarSolution toyota = new CarSolution();

        try {
            toyota.buy(CarConditionSolution.OLD);
        } catch (Exception exception) {
            System.out.println(exception.getMessage());
            System.out.println("Don't buy this car");
        }

        toyota.drive("normal");
    }
}
