package basics_lesson1.classwork;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] nums = {1, 4, 3, 2, 5};
        sortAsc(nums);
        System.out.println(Arrays.toString(nums));
        sortDesc(nums);
        System.out.println(Arrays.toString(nums));

    }

    public static void sortAsc(int[] nums){
        int n = nums.length;
        boolean flag;

        for(int i = 0; i<n-1; i++) {
            flag = false;
            for (int j = 0; j < n - i - 1; j++) {
                if (nums[j] > nums[j + 1]) {
                    int temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                    flag = true;
                }
            }

            if(!flag){
                break;
            }
        }

    }

    public static void sortDesc(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] > nums[i]) {
                    int temp = nums[j];
                    nums[j] = nums[i];
                    nums[i] = temp;
                }
            }
        }
    }
}
