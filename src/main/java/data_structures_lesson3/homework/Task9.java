package data_structures_lesson3.homework;

import java.util.Arrays;
import java.util.Collections;
import java.util.PriorityQueue;

public class Task9 {
    public static void main(String[] args) {
        int[] array = new int[]{1, 2, 3, 4, 5};
        sort(array);
        System.out.println(Arrays.toString(array));
    }

    public static int[] sort(int[] array){
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>(Collections.reverseOrder());

        for(int i:array){
            priorityQueue.offer(i);
        }

        int index = 0;
        while(!priorityQueue.isEmpty()){
            array[index++] = priorityQueue.poll();
        }

        return array;
    }
}
