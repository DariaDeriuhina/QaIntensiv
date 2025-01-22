package basics_lesson1.homework.if_switch;

import java.util.InputMismatchException;
import java.util.Scanner;

public class AgeCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try{
            System.out.print("Enter age: ");
            int age = scanner.nextInt();
            if(age<0){
                System.out.println("Age can't be negative");
            } else {
                System.out.println("Result: " + showCategoryBasedOnAge(age));
            }
        } catch (InputMismatchException e){
            System.out.println("please enter a number");
        }

        scanner.close();
    }

    public static String showCategoryBasedOnAge(int age){
        if(age>=0 && age<=12){
            return "Child";
        }
        else if(age>=13 && age<=17){
            return "Teenager";
        } else if(age>=18 && age<=64){
            return "Adult";
        } else if (age>=65) {
            return "Retired";
        }
        return "Invalid age";

    }
}
