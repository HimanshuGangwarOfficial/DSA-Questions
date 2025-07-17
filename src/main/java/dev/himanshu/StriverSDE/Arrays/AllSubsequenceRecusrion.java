package dev.himanshu.StriverSDE.Arrays;

import java.util.ArrayList;
import java.util.List;

public class AllSubsequenceRecusrion {

    public static void main(String[] args) {
        printAllSubsequences(new int[] {1,2,3});
    }

    public static void printAllSubsequences(int[] arr){
        subsequences(arr, 0, new ArrayList<>());
    }

    private static void subsequences(int[] arr, int index, List<Integer> current){
        if(index >= arr.length){
            System.out.println(current);
            return;
        }
        current.add(arr[index]);
        subsequences(arr, index+1, current);

        current.remove(current.size()-1);
        subsequences(arr, index+1, current);
    }
}
