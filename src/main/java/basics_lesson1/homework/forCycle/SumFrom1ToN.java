package basics_lesson1.homework.forCycle;

import java.util.InputMismatchException;
import java.util.Scanner;

public class SumFrom1ToN {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try{
            System.out.print("Enter N: ");
            int num = scanner.nextInt();
            System.out.println("Result: " + sumFrom1ToN(num));
        } catch (InputMismatchException e){
            System.out.println("please enter a number");
        }

        scanner.close();
    }

    public static int sumFrom1ToN(int n){
        int sum = 0;
        for(int i = 1; i<=n; i++){
            sum += i;
        }

        return sum;
    }
}
