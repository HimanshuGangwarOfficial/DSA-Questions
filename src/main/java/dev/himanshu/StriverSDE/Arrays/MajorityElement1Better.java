package dev.himanshu.StriverSDE.Arrays;

import java.util.HashMap;
import java.util.Map;

public class MajorityElement1Better {

    public static void main(String[] args) {

        int[] nums = {2,2,1,1,1,2,2};
        int ans = majorityElement(nums);
        System.out.println(ans);
    }

    public static int majorityElement(int[] nums) {

        Map<Integer, Integer> map = new HashMap<>();

        for(int i=0; i<nums.length; i++){
            map.put(nums[i], map.getOrDefault(nums[i],0)+1);
        }

         int ans = map.entrySet().stream().filter(e -> e.getValue() > nums.length / 2).findAny().get().getKey();

        return ans;
    }

}
