package classes_oop_lesson2.homework.oop.task10;

public class Customer extends User{
    private Cart cart;

    public Cart getCart() {
        return cart;
    }

    public Customer(String name, String email) {
        super(name, email);
        cart = new Cart();
    }

    public void addProductToCart(Product product){
        cart.addProductToCart(product);
    }
}
