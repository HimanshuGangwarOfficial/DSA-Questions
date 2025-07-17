package dev.himanshu.StriverSDE.Recursion.array;

import java.util.ArrayList;
import java.util.List;


/*
*  Print all the subset sum in ascending order
* */
public class SubsetSum {

    public static void main(String[] args) {
        int[] arr = {3, 1, 2};
        List<Integer> ans = subsetSum(arr);
        ans.stream().sorted().forEach(System.out::println);
    }

    private static List<Integer> subsetSum(int[] arr){
        List<Integer> ans = new ArrayList<>();
        subsetSum(arr, 0, 0, ans);

        return ans;
    }

    private static void subsetSum(int[] arr, int index, int sum, List<Integer> ans){

        if(index >= arr.length) {
            ans.add(sum);
            return;
        }
        subsetSum(arr, index+1, sum+arr[index], ans );
        subsetSum(arr, index+1, sum, ans);
    }
}
