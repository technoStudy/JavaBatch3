package technoStudy.Day45.task1;

import java.util.ArrayList;
import java.util.List;

public class DemoCars {
    public static void main(String[] args) {
        List<Car> list = new ArrayList<>();
        Car tesla = new Tesla("S1", 2020);
        Car prius = new ToyotaPrius("P23", 2015);
        Car mercedes = new Mercedes("M5", 2018);

        list.add(tesla);
        list.add(prius);
        list.add(mercedes);

        for (Car car : list) {
            System.out.print(car.getModel());
            if(car instanceof Electric) {
                System.out.print(" electric");
            }
            System.out.println();
        }
    }
}
