package dev.himanshu.StriverSDE.Recursion.array;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int[] a = {1,2,3,4,5,6,7,8,9};
//        reverse(a, 0, a.length-1);
        reverse(a, 0);
        Arrays.stream(a).forEach(System.out::println);
    }

    /*
    *  This method reverse the array using two pointers
    * */
    public static void reverse(int[] a, int left, int right){
        if(left >= right)
            return;
        swap(a, left, right);
        reverse(a,left+1, right-1);
    }

    private static void swap(int[] a, int left, int right) {
        int temp = a[left];
        a[left] = a[right];
        a[right] = temp;
    }

    /*
    *  This method reverse the array using only one pointer
    * */
    public static void reverse(int[] a, int i){

        if(i>=a.length/2)
            return;
        swap(a, i, a.length-1-i);
        reverse(a, i+1);
    }
}
