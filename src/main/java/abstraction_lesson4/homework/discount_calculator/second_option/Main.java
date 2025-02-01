package abstraction_lesson4.homework.discount_calculator.second_option;

import static abstraction_lesson4.homework.discount_calculator.second_option.CustomerType.VIP;

public class Main {
    public static void main(String[] args) {
        DiscountCalculator discountCalculator = new DiscountCalculator();
        double discount = discountCalculator.calculateDiscount(VIP, 1000);
        System.out.println(discount);
    }
}
