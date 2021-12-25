package com.san;

import java.lang.reflect.Array;
import java.util.Arrays;

public class searching {
    public static void main(String[] args) {
        int[] arr = { 180, 121, 9, 44014, 45677, 500};
//        System.out.println(search(arr, 14));
//        System.out.println(searchI(arr, 18));
//        String name = "sanket";
//        System.out.println(searchStr(name, 'c'));
        int[][] arr2 = {
                {1, 2, 3},
                {8, 9},
                {45, 7, 0, 10, 63, 75}
        };
//        System.out.println((search2D(arr2)));
//        System.out.println(countEven(arr));
        System.out.println(maxWealth(arr2));
    }

    static int maxWealth(int[][] arr){
        int mw = Integer.MIN_VALUE;
        for (int[] e: arr) {
            int s = sum(e);
            if (s>mw){
                mw = s;
            }
        }
        return mw;
    }
    static int sum(int[] arr){
        int sm = 0;
        for (int e : arr) {
            sm+=e;
        }
        return sm;
    }
    static int countEven(int[] arr){
        int count = 0;
        for (int e: arr) {
            if (((int)(Math.log10(e))+1) %2 ==0){
                count++;
            }
        }
        return count;
    }
    static int search2D(int[][]arr){
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j]>max){
                    max = arr[i][j];
                }
            }
        }
        return max;
    }
    static boolean search(int[] arr, int target){
        if (arr.length==0){
            return false;
        }
        for (int e : arr) {
            if (e==target){
                return true;
            }
        }
        return false;
    }
    static int searchI(int[] arr, int target){
        if (arr.length==0){
            return -1;
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target){
                return i;
            }
        }
        return -1;
    }
    static boolean searchStr(String str, char target){
        if (str.length()==0){
            return false;
        }
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i)==target){
                return true;
            }
        }
        return false;
    }
}
