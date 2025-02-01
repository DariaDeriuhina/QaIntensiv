package abstraction_lesson4.classwork.task1;

public class Main {
    public static void main(String[] args) {

        Discountable strategy = new DiscountStrategyHandler().getStrategy(CustomerType.VIP);
        System.out.println(strategy.calculateDiscount(1000));
    }

}
