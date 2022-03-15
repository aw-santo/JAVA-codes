package com.san.leetcode.string;
import java.io.PipedOutputStream;
import java.util.Arrays;
import java.util.Random;


public class randomized_quickSort {
    public static void main(String[] args) {
        int[] arr = {10, 80, 30, 90, 40, 50, 70};
        System.out.println(Arrays.toString(arr));
        quick(arr, 0, arr.length-1);
        System.out.println(Arrays.toString(arr));
    }

    static void quick(int[] arr, int l, int h){
        if (l>=h) {
            return;
        }

        int pivot = partition(arr, l, h);

        quick(arr, l, pivot-1);
        quick(arr, pivot+1, h);
    }

    static int partition(int[] arr, int l, int h){
        Random rand = new Random();
        int no = rand.nextInt(h-l)+l;
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
            if(i<j)
                swap(arr, i, j);
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
