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
        // TODO: implement the method
        return 0;
    }
}
