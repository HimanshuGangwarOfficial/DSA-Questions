package dev.himanshu.StriverSDE.Arrays;

import java.util.HashMap;
import java.util.Map;

public class CountSubArrayWithGivenSumOptimal {
    public static void main(String[] args) {

        int[] nums = {1,1,1};
        int k = 2;
        int count = subarraySum(nums, k);
        System.out.println(count);
    }

    public static int subarraySum(int[] arr, int targetSum) {
        int count = 0;

        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, 1); // Empty subarray has sum 0 with count 1
        int sum = 0;
        for(int i=0;i<arr.length;i++){

           sum+=arr[0];
           int presum = sum-targetSum;
           count+=map.getOrDefault(presum,0);
           map.put(sum, map.getOrDefault(sum,0)+1);
        }

        return count;
    }
}
