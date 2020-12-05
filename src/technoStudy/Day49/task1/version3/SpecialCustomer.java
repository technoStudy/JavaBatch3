package technoStudy.Day49.task1.version3;

public class SpecialCustomer extends Customer {
    public SpecialCustomer(String name, String address) {
        super(name, address);
    }

    @Override
    public int getCartTotal() {
        int sum = 0;
        for(Item item: getCart()) {
            sum += item.getPrice();
        }
        sum *= 0.5;
        return sum;
    }
}
