package com.san.leetcode.sortings;

import java.util.Arrays;

public class Easy {
    public static void main(String[] args){
        System.out.println("Hi this is san!");
        int[] arr = {3, 1, 5, 4, 2};
        System.out.println(Arrays.toString(arr));
//        bubbleSort(arr);
//        selectionSort(arr);
//        insertionSort(arr);
        cycleSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    static void bubbleSort(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            boolean is_sorted = true;
            for (int j = 1; j < arr.length-i; j++) {
                if (arr[j-1]>arr[j]){
                    swap(arr, j-1, j);
                    is_sorted = false;
                }
            }
            if (is_sorted)
                return;
        }
    }

    static void selectionSort(int[] arr){
        for (int i = 0; i < arr.length-1; i++) {
            int min_index = i;
            for (int j = i+1; j < arr.length; j++) {
                if (arr[j]<arr[min_index])
                    min_index = j;
            }
            swap(arr, i, min_index);
        }
    }

    static void insertionSort(int[] arr){
        for (int i = 1; i < arr.length; i++) {
            int e = arr[i];
            int j = i-1;
            while (j>=0 && e<arr[j]){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = e;
        }
    }

    static void cycleSort(int[] arr){
        int i = 0;
        while (i<arr.length){
            int correct_index = arr[i]-1;
            if (arr[i] == arr[correct_index]){
                i++;
            }
            else {
                swap(arr, i, correct_index);
            }
        }
    }

//    1. https://leetcode.com/problems/merge-sorted-array/
    static void merge(int[] nums1, int m, int[] nums2, int n) {

    }
}
