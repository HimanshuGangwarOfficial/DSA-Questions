package dev.himanshu.StriverSDE.Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ThreeSumOptimal {

    public static void main(String[] args) {
        int[] nums = {-1,0,1,2,-1,-4};
        List<List<Integer>> ans = threeSum(nums);
        ans.forEach(System.out::println);
    }

    /*
    * Two Pointer Approach
    * */

    public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();

        Arrays.sort(nums);
        for(int i=0 ; i<nums.length ; i++){

            if(i>0 && nums[i] == nums[i-1]) continue;

            int j = i+1;
            int k = nums.length-1;
            while(j<k){
                int sum = nums[i] + nums[j] + nums[k];
                if (sum<0) {
                    j++;
                } else if(sum > 0){
                    k--;
                } else{
                    ans.add(Arrays.asList(nums[i], nums[j], nums[k]));
                    j++;
                    k--;
                    while(j<k && nums[j] == nums[j-1]) j++;
                    while(j<k && nums[k] == nums[k+1]) k--;
                }
            }

        }

        return ans;
    }
}
