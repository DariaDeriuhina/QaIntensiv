package basics_lesson1.homework.forCycle;

import java.util.InputMismatchException;
import java.util.Scanner;

public class EvenNumbersToN {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try{
            System.out.print("Enter N: ");
            int num = scanner.nextInt();
            System.out.print("Even numbers: ");
            evenNumsToN(num);
        } catch (InputMismatchException e){
            System.out.println("please enter a number");
        }

        scanner.close();
    }

    public static void evenNumsToN(int num){
        for(int i = 1; i<=num; i++){
            if(i%2==0){
                System.out.print(i + " ");
            }
        }
    }
}
