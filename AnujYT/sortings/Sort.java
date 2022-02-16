package com.san.AnujYT.sortings;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Sort {
    public static void main(String[] args){
//        int[] arr = {8, 3, 5, 2, 6, 1, 9, 4};
        int[] arr = {4, 1, 5, 3, 2};
//        int[] arr = {1, 2, 3, 4, 5, 6, 8, 9};
        System.out.println(Arrays.toString(arr));
//        bubbleSort(arr);
//        insertionSort(arr);
//        selectionSort(arr);
//        arr = mergeSort(arr);
//        mergeSortIn(arr, 0, arr.length-1);
//        quickSort(arr, 0, arr.length-1);
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void bubbleSort(int[] arr){
        boolean swapped = false;
        for (int i = 0; i < arr.length; i++) {
            swapped = false;
            for (int j = 0; j < arr.length-i-1; j++) {
                if (arr[j]>arr[j+1]){
                    swap(arr, j, j+1);
                    swapped = true;
                    System.out.print("Unsorted\t");
                }
            }
            if (!swapped){
                return;
            }
        }
    }
    private static void swap(int[] arr, int i, int j){
        arr[i] = arr[i]^arr[j];
        arr[j] = arr[i]^arr[j];
        arr[i] = arr[i]^arr[j];
    }

    static void insertionSort(int[] arr){
        for (int i = 1; i < arr.length; i++) {
            int j = i-1;
            int ele = arr[i];
            while (j>=0 && arr[j]>ele){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = ele;
        }
    }

    static void selectionSort(int[] arr){
        for (int i = 0; i < arr.length-1; i++) {
            int min_index = i;
            for (int j = i+1; j < arr.length; j++) {
                if (arr[j] < arr[min_index])
                    min_index = j;
            }
            if (min_index!=i)
                swap(arr, i, min_index);
        }
    }

    static int[] mergeSort(int[] arr){
        if (arr.length<=1){
            return arr;
        }
        
        int mid = arr.length/2;
        
        int[] left = mergeSort(Arrays.copyOfRange(arr, 0, mid));
        int[] right = mergeSort(Arrays.copyOfRange(arr, mid, arr.length));
        
        return merge(left, right);
    }

    private static int[] merge(int[] first, int[] second) {
        int f_counter = 0;
        int s_counter = 0;
        int n_counter = 0;
        
        int[] mix = new int[first.length + second.length];
        
        while (f_counter<first.length && s_counter< second.length){
            if (first[f_counter] < second[s_counter]){
                mix[n_counter] = first[f_counter];
                f_counter++;
            }
            else {
                mix[n_counter] = second[s_counter];
                s_counter++;
            }
            n_counter++;
        }
        while (f_counter<first.length){
            mix[n_counter] = first[f_counter];
            f_counter++;
            n_counter++;
        }
        while(s_counter<second.length){
            mix[n_counter] = second[s_counter];
            s_counter++;
            n_counter++;
        }
        return mix;
    }

    static void mergeSortIn(int[] arr, int l,  int r){
        if (l>=r)
            return;

        int mid = l + (r-l)/2;

        mergeSortIn(arr, l, mid);
        mergeSortIn(arr, mid+1, r);

        mergeIn(arr, l, mid, r);
    }

    private static void mergeIn(int[] arr, int l, int mid, int r) {
        int f_counter = l;
        int s_counter = mid+1;
        int n_counter = 0;

        int[] nrr = new int[r-l+1];

        while (f_counter<=mid && s_counter<=r){
            if (arr[f_counter]<arr[s_counter]){
                nrr[n_counter] = arr[f_counter];
                f_counter++;
            }
            else {
                nrr[n_counter] = arr[s_counter];
                s_counter++;
            }
            n_counter++;
        }
        while(f_counter<=mid){
            nrr[n_counter] = arr[f_counter];
            f_counter++;
            n_counter++;
        }
        while (s_counter<=r){
            nrr[n_counter] = arr[s_counter];
            s_counter++;
            n_counter++;
        }
        for (int i = l; i <= r; i++) {
            arr[i] = nrr[i-l];
        }
    }

    static void quickSort(int[] arr, int l, int h){
        if (l>=h){
            return;
        }
        int pivot = quick(arr, l, h);

        quickSort(arr, l, pivot-1);
        quickSort(arr, pivot+1, h);
    }

    private static int quick(int[] arr, int l, int h) {
        int i = l;
        int j = h;
        int pivot = arr[l];

        while (i<=j){
            while(arr[i]<=pivot)
                i++;
            while(arr[j]>pivot)
                j--;
            if (i<j)
                swap(arr, i, j);
        }
        swap(arr, l, j);
        return j;
    }
}
