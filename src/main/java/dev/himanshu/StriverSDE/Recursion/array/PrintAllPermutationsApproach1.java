package dev.himanshu.StriverSDE.Recursion.array;

import java.util.ArrayList;
import java.util.List;

public class PrintAllPermutationsApproach1 {
    public static void main(String[] args) {

        int[] arr = {1,2,3};
        List<List<Integer>> ans = permutations(arr);
        ans.forEach(System.out::println);
    }

    private static List<List<Integer>> permutations(int[] arr){
        List<List<Integer>> ans = new ArrayList<>();
        boolean[] freq = new boolean[arr.length];
        permutations(arr, freq, new ArrayList<>(),ans);

        return ans;
    }

    private static void permutations(int[] arr,boolean[] freq, List<Integer> result, List<List<Integer>> ans){

        if(result.size() == arr.length){
            ans.add(new ArrayList<>(result));
            return;
        }

        for(int i=0; i< arr.length; i++){
            if(!freq[i]){
                result.add(arr[i]);
                freq[i] = true;
                permutations(arr, freq, result, ans);
                result.remove(result.size()-1);
                freq[i] = false;
            }
        }
    }
}
