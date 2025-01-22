package basics_lesson1.homework.basic_operations;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CelsiusToFahrenheit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try{
            System.out.print("Enter celsius: ");
            double degree = scanner.nextDouble();
            System.out.println("Temperature in Fahrenheit: " + covertCelsiusToFahrenheit(degree));
        } catch (InputMismatchException e){
            System.out.println("Please enter a number");
        }
        scanner.close();
    }

    public static double covertCelsiusToFahrenheit(double degree){
        return degree*9/5+32;
    }
}
