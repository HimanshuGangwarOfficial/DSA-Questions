package dev.himanshu.StriverSDE.Arrays;

public class LongestSubArrayWithSumKPositiveBrute1 {
    public static void main(String[] args) {

        int[] arr = {10, 5, 2, 7, 1, -10};
        int targetSum = 15;
        int maxLength = longestSubarray(arr, targetSum);
        System.out.println(maxLength);
    }

    public static int longestSubarray(int[] arr, int targetSum) {
        int maxLength = 0;

        for(int i = 0; i< arr.length; i++){
            for(int j=i; j< arr.length; j++){
                int sum = 0;
                for(int k=i ;k<=j; k++){
                    sum+=arr[k];
                }
                if(sum == targetSum)
                    maxLength = Math.max(maxLength, j-i+1);
            }
        }

        return maxLength;
    }
}
