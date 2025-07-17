package dev.himanshu.StriverSDE.Arrays;

import java.util.HashMap;
import java.util.Map;

public class LongestSubArrayWithSumKPositiveBetter {
    public static void main(String[] args) {

        int[] arr = {10, 5, 2, 7, 1, -10};
        int targetSum = 15;
        int maxLength = longestSubarray(arr, targetSum);
        System.out.println(maxLength);
    }

    public static int longestSubarray(int[] arr, int targetSum) {
        int maxLength = 0;

        Map<Long, Integer> map = new HashMap<>();
        long sum = 0;
        for(int i=0;i<arr.length;i++){
            sum+=(long)arr[i];

            if(sum==targetSum)
                maxLength = Math.max(maxLength, i+1);

            if(map.containsKey(sum-targetSum)){
                maxLength = Math.max(maxLength, i- map.get(sum-targetSum));
            }

            if(!map.containsKey(sum))
                map.put(sum, i);

        }

        return maxLength;
    }
}
