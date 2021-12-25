package com.san;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] arr = {45, 4, 85, 2, 7, 14};
        System.out.println(Arrays.toString(arr));
//        swap(arr, 1, 4);
//        System.out.println(maxE(arr));
//        System.out.println(maxRange(arr, 3, 5));
        reverse(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void reverse(int[] arr) {
        for (int i = 0; i < arr.length/2; i++) {
            swap(arr, i, arr.length-1-i);
        }
    }

    static int maxRange(int[] arr, int start, int end) {
        int max = arr[start];
        for (int i = start+1; i <= end; i++) {
            if (arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }

    static void swap(int[] arr, int i1, int i2) {
        int temp = arr[i1];
        arr[i1] = arr[i2];
        arr[i2] = temp;
    }

    static int maxE(int[] arr){
        int max = arr[0];
        for (int i=1; i<arr.length; i++){
            if (arr[i]>max){
                max = arr[i];
            }
        }
        return max;
    }
}
