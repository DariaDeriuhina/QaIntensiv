package basics_lesson1.homework.basic_operations;

import java.util.InputMismatchException;
import java.util.Scanner;

public class SumAndSubtraction {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter first number: ");
            double num1 = scanner.nextDouble();
            System.out.print("Enter second number: ");
            double num2 = scanner.nextDouble();
            printResult(num1, num2);
        } catch (InputMismatchException e){
            System.out.println("You can enter only numbers");
        }

        scanner.close();

    }

    public static void printResult(double a, double b){
        System.out.println("Sum: " + sum(a, b));
        System.out.println("Difference: " + subtract(a, b));
    }

    public static double sum(double a, double b){
        return a+b;
    }

    public static double subtract(double a, double b){
        return a-b;
    }
}
