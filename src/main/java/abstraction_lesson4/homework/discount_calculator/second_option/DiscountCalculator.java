package abstraction_lesson4.homework.discount_calculator.second_option;

import java.util.HashMap;
import java.util.Map;

public class DiscountCalculator {
    private Map<CustomerType, DiscountStrategy> map;

    public DiscountCalculator(){
        map = new HashMap<>();
        map.put(CustomerType.REGULAR, new RegularCustomer());
        map.put(CustomerType.VIP, new VipCustomer());
        map.put(CustomerType.EMPLOYEE, new EmployeeCustomer());
    }

    public double calculateDiscount(CustomerType customerType, double amount){
        return map.getOrDefault(customerType, (a) -> 0).calculateDiscount(amount);
    }
}
