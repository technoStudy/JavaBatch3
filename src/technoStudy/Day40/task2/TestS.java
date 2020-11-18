package technoStudy.Day40.task2;

import org.junit.Assert;
import org.junit.Test;

public class TestS {
    @Test(expected = IllegalArgumentException.class)
    public void withdraw1(){
        // try withdraw 100 with 0 balance
        BankAccountS account = new BankAccountS("1", CurrencyS.USD);
        account.withdraw(100);
    }

    @Test(expected = IllegalArgumentException.class)
    public void withdraw2(){
        // try withdraw -100 with 0 balance
        BankAccountS account = new BankAccountS("1", CurrencyS.USD);
        account.withdraw(-100);
    }

    @Test(expected = IllegalArgumentException.class)
    public void withdraw3(){
        // try withdraw 0 with 0 balance
        BankAccountS account = new BankAccountS("1", CurrencyS.USD);
        account.withdraw(0);
    }

    @Test
    public void withdraw4(){
        // try withdraw 50 with 100 balance
        BankAccountS account = new BankAccountS("1", CurrencyS.USD);
        account.deposit(100);
        account.withdraw(50);
        double actual = account.getBalance();
        Assert.assertEquals(50, actual, 0.0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void withdraw5(){
        // try withdraw 150 with 100 balance
        BankAccountS account = new BankAccountS("1", CurrencyS.USD);
        account.deposit(100);
        account.withdraw(150);
    }

    @Test
    public void withdraw6(){
        // try withdraw 100 with 100 balance
        BankAccountS account = new BankAccountS("1", CurrencyS.USD);
        account.deposit(100);
        account.withdraw(100);
        double actual = account.getBalance();
        Assert.assertEquals(0, actual, 0.0);
    }
}
