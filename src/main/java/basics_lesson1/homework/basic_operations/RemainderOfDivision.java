package basics_lesson1.homework.basic_operations;

import java.util.InputMismatchException;
import java.util.Scanner;

public class RemainderOfDivision {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try{
            System.out.print("Enter first number: ");
            int a = scanner.nextInt();
            System.out.print("Enter second number: ");
            int b = scanner.nextInt();
            printRemainderOfDivision(a, b);
        } catch (InputMismatchException e){
            System.out.println("You can enter only int numbers");
        }
        scanner.close();

    }

    public static void printRemainderOfDivision(int a, int b){
        System.out.println("Division Result: " + divide(a, b));
        System.out.println("Remainder Result: " + calculateRemainder(a, b));

    }

    public static int divide(int a, int b){
        if(b==0){
            throw new IllegalArgumentException("You can't divide on zero");
        }
        return a/b;
    }

    public static int calculateRemainder(int a, int b){
        if(b==0){
            throw new IllegalArgumentException("You can't divide on zero");
        }
        return a%b;
    }
}
