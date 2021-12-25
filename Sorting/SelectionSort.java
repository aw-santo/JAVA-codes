package com.san.Sorting;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};
        System.out.println(Arrays.toString(arr));
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void selectionSort(int[] arr){
        for (int i = 0; i < arr.length-1; i++) {
            int min_in = min(arr, i, arr.length-1);
//            for (int j = 1; j < arr.length; j++) {
//                if (arr[j]<min_no){
//                    swap(arr, j, i);
//                }
//            }
            swap(arr, i, min_in);
        }
    }
    static int min(int[] arr, int i, int j){
        int min_no = i;
        for (int k = i+1; k <= j; k++) {
            if (arr[k]<arr[min_no]){
                min_no = k;
            }
        }
        return min_no;
    }
    static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
