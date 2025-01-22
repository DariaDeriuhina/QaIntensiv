package basics_lesson1.classwork;

import org.testng.Assert;

public class EvenNum {
    public static void main(String[] args) {
        int num = 2;
        int num2 = 3;
        Assert.assertEquals(isNumberEven(2), "Even");
        Assert.assertEquals(isNumberEven(3), "Not Even");

    }

    public static String isNumberEven(int i){
        if(i%2==0){
            return "Even";
        } else return "Not Even";

    }
}
