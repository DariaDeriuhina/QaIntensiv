package data_structures_lesson3.homework;

import java.security.spec.RSAOtherPrimeInfo;

public class Task1 {
    public static void main(String[] args) {
        int[] array = new int[]{1,2,3,4,5};
        System.out.println(sumOfElements(array));
    }

    public static int sumOfElements(int[] array){
        int sum = 0;
        for(int i: array){
            sum += i;
        }

        return sum;
    }
}
