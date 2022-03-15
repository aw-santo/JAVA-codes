package com.san.leetcode.string;

import java.util.Random;

public class kthSmallest {
    public static void main(String[] args) {
        int[] arr = { 10, 80, 30, 90, 40, 50, 70 };
        int k = 3;
        System.out.println(kSelection(arr, 0, arr.length-1, k));

    }

    static int kSelection(int[] arr, int l, int h, int i) {
        
        if (l == h)
            return arr[l];

        int pivot = partition(arr, l, h);
        int k = pivot - l + 1;
        if (i <= k) {
            return kSelection(arr, l, pivot, i);
        } else {
            return kSelection(arr, pivot + 1, h, k - i);
        }
    }

    static int partition(int[] arr, int l, int h) {
        Random rand = new Random();
        int no = rand.nextInt(h - l) + l;
        swap(arr, l, no);

        int pivot = arr[l];
        int pv_ind = l;

        int i = l;
        int j = h;

        while (i<j) {
            while (i<h && arr[i]<=pivot) {
                i++;
            }
            while (j>l && arr[j]>pivot) {
                j--;
            }     
            if (i<j) {
                swap(arr, i, j);
            }
        }
        swap(arr, j, pv_ind);
        return j;
    }
    static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
