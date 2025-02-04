package complex_tasks_lesson5.homework.task4;

import java.util.Arrays;

public class MergeSortedArray {
    public static void main(String[] args) {
        int[] nums1 = {0,0,0};
        int m = 0;
        int[] nums2 = {2,5,6};
        int n = 3;
        mergeArray(nums1, nums2, m, n);
        System.out.println(Arrays.toString(nums1));

    }

    public static void mergeArray(int num[], int num2[], int m, int n){
        int k = m-1;
        int f = n-1;
        int d = m+n-1;
        while(f>=0 && k>=0){
            if(num2[f]>num[k]){
                num[d]=num2[f];
                f--;
            } else {
                num[d]=num[k];
                k--;
            }
            d--;
        }

        while(f>=0){
            num[d] = num2[f];
            f--;
            d--;
        }
    }
}
