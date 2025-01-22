package basics_lesson1.homework.nested_loops;

import java.util.InputMismatchException;
import java.util.Scanner;

public class StarsRectangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter width: ");
            int n = scanner.nextInt();
            System.out.print("Enter length: ");
            int m = scanner.nextInt();
            printStars(3, 4);
        } catch (InputMismatchException e){
            System.out.println("Please enter numbers");
        }

        scanner.close();

    }

    public static void printStars(int n, int m){
        for(int i = 0; i<n; i++){
            for(int j = 0; j<m; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
