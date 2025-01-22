package basics_lesson1.homework.forCycle;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MultipleTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try{
            System.out.print("Enter number: ");
            int num = scanner.nextInt();
            showMultiplyTableForNumber(num);
        } catch (InputMismatchException e){
            System.out.println("please enter a number");
        }

        scanner.close();
    }

    public static void showMultiplyTableForNumber(int n){
        for(int i =1; i<=10; i++){
            System.out.println(n + " * " + i + " = " + n*i);
        }
    }
}
