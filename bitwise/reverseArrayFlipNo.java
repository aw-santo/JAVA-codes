package com.san.bitwise;

import java.lang.reflect.Array;
import java.util.Arrays;

public class reverseArrayFlipNo {
    public static void main(String[] args) {
        int[][] arr = {
                {0, 1, 1},
                {0, 0, 1},
                {1, 0, 0}
        };
        for (int[] e: arr) {
            System.out.println(Arrays.toString(e));
        }
        System.out.println();
        revFlip(arr);
        for (int[] e: arr) {
            System.out.println(Arrays.toString(e));
        }
    }
    static void revFlip(int[][] arr){
        for (int[] e: arr) {
            for (int i = 0; i <= e.length/2; i++) {
                int temp = e[i]^1;
                e[i] = e[e.length-i-1]^1;
                e[e.length-i-1] = temp;
            }
        }
    }
}
