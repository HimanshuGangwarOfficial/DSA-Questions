package dev.himanshu.StriverSDE.Recursion.array;

import java.util.ArrayList;
import java.util.List;

public class PrintAllPermutationsApproach2 {

    public static void main(String[] args) {
        int[] arr = {1,2,3};
        List<List<Integer>> ans = permutations(arr);
        ans.forEach(System.out::println);
    }

    private static List<List<Integer>> permutations(int[] arr){
        List<List<Integer>> ans = new ArrayList<>();
        permutations(arr, 0,  ans);
        return ans;
    }

    private static void permutations(int[] arr, int index, List<List<Integer>> ans) {

        if(index==arr.length){
            List<Integer> result = new ArrayList<>();
            for(int num: arr){
                result.add(num);
            }
            ans.add(new ArrayList<>(result));
            result.clear();
            return;
        }

        for(int i=index; i< arr.length; i++){
            swap(arr, i, index);
            permutations(arr, index+1,ans);
            swap(arr, i, index);
        }
    }

    private static void swap(int[] arr, int i, int index) {
        int temp = arr[i];
        arr[i] = arr[index];
        arr[index] = temp;
    }
}
