package dev.himanshu.StriverSDE.Recursion.array;


import java.util.ArrayList;
import java.util.List;

/*
*  Print all the subsequences with the given sum K
* */
public class PrintAnySubsequenceWithSumK {
    public static void main(String[] args) {
        int[] arr = {1,2,1,3,4};
        int k = 4 ;
        subsequences(arr, k);
    }

    private static void subsequences(int[] arr, int target){
        subsequences(arr, 0, new ArrayList<>(), 0, target);
    }


    /*
    *  If you want to print any one subsequence: [GOLDEN RULE]
    *  1. convert you recursive function to functional way (return boolean)
    *  2. if base condition met return true
    *     else return false
    *  3. during recursive call check if that return true
    *     if yes then return true which will avoid the further recursive call
    *
    * */
    private static boolean subsequences(int[] arr, int index, List<Integer> list, int sum, int target){
        if(index == arr.length ){
            if(sum==target) {
                System.out.println(list);
                return true;
            }
            return false;
        }
        list.add(arr[index]);
        if(subsequences(arr, index+1, list, sum+arr[index], target ))
            return true;

        list.remove(list.size()-1);

        if(subsequences(arr, index+1, list, sum, target))
            return true;

        return false;
    }
}
