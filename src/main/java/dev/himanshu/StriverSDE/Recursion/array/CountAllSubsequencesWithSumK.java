package dev.himanshu.StriverSDE.Recursion.array;


import java.util.ArrayList;
import java.util.List;

/*
*  Print all the subsequences with the given sum K
* */
public class CountAllSubsequencesWithSumK {
    public static void main(String[] args) {
        int[] arr = {1,2,1, 3, 4};
        int k = 4;
        int ans = subsequences(arr, k);
        System.out.println(ans);
    }

    private static int subsequences(int[] arr, int target){
       return subsequences(arr, 0, new ArrayList<>(), 0, target);
    }


    /*
    *   To count all the subsequences:
    *   1. change recursive function to functional wau (Return 0 or 1)
    *   2. if condition satisfied return 1
    *      else return 0
    *   3. hold the return value of recursive call
    *       left = f()
    *       right = f()
    *       return left + right
    * */
    private static int subsequences(int[] arr, int index, List<Integer> list, int sum, int target){
        if(index == arr.length ){
            if(sum==target){
                return 1;
            }
            return 0;
        }
        list.add(arr[index]);
        int left =  subsequences(arr, index+1, list, sum+arr[index], target );
        list.remove(list.size()-1);
        int right = subsequences(arr, index+1, list, sum, target);

        return left + right;
    }
}
