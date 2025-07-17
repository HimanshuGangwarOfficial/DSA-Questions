package dev.himanshu.StriverSDE.Recursion.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
*  https://leetcode.com/problems/subsets-ii/description/
* */
public class Subset2 {
    public static void main(String[] args) {
        int[] arr = {4,4,4,1,4};
        Arrays.sort(arr);
        List<List<Integer>> ans = subset(arr);
        ans.forEach(System.out::println);
    }

    private static List<List<Integer>> subset(int[] arr){
        List<List<Integer>> ans = new ArrayList<>();
        subset(arr, 0, new ArrayList<>(), ans);
        return ans;
    }

    private static void subset(int[] arr, int index, List<Integer> result, List<List<Integer>> ans){

        ans.add(new ArrayList<>(result));

        for(int i=index; i< arr.length; i++){

            if(i>index && arr[i] == arr[i-1]) continue;

            result.add(arr[i]);
            subset(arr, i+1, result, ans);
            result.remove(result.size()-1);
        }

    }
}
