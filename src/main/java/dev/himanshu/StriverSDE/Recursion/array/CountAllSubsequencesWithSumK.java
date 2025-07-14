package dev.himanshu.StriverSDE.Recursion.array;


import java.util.ArrayList;
import java.util.List;

/*
*  Print all the subsequences with the given sum K
* */
public class PrintAllSubsequencesWithSumK {
    public static void main(String[] args) {
        int[] arr = {1,2,1};
        int k = 2;
        subsequences(arr, k);
    }

    private static void subsequences(int[] arr, int target){
        subsequences(arr, 0, new ArrayList<>(), 0, target);
    }

    private static void subsequences(int[] arr, int index, List<Integer> list, int sum, int target){
        if(index == arr.length ){
            if(sum==target)
                System.out.println(list);
            return;
        }
        list.add(arr[index]);
        subsequences(arr, index+1, list, sum+arr[index], target );
        list.remove(list.size()-1);
        subsequences(arr, index+1, list, sum, target);
    }
}
