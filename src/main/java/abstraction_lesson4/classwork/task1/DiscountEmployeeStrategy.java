package abstraction_lesson4.classwork.task1;

public class DiscountEmployeeStrategy implements Discountable{
    @Override
    public double calculateDiscount(double amount) {
        return amount*0.3;
    }
}
