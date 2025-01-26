package classes_oop_lesson2.homework.oop.task10;

public class Clothing extends Product{
    public Clothing(String name, double price) {
        super(name, price);
    }

    @Override
    public double applyDiscount() {
        if(getPrice()>50) return getPrice()*0.85;
        return getPrice();
    }
}
