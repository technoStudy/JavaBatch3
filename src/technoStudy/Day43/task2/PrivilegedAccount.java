package technoStudy.Day43.task2;

public class PrivilegedAccount extends BankAccount {
    boolean overDrafted = false;

    public PrivilegedAccount(String userId) {
        super(userId);
    }

    @Override
    public void withdraw(double amount) {
        if(amount <= 0) {
            throw new IllegalArgumentException("The amount should be greater than zero!");
        }
        double newBalance = getBalance() - amount;
        if(newBalance < 0) {
            overDrafted = true;
        }
        setBalance(newBalance);
    }
}
