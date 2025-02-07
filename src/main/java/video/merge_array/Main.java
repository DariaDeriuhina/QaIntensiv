package video.merge_array;

import java.util.Arrays;

public class Main {
    //[1,2,3,0,0,0], m = 3
    //[2,5,6], n = 3
    public static void main(String[] args) {
        int[] nums1 = {0,0,0};
        int[] nums2 = {2, 5, 6};
        int m = 0;
        int n = 3;

        mergeSortedArray(nums1, nums2, m, n);
        System.out.println(Arrays.toString(nums1));
    }

    public static void mergeSortedArray(int[] nums1, int[] nums2, int m, int n){
        int first = m -1;
        int second = n-1;
        int total = m+n-1;

        while(first>=0 && second>=0){
            if(nums1[first]>=nums2[second]){
                nums1[total]=nums1[first];
                first--;
            } else {
                nums1[total] = nums2[second];
                second--;
            }

            total--;
        }

        while(second>=0){
            nums1[total] = nums2[second];
            total--;
            second--;
        }
    }
}
