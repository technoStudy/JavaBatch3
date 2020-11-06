package technoStudy.Day32.enums._02_complexEnums;

public class Demo {
    public static void main(String[] args) {
        Direction direction = Direction.EAST;
        direction.distance = 2;
        Direction direction2 = Direction.WEST;
        direction2.distance = 5;

        System.out.println(direction);
        System.out.println(direction.shortName);
        System.out.println(direction.distance);

    }
}
