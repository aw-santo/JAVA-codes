package com.san.sortings;

import java.util.Arrays;

public class Sort {
    public static void main(String[] args){
        System.out.println("Hi this is san!");
        int[] arr = {7, 2, 45, 6, 89, 1};
//        System.out.println(Arrays.toString(arr));
//        bubbleSort(arr);
//        selectionSort(arr);
//        insertionSort(arr);
//        System.out.println(Arrays.toString(arr));

        int[] arr2 = {6, 2, 3, 5, 1, 4};
        System.out.println(Arrays.toString(arr2));
        cyclicSort(arr2);
        System.out.println(Arrays.toString(arr2));
    }

    private static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    private static void bubbleSort(int[] arr){
        boolean is_sorted;
        for (int i = 0; i < arr.length-1; i++) {
            is_sorted = true;
            for (int j = 0; j < arr.length-i-1; j++) {
                if (arr[j]>arr[j+1]){
                    swap(arr, j, j+1);
                    is_sorted = false;
                }
            }
            if (is_sorted){
                break;
            }
        }
    }

    private static void selectionSort(int[] arr){
        for (int i = 0; i < arr.length-1; i++) {
            int min_index = i;
            for (int j = i+1; j < arr.length; j++) {
                if (arr[j]<arr[min_index]){
                    min_index = j;
                }
            }
            swap(arr, i, min_index);
        }
    }

    private static void insertionSort(int[] arr){
        for (int i = 0; i < arr.length-1; i++) {
            int j = i+1;
            while (j>0 && arr[j]<arr[j-1]){
                swap(arr, j, j-1);
                j--;
            }
        }
    }

    private static void cyclicSort(int[] arr){
        int i = 0;
        while (i<arr.length){
            int correct_index = arr[i] - 1;
            if (i != correct_index){
                swap(arr, i, correct_index);
            }
            else {
                i++;
            }
        }
    }
}
