package classes_oop_lesson2.homework;

import java.util.HashMap;
import java.util.Map;

public class Item {
    private String name;
    private double price;
    private int quantity;

    public Item(String name, double price, int quantity){
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public void sell(int amount){
        if(amount<=0){
            System.out.println("We can't sell zero or negative amount of items");
        }
        if(quantity<amount){
            System.out.println("Store doesn't have such amount of this good");
        }
        quantity -= amount;
    }

    public void restock(int amount){
        if(amount<=0){
            System.out.println("We can't restock zero or negative amount of items");
        }
        quantity += amount;
    }

    @Override
    public String toString() {
        return "Item{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", quantity=" + quantity +
                '}';
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }
}
