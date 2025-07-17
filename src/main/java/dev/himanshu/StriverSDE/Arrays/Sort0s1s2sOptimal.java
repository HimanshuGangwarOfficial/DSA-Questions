package dev.himanshu.StriverSDE.Arrays;

import java.util.Arrays;

public class Sort0s1s2sOptimal {

    public static void main(String[] args) {

        int[] arr = {2,0,1};

        sort(arr);
        Arrays.stream(arr).forEach(System.out::print);
    }

    private static void sort(int[] arr) {

        int low = 0;
        int mid = 0;
        int high = arr.length-1;

        while(mid <= high){
            if(arr[mid] == 0){
                swap(arr, low, mid);
                low++;
                mid++;
            } else if (arr[mid] == 1) {
                mid++;
            } else if(arr[mid] ==2){
                swap(arr, mid, high);
                high--;
            }
        }

    }

    private static void swap(int[] arr,int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
