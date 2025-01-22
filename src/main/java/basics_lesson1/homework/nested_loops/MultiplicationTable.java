package basics_lesson1.homework.nested_loops;

public class MultiplicationTable {
    public static void main(String[] args) {
        printMultiplicationTable();
    }

    public static void printMultiplicationTable(){
        for(int i =1; i<=10; i++){
            for(int j = 1; j<=10; j++){
                System.out.println(i + " * " + j + " = " + i*j);
            }
        }
    }
}
