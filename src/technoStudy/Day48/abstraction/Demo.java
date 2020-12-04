package technoStudy.Day48.abstraction;

import java.util.ArrayList;
import java.util.List;

public class Demo {
    public static void main(String[] args) {
        List<Movable> list = new ArrayList<>();
        list.add(new Point(1,2));
        list.add(new Line(new Point(3, 2), new Point(1, 3)));
        list.add(new Triangle(new Point(3, 2), new Point(1, 3), new Point(3, 1)));

        for(Movable item : list) {
            item.moveRight();
            item.moveDown();
        }
    }

}
