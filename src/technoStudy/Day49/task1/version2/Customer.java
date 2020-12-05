package technoStudy.Day49.task1.version2;

import java.util.ArrayList;
import java.util.List;

public class Customer {
    private String name;
    private String address;
    private List<Item> cart = new ArrayList<>();
    private CustomerType type;

    public Customer(String name, String address, CustomerType type) {
        this.name = name;
        this.address = address;
        this.type = type;
    }

    public void addItemToCart(Item item) {
        this.cart.add(item);
    }

    public void removeItemFromTheCart(Item item) {
        this.cart.remove(item);
    }

    public int getCartTotal() {
        int sum = 0;
        for (int i = 0; i < cart.size(); i++) {
            sum += cart.get(i).getPrice();
        }

        double discount = (100 - type.discount) / 100.0; // 50/100 90/100 100/100
        sum *= discount;
        return sum;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", type=" + type +
                '}';
    }
}
