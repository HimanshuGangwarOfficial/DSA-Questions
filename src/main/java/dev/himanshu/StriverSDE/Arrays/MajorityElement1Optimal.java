package dev.himanshu.StriverSDE.Arrays;

public class MajorityElement1Optimal {

    public static void main(String[] args) {

        int[] nums = {2,2,1,1,1,2,2};
        int ans = majorityElement(nums);
        System.out.println(ans);
    }

    // Moon's Voting algorithm
    public static int majorityElement(int[] nums) {

        int ans = 0;
        int count = 0;

        for(int i=0; i< nums.length; i++){
            if(count == 0){
                ans = nums[i];
            }
            if(nums[i] == ans){
                count++;
            } else{
                count--;
            }
        }

        return ans;

    }
}
