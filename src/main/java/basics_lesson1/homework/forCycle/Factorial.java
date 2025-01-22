package basics_lesson1.homework.forCycle;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try{
            System.out.print("Enter N: ");
            int num = scanner.nextInt();
            System.out.println("Factorial: " + calculateFactorial(num));
        } catch (InputMismatchException e){
            System.out.println("please enter a number");
        }

        scanner.close();
    }

    public static int calculateFactorial(int num){
        if(num==0){
            return 1;
        }

        int result = 1;
        for(int i = 1; i<=num; i++){
            result *= i;
        }
        return result;
    }
}
