package basics_lesson1.homework.basic_operations;

import java.util.InputMismatchException;
import java.util.Scanner;

public class RectangleArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try{
            System.out.print("Enter first number: ");
            double width = scanner.nextDouble();
            System.out.print("Enter second number: ");
            double length = scanner.nextDouble();
            Rectangle rectangle = new Rectangle(width, length);
            System.out.println(rectangle.calculateArea());
        } catch (InputMismatchException e){
            System.out.println("please enter only numbers");
        }
        scanner.close();

    }
}

class Rectangle{
    private double width;
    private double length;

    public Rectangle(double width, double length){
        if(width<=0 || length<=0){
            throw new IllegalArgumentException("width and length should be positive");
        }
        this.width = width;
        this.length = length;
    }

    public double calculateArea(){
        return width*length;
    }
}
