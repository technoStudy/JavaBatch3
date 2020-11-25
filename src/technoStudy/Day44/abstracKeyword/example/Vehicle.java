package technoStudy.Day44.abstracKeyword.example;

public abstract class Vehicle extends Transport {
//    abstract int productionDate;
//    abstract public Vehicle(){
//
//    }
    public abstract void move(int distance);
    public abstract void move(int distance, String units);
    public abstract void fuelUp(int liters);
    public abstract void fly() throws Exception;

//    abstract final void finalMethod(){
//
//    }

    public static String getName(){
        return "Vehicle Class";
    }

    public void instanceMethod(){
        // to be inherited, may be overridden
    }

    public static void main(String[] args) {
        System.out.println("Hello!");
    }
}
