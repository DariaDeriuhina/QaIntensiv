package classes_oop_lesson2.homework.oop.task10;

import java.util.ArrayList;
import java.util.List;

public class Cart {
    private List<Product> products;

    public List<Product> getProducts() {
        return products;
    }

    public Cart() {
        this.products = new ArrayList<>();
    }

    public void addProductToCart(Product product){
        products.add(product);
    }
}
