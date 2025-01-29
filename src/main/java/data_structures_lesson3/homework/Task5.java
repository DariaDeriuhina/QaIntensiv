package data_structures_lesson3.homework;

import java.util.LinkedList;
import java.util.Queue;

public class Task5 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int n = 2;
        rotate(arr, n);
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

    public static void rotate(int[] array, int n){
        if(array == null || array.length<=1 || n<=0){
            return;
        }

        Queue<Integer> queue = new LinkedList<>();
        for(int i:array){
            queue.offer(i);
        }

        int n2 = n%array.length;

        for(int i =0; i<=n2; i++){
            int k = queue.poll();
            queue.offer(k);
        }

        int i = 0;
        for(int num:queue){
            array[i] = num;
            i++;
        }

    }
}
