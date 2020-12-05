package technoStudy.Day49.task1.version3;

public class PremiumCustomer extends Customer {
    public PremiumCustomer(String name, String address) {
        super(name, address);
    }

    @Override
    public int getCartTotal() {
        int sum = 0;
        for(Item item: getCart()) {
            sum += item.getPrice();
        }
        sum *= 0.9;
        return sum;
    }
}
