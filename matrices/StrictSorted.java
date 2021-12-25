package com.san.matrices;

import java.util.Arrays;

public class StrictSorted {
    public static void main(String[] args){
//        System.out.println("Hello");
        int[][] arr = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        int target = 8;
        System.out.println(Arrays.toString(isThere(arr, target)));
    }
    static int[] isThere(int[][] arr, int target){
//        n X m
        int n = arr.length;
        int m = arr[0].length;
        int low = 0;
        int high = n*m-1;
        while (low<=high){
            int mid = low + (high-low)/2;
            int rn = mid/m;
            int cn = mid%m;
            if (arr[rn][cn] == target){
                return new int[]{rn, cn};
            }
            else if (target > arr[rn][cn]){
                low = mid+1;
            }
            else {
                high = mid-1;
            }
        }
        return new int[]{-1, -1};
    }
}
