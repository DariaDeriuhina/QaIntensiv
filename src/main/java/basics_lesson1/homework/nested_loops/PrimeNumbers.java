package basics_lesson1.homework.nested_loops;

public class PrimeNumbers {
    public static void main(String[] args) {
        printPrimeNumbers(10);
    }

    public static void printPrimeNumbers(int n){
        for(int i = 2; i<=n; i++){
            boolean flag = true;
            for(int j = 2; j<=Math.sqrt(i); j++){
                if(i%j==0){
                    flag = false;
                    break;
                }
            }
            if(flag){
                System.out.print(i + " ");
            }
        }
    }
}
