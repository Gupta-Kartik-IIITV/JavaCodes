package DSA;

import java.util.Arrays;

public class PrefixSum {

    public static int[] prefixSum(int[] nums){
        int[] prefixSum = new int[nums.length];
        prefixSum[0] = nums[0];
        for(int i=1;i<nums.length;i++){
            prefixSum[i] = prefixSum[i-1] + nums[i];
        }

        return prefixSum;
    }


    public static void main(String[] args) {
        int[] nums = {1,3,5,8,4,1}; // Prefix Sum == [1, 4, 9, 17, 21, 22]
        System.out.print(Arrays.toString(prefixSum(nums)));
    }
}
