package dev.himanshu.StriverSDE.Arrays;

import java.util.Arrays;

public class MergeTwoSortedArrayWithoutExtraSpace {

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

        int left = m-1;
        int right = 0;

        while(left >=0 && right <= n-1){
            if(nums1[left] > nums2[right]){
                int temp = nums1[left];
                nums1[left] = nums2[right];
                nums2[right] = temp;
                left--;
                right++;
            } else{
                break;
            }
        }

        Arrays.sort(nums1, 0, m);
        Arrays.sort(nums2, 0, n);


    }
}
