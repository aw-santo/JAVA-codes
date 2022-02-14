package com.san.AnujYT;

import java.util.Arrays;

public class BitMani{
    public static void main(String[] args){
        int[] arr = { 6, 2, 5, 2, 2, 6, 6 };

//        System.out.println(everyRepeatsTwiceFind1(arr));
//        System.out.println(Arrays.toString(everyRepeatsTwiceFind2(arr)));
        System.out.println(everyRepeatsKTimesFind1(arr, 3));
    }
    static int everyRepeatsTwiceFind1(int[] arr){
        int xor = 0;
        for (int i = 0; i < arr.length; i++) {
            xor = xor ^ arr[i];
        }

        return xor;
    }
    static int[] everyRepeatsTwiceFind2(int[] arr){
        int whole_xor = 0;
        for (int i = 0; i < arr.length; i++) {
            whole_xor = whole_xor ^ arr[i];
        }
        whole_xor = (whole_xor & -whole_xor);

        int no_has_1 = 0;
        int no_has_0 = 0;

        for (int i = 0; i < arr.length; i++) {
            if ((arr[i] & whole_xor) > 0) {
                no_has_1 = no_has_1 ^ arr[i];
            }
            else {
                no_has_0 = no_has_0 ^ arr[i];
            }
        }
        return new int[]{no_has_0, no_has_1};
    }
    static int everyRepeatsKTimesFind1(int[] arr, int k){
        int[] bit_arr = new int[32];

        for (int i = 0; i < bit_arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if ((arr[j] & (1<<i)) != 0){
                    bit_arr[i]++;
                }
            }
        }

        int res = 0;
        for (int i = 0 ; i < bit_arr.length ; i++) {
            res += (bit_arr[i]%k)*(1<<i);
        }
        return res;
    }
}