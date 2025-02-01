package abstraction_lesson4.homework.discount_calculator;

public enum CustomerType {
    REGULAR(0.05),
    VIP(0.1),
    EMPLOYEE(0.3);

    private double discountAmount;

    CustomerType(double discountAmount){
        this.discountAmount = discountAmount;
    }

    public double getDiscountAmount() {
        return discountAmount;
    }
}
