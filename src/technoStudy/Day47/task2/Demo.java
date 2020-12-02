package technoStudy.Day47.task2;

import java.util.ArrayList;
import java.util.List;

public class Demo {
    public static void main(String[] args) {
        List<Food> list = new ArrayList<>();
        list.add(new Beshparmak());
        list.add(new KarniYarik());
        list.add(new Maklube());

        for (Food food : list) {
            food.cook();
        }
    }
}
