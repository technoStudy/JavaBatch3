package technoStudy.Day32.enums._01_simpleEnum;

public class Demo {
    public static void main(String[] args) {
//        Levels level = Levels.high;
        Levels level = Levels.low; // only 3 types of values possible

        WaterLevel boiler1 = new WaterLevel(Levels.high);

        if(boiler1.getLevel() == Levels.high) {
            System.out.println("The boiler level is low");
        }

        switch (boiler1.getLevel()){
            case low:
                System.out.println("Level is low");
                break;
            case medium:
                System.out.println("Level is medium");
                break;
            case high:
                System.out.println("Warning!");
                System.out.println("Level is high!!");
                break;
            default:
                System.out.println("The level is not recognized");
        }

    }
}
