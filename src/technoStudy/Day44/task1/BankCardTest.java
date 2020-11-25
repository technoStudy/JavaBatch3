package technoStudy.Day44.task1;
import org.junit.Assert;
import org.junit.Test;

public class BankCardTest {
    @Test
    public void overDraftTest(){
        CreditCard card = new CreditCard();
        card.withdraw(100);
        double balance = card.getBalance();
        Assert.assertEquals(-100.0, balance, 0.0);
    }

    @Test
    public void overDraftTest1(){
        CreditCard card = new CreditCard();
        card.deposit(50);
        card.withdraw(100);
        double balance = card.getBalance();
        Assert.assertEquals(-50.0, balance, 0.0);
    }

    @Test(expected = RuntimeException.class)
    public void overDraftTest2(){
        DebitCard card = new DebitCard();
        card.deposit(50);
        card.withdraw(100);
    }
}
