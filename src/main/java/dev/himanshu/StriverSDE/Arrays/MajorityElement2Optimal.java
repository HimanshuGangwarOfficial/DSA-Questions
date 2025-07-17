package dev.himanshu.StriverSDE.Arrays;

import java.util.ArrayList;
import java.util.List;

public class MajorityElement2Optimal {

    public static void main(String[] args) {
        int[] nums = {3,2,3};
        List<Integer> ans = majorityElement(nums);
        System.out.println(ans);
    }

    public static List<Integer> majorityElement(int[] nums) {
        int count1 = 0, count2 = 0;
        int ans1 = -1, ans2 = -1;

        List<Integer> ans = new ArrayList<>();

       for(int i=0; i< nums.length; i++){
           if(count1 == 0 && nums[i] != ans2) {
               count1++;
               ans1 = nums[i];
           } else if(count2==0 && nums[i]!=ans1){
               count2++;
               ans2 = nums[i];
           } else if(nums[i] == ans1){
               count1++;
           } else if(nums[i] == ans2){
               count2++;
           } else {
               count1--;
               count2--;
           }
       }
       count1=0;
       count2=0;
       for(int i=0; i< nums.length; i++){
           if(nums[i] == ans1){
               count1++;
           } else if(nums[i] == ans2){
               count2++;
           }
       }
       if(count1 > nums.length/3){
           ans.add(ans1);
       }
       if(count2 > nums.length/3){
           ans.add(ans2);
       }


       return ans;

    }
}
