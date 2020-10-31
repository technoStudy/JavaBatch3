package technoStudy.Day30;

public class _01_NoArgsConstructor {
    public static void main(String[] args) {
        CarNoArgs car = new CarNoArgs();
        System.out.println(car.model);

        CarNoArgs car2 = new CarNoArgs();
        car2.model = "Tesla";
        System.out.println(car2.model);
    }
}
