package basics_lesson1.homework.nested_loops;

public class StarsPyramid {
    public static void main(String[] args) {
        printPyramid(3);
    }

    public static void printPyramid(int n){
        for(int i = 0; i<n; i++){
            for(int k = 0; k<n-i-1; k++){
                System.out.print(" ");
            }
            for(int j = 0; j<2*i+1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
