package basics_lesson1.classwork;

public class PrintNumsDiv3And5 {
    public static void main(String[] args) {
        printNums();
    }

    public static void printNums(){
        for(int i = 1; i<100; i++){
            if(i%3==0 || i%5==0){
                System.out.println(i);
            }
        }
    }
}
