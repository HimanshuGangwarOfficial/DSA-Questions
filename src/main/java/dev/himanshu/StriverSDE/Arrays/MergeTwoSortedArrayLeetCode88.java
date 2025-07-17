package dev.himanshu.StriverSDE.Arrays;

import java.util.Arrays;

public class MergeTwoSortedArrayLeetCode88 {
    public static void main(String[] args) {
        int[] nums1 = {4,5,6,0,0,0};
        int m = 3;
        int[] nums2 = {1,2,3};
        int n = 3;

        merge(nums1, m, nums2, n);
        Arrays.stream(nums1).forEach(System.out::print);
        System.out.println();
        Arrays.stream(nums2).forEach(System.out::print);
    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {

        int p1 = m - 1;
        int p2 = n - 1;
        int pMerge = m + n - 1;

        while (p2 >= 0) {
            if (p1 >= 0 && nums1[p1] > nums2[p2]) {
                nums1[pMerge--] = nums1[p1--];
            } else {
                nums1[pMerge--] = nums2[p2--];
            }
        }
    }
}
