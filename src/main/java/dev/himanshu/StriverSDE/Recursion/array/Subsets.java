package dev.himanshu.StriverSDE.Recursion.array;

import java.util.ArrayList;
import java.util.List;

/*
*  https://leetcode.com/problems/subsets/description/
* */
public class Subsets {

    public static void main(String[] args) {

        int[] arr = {1,2,3};
        List<List<Integer>> ans = subsets(arr);
        ans.forEach(System.out::println);

    }

    private static List<List<Integer>> subsets(int[] arr){
        List<List<Integer>> ans = new ArrayList<>();
        subsets(arr, 0, new ArrayList<>(), ans);
        return  ans;
    }

    private static void subsets(int[] arr, int index, List<Integer> result, List<List<Integer>> ans){

        if(index >= arr.length){
            ans.add(new ArrayList<>(result));
            return;
        }

        result.add(arr[index]);
        subsets(arr, index+1,result, ans);
        result.remove(result.size()-1);
        subsets(arr, index+1, result, ans);
    }
}
