package classes_oop_lesson2.homework.oop.task10;

public class Order {
    private static int counter = 1;
    private int orderId;
    private Customer customer;
    private Cart cart;
    private double totalPrice;

    public Order(Customer customer) {
        orderId = counter++;
        this.customer = customer;
        this.cart = customer.getCart();
        calculateTotalPrice();
    }

    public double calculateTotalPrice() {
        for (Product product : cart.getProducts()) {
            totalPrice += product.applyDiscount();
        }

        return totalPrice;

    }

    public void displayOrderDetails() {
        System.out.println("Order ID: " + orderId);
        System.out.println("Customer: " + customer.getName());
        System.out.println("Products:");
        for (Product product : cart.getProducts()) {
            System.out.println("- " + product.getName() + ": $" + product.applyDiscount());
        }
        System.out.println("Total Price: $" + totalPrice);
    }

    public int getOrderId() {
        return orderId;
    }

    public double getTotalPrice() {
        return totalPrice;
    }
}
