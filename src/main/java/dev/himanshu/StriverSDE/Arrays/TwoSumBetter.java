package dev.himanshu.StriverSDE.Arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSumBetter {

    public static void main(String[] args) {
        int[] nums = {2,7,11,15};
        int[] ans = twoSum(nums, 9);
        Arrays.stream(ans).forEach(System.out::println);
    }

    public static int[] twoSum(int[] nums, int target) {

        int[] ans = new int[2];
        Map<Integer, Integer> map = new HashMap<>();

        for(int i=0; i<nums.length; i++){

            int rem = target - nums[i] ;
            if(map.containsKey(rem)){
                return new int[] {map.get(rem), i};
            }

            map.put(nums[i], i);
        }

        return ans;
    }
}
