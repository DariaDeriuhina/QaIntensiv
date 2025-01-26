package classes_oop_lesson2.homework.oop.task10;

public class Electronics extends Product{
    public Electronics(String name, double price) {
        super(name, price);
    }

    @Override
    public double applyDiscount() {
        if (getPrice()>100) return getPrice()*0.9;
        return getPrice();
    }
}
