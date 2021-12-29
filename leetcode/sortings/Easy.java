package com.san.leetcode.sortings;

public class Easy {
    public static void main(String[] args){
        System.out.println("Hi this is san!");
    }

//    1. https://leetcode.com/problems/merge-sorted-array/
    static void merge(int[] nums1, int m, int[] nums2, int n) {
        int pt1 = 0;
        int pt2 = 0;
        while (pt1<m+n && pt2<n){
            if (nums1[pt1]>=nums2[pt2]){
                slide1(nums1, pt1);
                nums1[pt1]=nums2[pt2];
                pt1++;
                pt2++;
            }
            else {
                pt1++;
            }
        }
    }
    static void slide1(int[] arr, int index){
        for (int i = arr.length-2;i >= index; i--) {
            arr[i+1] = arr[i];
        }
    }

}
