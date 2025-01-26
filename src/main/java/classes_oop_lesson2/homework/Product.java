package classes_oop_lesson2.homework;

import java.util.Objects;

public class Product {
    private String name;
    private double price;
    private int id;

    public Product(String name, double price, int id) {
        this.name = name;
        this.price = price;
        this.id = id;
    }

    public Product(){}

    public boolean equals(Object o){
        if(this == o) return true;
        if(o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return product.id==id;
    }

    public int hashCode(){
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", id=" + id +
                '}';
    }

    public Product clone(){
        try {
            return (Product) super.clone();
        }catch (CloneNotSupportedException e){
            throw new AssertionError("Cloning not supported", e);
        }
    }
}
