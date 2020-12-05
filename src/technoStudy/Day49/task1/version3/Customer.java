package technoStudy.Day49.task1.version3;

import java.util.ArrayList;
import java.util.List;

public abstract class Customer {
    private String name;
    private String address;
    private List<Item> cart = new ArrayList<>();

    public Customer(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public void addItemToCart(Item item) {
        this.cart.add(item);
    }

    public void removeItemFromTheCart(Item item) {
        this.cart.remove(item);
    }

    public abstract int getCartTotal();

    protected List<Item> getCart() {
        return cart;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", type=" + this.getClass().getSimpleName() +
                '}';
    }
}
