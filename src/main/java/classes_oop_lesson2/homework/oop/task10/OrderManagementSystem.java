package classes_oop_lesson2.homework.oop.task10;

public class OrderManagementSystem {

    public static void main(String[] args) {
        Customer customer = new Customer("Inna", "dardin582@gmail.com");

        Product dress = new Clothing("Dress01", 100);
        Product shirt = new Clothing("Shirt01", 80);
        Product powerBank = new Electronics("PowerBank01", 150);
        Product watches = new Electronics("Watch01", 80);

        customer.addProductToCart(dress);
        customer.addProductToCart(shirt);
        customer.addProductToCart(powerBank);
        customer.addProductToCart(watches);

        Order order = new Order(customer);
        order.displayOrderDetails();

        OrderDatabase orderDatabase = new OrderDatabase();
        orderDatabase.saveOrder(order);

        Order retrievedOrder = orderDatabase.getOrder(1);
        System.out.println("Retrieved Order Total Price: $" + retrievedOrder.getTotalPrice());


    }
}
