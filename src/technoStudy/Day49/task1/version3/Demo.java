package technoStudy.Day49.task1.version3;

public class Demo {
    public static void main(String[] args) {
        Customer customer1 = new SuperSpecialCustomer("John", "Oak Street 1");
        customer1.addItemToCart(new Item("Bread", 10));
        customer1.addItemToCart(new Item("Butter", 50));

        System.out.println(customer1 + " cart total: " + customer1.getCartTotal());
    }
}
