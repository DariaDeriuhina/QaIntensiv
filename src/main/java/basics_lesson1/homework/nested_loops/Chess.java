package basics_lesson1.homework.nested_loops;

public class Chess {
    public static void main(String[] args) {
        printChess(4);
    }

    public static void printChess(int n){
        for(int i=0; i<n; i++){
            for(int j =0; j<n; j++){
                if((i+j)%2==0){
                    System.out.print("#");
                } else {
                    System.out.print(".");
                }
            }
            System.out.println();
        }
    }
}
