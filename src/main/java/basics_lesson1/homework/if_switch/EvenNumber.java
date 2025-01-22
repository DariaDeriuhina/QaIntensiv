package basics_lesson1.homework.if_switch;

import java.util.InputMismatchException;
import java.util.Scanner;

public class EvenNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try{
            System.out.print("Enter number: ");
            int num = scanner.nextInt();
            System.out.println("Result: " + isEven(num));
        } catch (InputMismatchException e){
            System.out.println("please enter a number");
        }

        scanner.close();
    }

    public static String isEven(int num){
        if(num%2==0){
            return "Even";
        } else return "Odd";
    }
}
