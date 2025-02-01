package abstraction_lesson4.homework.discount_calculator;

public class Main {
    public static void main(String[] args) {
        DiscountCalculator calculator = new DiscountCalculator();
        System.out.println(calculator.calculateDiscount(CustomerType.REGULAR, 1000));
    }
}
