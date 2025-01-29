package data_structures_lesson3.homework;

import java.util.HashSet;
import java.util.Set;

public class Task6 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 5, 3, 2, 1};
        System.out.println(count(arr));
    }

    public static int count(int[] nums){
        Set<Integer> uniqueNumbers = new HashSet<>();

        for (int num : nums) {
            uniqueNumbers.add(num);
        }
        return uniqueNumbers.size();
    }
}
