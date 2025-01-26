package classes_oop_lesson2.homework.oop.task10;

public class Admin extends User{
    public Admin(String name, String email) {
        super(name, email);
    }

    public void changePrice(Product product, double sum, String operation){
        if (sum < 0) {
            System.out.println("The sum cannot be negative.");
            return;
        }

        switch (operation){
            case "+":
                product.setPrice(product.getPrice()+sum);
                break;
            case "-":
                if (product.getPrice() - sum < 0) {
                    System.out.println("Price cannot be negative. Operation canceled.");
                } else {
                    product.setPrice(product.getPrice() - sum);
                }
                break;
            case "*":
                product.setPrice(product.getPrice()+ product.getPrice()*sum);
                break;
            default:
                System.out.println("You entered unknown operation, choose from: +, - or *");
                break;
        }
    }
}
