package basics_lesson1.homework.if_switch;

import java.util.InputMismatchException;
import java.util.Scanner;

public class DivisionOn3And5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try{
            System.out.print("Enter number: ");
            int num = scanner.nextInt();
            System.out.println("Result: " + divideOn3And5(num));
        } catch (InputMismatchException e){
            System.out.println("please enter a number");
        }

        scanner.close();
    }

    public static String divideOn3And5(int num){
        if(num%3==0 && num%5==0){
            return "Can be divided on 3 and 5";
        } else {
            return "Cannot be divided on 3 and 5";
        }
    }
}
