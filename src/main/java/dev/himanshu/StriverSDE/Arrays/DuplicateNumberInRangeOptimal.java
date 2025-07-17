package dev.himanshu.StriverSDE.Arrays;

public class DuplicateNumberInRangeOptimal {
    public static void main(String[] args) {

        int[] nums = {1,3,4,2,2};
        int number = findDuplicate(nums);
        System.out.println(number);
    }

    public static int findDuplicate(int[] nums) {

        int fast = nums[0];
        int slow = nums[0];

        do{
            slow = nums[slow];
            fast = nums[nums[fast]];
        }while(fast!=slow);

        fast = nums[0];

        while(fast != slow){
            slow = nums[slow];
            fast = nums[fast];
        }

        return slow;

    }
}
