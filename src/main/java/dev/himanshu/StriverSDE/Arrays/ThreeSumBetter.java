package dev.himanshu.StriverSDE.Arrays;

import java.util.*;

public class ThreeSumBetter {
    public static void main(String[] args) {

    }

    public List<List<Integer>> threeSum(int[] nums) {

        List<List<Integer>> ans = new ArrayList<>();
//        Set<List<Integer>> temp = new HashSet<>();


        for(int i=0; i< nums.length; i++){
            Set<Integer> set = new HashSet<>();
            for(int j=i+1; j< nums.length; j++){
                int rem = -(nums[i] + nums[j]);
                if(set.contains(rem)){




                }
            }
        }

        return ans;

    }

}
