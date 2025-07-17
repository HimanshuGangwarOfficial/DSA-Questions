package dev.himanshu.StriverSDE.Arrays;

import java.util.Arrays;

public class LongestConsicutiveSeqBetter {
    public static void main(String[] args) {

        int[] nums = {9,1,4,7,3,-1,0,5,8,-1,6};
        int longest = longestConsecutive(nums);
        System.out.println(longest);
    }

    public static int longestConsecutive(int[] nums) {

        int longest = 1;
        int count = 1;
        Arrays.sort(nums);

        if(nums.length == 0) return 0;

        for(int i=0; i<nums.length-1; i++){

            if(nums[i+1] == nums[i]+1){
                count++;
            } else if(nums[i+1] == nums[i]){
                continue;
            } else{
                longest = Math.max(longest, count);
                count = 1;
            }
        }

        return Math.max(longest, count);

    }
}
