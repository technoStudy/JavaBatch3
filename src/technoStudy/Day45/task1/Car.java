package technoStudy.Day45.task1;

public class Car {
    private String model;
    private int productionYear;

    public Car(String model, int year) {
        setModel(model);
        setProductionYear(year);
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getProductionYear() {
        return productionYear;
    }

    public void setProductionYear(int productionYear) {
        this.productionYear = productionYear;
    }
}
