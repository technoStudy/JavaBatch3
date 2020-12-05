package technoStudy.Day49.task1.version3;

public class NormalCustomer extends Customer {
    public NormalCustomer(String name, String address) {
        super(name, address);
    }

    @Override
    public int getCartTotal() {
        int sum = 0;
        for(Item item: getCart()) {
            sum += item.getPrice();
        }
        return sum;
    }
}
