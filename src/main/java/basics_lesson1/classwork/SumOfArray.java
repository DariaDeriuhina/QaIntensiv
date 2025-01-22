package basics_lesson1.classwork;

import org.testng.Assert;

import java.util.Arrays;

public class SumOfArray {

    public static void main(String[] args) {
    int[] array = new int[100];
    for(int i =0; i<100; i++){
        array[i] = i+1;
    }

    Assert.assertEquals(sumArray(array), 5050);
}

        public static int sumArray(int[] array){
            int sum = 0;

            for(int i = 0; i<=array.length-1; i++){
                sum += array[i];
            }

            return sum;
        }

        public static int sumArrayWithStream(int[] array){
            return Arrays.stream(array).sum();
        }
}
