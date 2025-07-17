package dev.himanshu.StriverSDE.Recursion.array;

import java.util.ArrayList;
import java.util.List;

public class PrintAllSubsequences {
    public static void main(String[] args) {
        int[] arr = {3,1,2};
        subsequences(arr, 0, new ArrayList<>());
    }

    private static void subsequences(int[] arr, int index,List<Integer> list){

        if(index >= arr.length){
            System.out.println(list);
            return;
        }

        list.add(arr[index]);
        subsequences(arr, index+1, list);
        list.remove(list.size()-1);
        subsequences(arr, index+1, list);

    }
}
