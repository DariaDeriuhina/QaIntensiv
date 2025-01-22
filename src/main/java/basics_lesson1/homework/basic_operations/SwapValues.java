package basics_lesson1.homework.basic_operations;

public class SwapValues {
    public static void main(String[] args) {
        int a = 5;
        int b = 10;
        swapValues(a, b);
    }

    public static void swapValues(int a, int b){
        System.out.println("Before swap : a = " + a + ", b = " + b );
        a = a+b;
        b = a-b;
        a = a-b;
        System.out.println("After swap : a = " + a + ", b = " + b );
    }
}
