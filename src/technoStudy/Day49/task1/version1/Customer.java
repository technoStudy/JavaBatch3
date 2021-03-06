package technoStudy.Day49.task1.version1;

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

        if(type == CustomerType.PremiumCustomer) {
            sum *= 0.9;
        } else if(type == CustomerType.SpecialCustomer) {
            sum *= 0.5;
        } else if(type == CustomerType.SuperSpecialCustomer) {
            sum *= 0.25;
        }
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
