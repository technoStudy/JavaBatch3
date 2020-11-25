package technoStudy.Day44.task1;

public class DebitCard extends BankCard {
    @Override
    void withdraw(double amount) {
        if (amount <= 0) {
            throw new RuntimeException("Amount cannot be zero or negative");
        }
        if (balance - amount < 0) {
            throw new RuntimeException("Not enough balance");
        }
        balance -= amount;
    }
}
