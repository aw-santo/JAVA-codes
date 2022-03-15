package com.san.leetcode.string;
import java.util.Arrays;

import javax.swing.event.SwingPropertyChangeSupport;

public class heapSort {
    public static void main(String[] args){
        int[] arr = {10, 30, 50, 35, 15};
        System.out.println(Arrays.toString(arr));
        heap(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void heap(int[] arr){
        int n = arr.length;

        if (n<=1) {
            return;
        }

        for (int i = n/2-1; i>=0; i--) {
            heapify(arr, n, i);
        }

        for (int i = n-1; i > 0; i--) {
            swap(arr, 0, i);
            heapify(arr, i, 0);
        }
    }
    static void heapify(int[] arr, int n, int i){
        int largest = i;
        int lc = 2*i+1;
        int rc = 2*i+2;

        if (lc<n && arr[lc]>arr[largest])
            largest = lc;

        if (rc<n && arr[rc]>arr[largest])
            largest = rc;

        if (largest != i) {
            swap(arr, i, largest);
            heapify(arr, n, largest);
        }
    }
    static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}

