package basics_lesson1.homework.if_switch;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TimeOfYear {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter your month in number: ");
            int month = scanner.nextInt();
            System.out.println("Result: " + defineTimeOfYear(month));
        } catch (InputMismatchException e){
            System.out.println("Put number from 1 to 12");
        }

        scanner.close();
    }

    public static String defineTimeOfYear(int month){
        return switch (month) {
            case 1, 2, 12 -> "Winter";
            case 3, 4, 5 -> "Spring";
            case 6, 7, 8 -> "Summer";
            case 9, 10, 11 -> "Autumn";
            default -> "You entered incorrect month";
        };
    }
}
