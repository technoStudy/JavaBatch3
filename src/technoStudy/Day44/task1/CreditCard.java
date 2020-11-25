package technoStudy.Day44.task1;


public class CreditCard extends BankCard {
    @Override
    void withdraw(double amount) {
        if(amount <= 0) {
            throw new RuntimeException("Amount cannot be zero or negative");
        }
        balance -= amount;
    }
}
