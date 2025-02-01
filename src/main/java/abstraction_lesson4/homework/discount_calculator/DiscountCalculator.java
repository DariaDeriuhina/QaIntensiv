package abstraction_lesson4.homework.discount_calculator;

public class DiscountCalculator {

    public double calculateDiscount(CustomerType customerType, double amount){
        return customerType.getDiscountAmount()*amount;
    }
}
