package technoStudy.Day37.task2;

public class CarSolution {
    public void buy(CarConditionSolution condition) throws Exception {
        if(condition == CarConditionSolution.OLD) {
            throw new Exception("The car is too OLD!");
        }
        if(condition == CarConditionSolution.WASTE) {
            throw new Exception("The car is a waste!");
        }
    }

    public void drive(String weather){
        if(!weather.equals("normal")){
            throw new RuntimeException("The weather is not normal!");
        }
    }
}
