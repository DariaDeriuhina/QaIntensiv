package abstraction_lesson4.homework.discount_calculator.second_option;

public class VipCustomer implements DiscountStrategy{
    @Override
    public double calculateDiscount(double amount) {
        return amount*0.1;
    }
}
