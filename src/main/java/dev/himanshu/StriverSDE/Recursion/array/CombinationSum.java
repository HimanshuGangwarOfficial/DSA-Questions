package dev.himanshu.StriverSDE.Recursion.array;

import java.util.ArrayList;
import java.util.List;

/*
*  https://leetcode.com/problems/combination-sum/description/
* */

public class CombinationSum {

    public static void main(String[] args) {
        int[] arr = {2,3,6,7};
        int target = 7;
        List<List<Integer>> ans = combinations(arr, target);
        System.out.println(ans);
    }

    private static List<List<Integer>> combinations(int[] arr, int target){
        List<List<Integer>> ans = new ArrayList<>();

        combinations(arr, target,0, new ArrayList<Integer>(), ans);

        return ans;

    }

    private static void combinations(int[] arr, int target,int index, ArrayList<Integer> result, List<List<Integer>> ans) {

        if(index >= arr.length){
            if(target==0){
                ans.add(new ArrayList<>(result));
            }
            return;
        }

        if(arr[index] <= target) {
            result.add(arr[index]);
            combinations(arr, target - arr[index], index, result, ans);
            result.remove(result.size() - 1);
        }
        combinations(arr, target, index+1, result, ans);
    }
}
