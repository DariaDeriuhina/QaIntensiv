package data_structures_lesson3.classwork;

import java.util.Arrays;

public class TaskArray {
    public static void main(String[] args) {
        int[] array = new int[]{1,2,3,4,5,6,7};
        returnArray(array);
        System.out.println(Arrays.toString(array));
    }

    public static int[] returnArray(int[] array){
        int li = 0;
        int ri = array.length-1;

        while(li<ri){
            int temp = array[li];
            array[li] = array[ri];
            array[ri] = temp;

            li++;
            ri--;
        }

        return array;
    }
}
