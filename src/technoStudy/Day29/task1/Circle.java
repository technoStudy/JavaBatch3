package technoStudy.Day29.task1;

public class Circle {
    public int radius;
    public static int areaCount;
    public static int circumferenceCount;
    public static int allMethodCount;

    public double area(){
        areaCount++;
        allMethodCount++;
        return  radius*radius*3.14; // area = radius square times pi
    }

    public double circumference(){
        circumferenceCount++;
        allMethodCount++;
        return  2 * radius * 3.14;
    }

    public static int allMethodCount() {
        return circumferenceCount + areaCount;
    }
}
