package com.san.Sorting;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args){
//        System.out.println("Hello");
        int[] arr = {-7, 45, 0, 4, -89, 3, 754, -32};
        System.out.println(Arrays.toString(arr));
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void bubbleSort(int[] arr){
        boolean is_sorted;
        for (int i = 0; i <= arr.length-2; i++) {
            is_sorted = true;
            for (int j = 1; j <= arr.length-1-i; j++) {
                if (arr[j]<arr[j-1]){
                    swap(arr, j, j-1);
                    is_sorted = false;
                }
            }
            if (is_sorted){
                return;
            }
        }
    }
    static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
