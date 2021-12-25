package com.san.bitwise;

public class OddEven {
    public static void main(String[] args){
        int num = 65;
        int[] arr = {2, 3, 4, 1, 2, 1, 3, 6, 4};
//        System.out.println(isEven(num));
        System.out.println(nonRepeating(arr));
    }
    static boolean isEven(int n){
        return !((n&1)==1);
    }
    static int nonRepeating(int[] arr){
        int xor_val=0;
        for ( int e : arr) {
            xor_val^=e;
        }
        return xor_val;
    }
//    static int nonRepeating(int[] arr, int repeats){
//
//    }
}
