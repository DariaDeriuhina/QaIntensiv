package abstraction_lesson4.classwork.task1;

public class DiscountVipStrategy implements Discountable{
    @Override
    public double calculateDiscount(double amount) {
        return amount*0.1;
    }
}
