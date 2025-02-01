package abstraction_lesson4.classwork.task1;

public class DiscountStrategyHandler {

    public Discountable getStrategy(CustomerType customerType){
        switch (customerType){
            case REGULAR -> {return new DiscountRegularStrategy();}
            case VIP -> {return new DiscountVipStrategy();}
            case EMPLOYEE -> {return new DiscountEmployeeStrategy();}
            default -> {throw new IllegalArgumentException("Unknown customer type");}
        }
    }
}
