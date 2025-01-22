package basics_lesson1.homework.if_switch;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number: ");
        double num = scanner.nextDouble();

        System.out.print("Enter operation: ");
        String operation = scanner.next();

        System.out.print("Enter second number: ");
        double num2 = scanner.nextDouble();

        switch (operation){
            case "+":
                System.out.println("Result: " + sum(num, num2));
                break;
            case "-":
                System.out.println("Result: " + subtract(num, num2));
                break;
            case "*":
                System.out.println("Result: " + multiply(num, num2));
                break;
            case "/":
                System.out.println("Result: " + divide(num, num2));
                break;
            default:
                System.out.println("Unknown operation");
        }

        scanner.close();

    }

    public static double sum(double a, double b) {
        return a + b;
    }

    public static double subtract(double a, double b) {
        return a - b;
    }

    public static double multiply(double a, double b) {
        return a * b;
    }

    public static double divide(double a, double b) {
        if (b == 0) {
            throw new IllegalArgumentException("You can't divide on zero");
        }
        return a / b;
    }
}
