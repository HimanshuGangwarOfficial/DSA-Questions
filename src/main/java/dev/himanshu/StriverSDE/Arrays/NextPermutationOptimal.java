package dev.himanshu.StriverSDE.Arrays;

import java.util.Arrays;

public class NextPermutationOptimal {

    /*
    * Algo
    *
    * 1. Find the longest prefix : arr[i] < arr[i+1]
    * 2. find number > arr[i], int the arr[i+1] to arr[length-1].
    *    Once find swap number with arr[i]
    * 3. then sort the arr[i+1] to arr[length-1].
    * */

    public static void main(String[] args) {
        int[] nums = {3,2,1}; // 132
        nextPermutation(nums);
        printArray(nums);
    }

    private static void printArray(int[] nums) {

        Arrays.stream(nums).forEach(System.out::print);
    }

    private static void nextPermutation(int[] nums) {
        int index = -1;

        // Step-1
        for(int i = nums.length-2 ; i>=0; i--){
            if(nums[i] < nums[i+1]){
                index = i;
                break;
            }
        }

        // Step-2
        for(int i = nums.length-1; i>index ; i-- ){
            if(index != -1 && nums[i] > nums[index]){
                int temp = nums[i];
                nums[i] = nums[index];
                nums[index] = temp;

                break;
            }
        }

        //Step-3

        for(int i = index+1, j = nums.length-1; i<j ; i++, j--){
            int temp = nums[j];
            nums[j] = nums[i];
            nums[i] = temp;
        }


    }


}
