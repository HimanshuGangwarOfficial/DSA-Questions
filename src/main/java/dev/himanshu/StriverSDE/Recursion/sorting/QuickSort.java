package dev.himanshu.StriverSDE.Recursion.sorting;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1, 6};
        quickSort(arr);
        Arrays.stream(arr).forEach(System.out::println);
    }

    private static void quickSort(int[] arr) {
        quickSort(arr, 0, arr.length-1);
    }

    private static void quickSort(int[] arr, int low, int high){

        if(low>=high)
            return;

        int pivotIndex = pivotPlacement(arr, low, high);
        quickSort(arr, low, pivotIndex-1);
        quickSort(arr, pivotIndex+1, high);
    }

    private static int pivotPlacement(int[] arr, int low, int high) {
        int left = low+1;
        int right = high;
        int pivot = arr[low];

        while(left<=right){

            while(left<=right && arr[left] <= pivot ){
                left++;
            }

            while(left <= right && arr[right] > pivot){
                right--;
            }

            if(left<right){
                swap(arr, left, right );
            }
        }

        swap(arr, low, right);

        return right;
    }

    private static void swap(int[] arr, int left, int right) {
        int temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;
    }
}
