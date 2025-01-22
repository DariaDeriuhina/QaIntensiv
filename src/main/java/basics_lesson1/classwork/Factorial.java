package basics_lesson1.classwork;

import org.testng.Assert;

public class Factorial {
    public static void main(String[] args) {
        Assert.assertEquals(factorial(5), 120);
    }

    public static int factorial(int num){
        if(num == 0){
            return 1;
        }

        int result = 1;
        for(int i = 1; i<=num; i++){
            result *= i;
        }

        return result;
    }
}
