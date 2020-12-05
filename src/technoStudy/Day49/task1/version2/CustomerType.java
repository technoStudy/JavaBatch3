package technoStudy.Day49.task1.version2;

public enum CustomerType {
    NormalCustomer(0), PremiumCustomer(10), SpecialCustomer(50);

    CustomerType(int discount) {
        this.discount = discount;
    }

    int discount;
}
