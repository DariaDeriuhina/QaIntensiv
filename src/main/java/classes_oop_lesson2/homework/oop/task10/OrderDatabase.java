package classes_oop_lesson2.homework.oop.task10;

import java.util.HashMap;
import java.util.Map;

public class OrderDatabase implements DataBaseOperations{
    Map<Integer, Order> orders = new HashMap<>();

    @Override
    public void saveOrder(Order order) {
        orders.put(order.getOrderId(), order);
        System.out.println("Order ID " + order.getOrderId() + " saved.");
    }

    @Override
    public Order getOrder(int orderId) {
        return orders.get(orderId);
    }
}
