package technoStudy.Day28.task3;

public class Customer {
    String name;
    ElectricityAccount electricityAccount;

    public void consumeElectricity(int wph) {
        if(wph < 0) {
            return;
        }
        electricityAccount.totalWph += wph;
    }

}
