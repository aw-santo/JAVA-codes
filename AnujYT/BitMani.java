package com.san.AnujYT;

import java.util.Arrays;

public class BitMani{
    public static void main(String[] args){
        int[] arr = {5, 4, 1, 4, 3, 5, 1, 7};

//        System.out.println(everyRepeatsTwiceFind1(arr));
        System.out.println(Arrays.toString(everyRepeatsTwiceFind2(arr)));
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
    static int everyRepeatsKTimesFind1(int[] arr){

    }
}