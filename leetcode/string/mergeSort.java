package com.san.leetcode.string;
import java.util.Arrays;

public class mergeSort {
    public static void main(String[] args){
        int[] arr = {38, 27, 43, 3, 9, 82, 10};
        System.out.println(Arrays.toString(arr));
        sort(arr, 0, arr.length-1);
        System.out.println(Arrays.toString(arr));
    }

    static void sort(int[] arr, int l, int h){
        if(l>=h)
            return;

        int m = l + (h-l)/2;

        sort(arr, l, m);
        sort(arr, m+1, h);

        merge(arr, l, m, h);
    }

    static void merge(int[] arr, int l, int m, int h){
        int[] n_arr = new int[h-l+1];
        int c = 0;
        int i = l;
        int j = m+1;

        while(i<=m && j<=h){
            if (arr[i] <= arr[j]) {
                n_arr[c] = arr[i];
                i++;
            }
            else{
                n_arr[c] = arr[j];
                j++;
            }
            c++;
        }

        while (i<=m) {
            n_arr[c] = arr[i];
            i++;
            c++;
        }

        while (j<=h) {
            n_arr[c] = arr[j];
            j++;
            c++;
        }

        for (int n = 0; n < n_arr.length; n++) {
            arr[l+n] = n_arr[n];
        }
    }
}
