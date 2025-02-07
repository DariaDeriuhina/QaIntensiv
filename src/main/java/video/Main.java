package video;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 9;

        int[] num2 = {0};
        int target2 = 9;

        System.out.println(Arrays.toString(findTwoSum(nums, target)));
        System.out.println(Arrays.toString(findTwoSum(num2, target2)));
    }

    public static int[] findTwoSum(int[] num, int target){
        for(int i = 0; i< num.length-1; i++){
            for(int j = i+1; j<num.length-1; j++){
                if(num[i] + num[j] == target){
                    return new int[]{i, j};
                }
            }
        }

        return null;
    }
}
