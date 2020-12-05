package technoStudy.Day49.task1.version3;

public class SuperSpecialCustomer extends Customer {
    public SuperSpecialCustomer(String name, String address) {
        super(name, address);
    }

    @Override
    public int getCartTotal() {
        int sum = 0;
        for(Item item: getCart()) {
            sum += item.getPrice();
        }
        sum *= 0.25;
        return sum;
    }
}
