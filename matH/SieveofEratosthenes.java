package com.san.matH;

public class SieveofEratosthenes {
    public static void main(String[] args) {
        int num = 10;
        boolean[] arr = new boolean[num+1];
        sieve(num, arr);
    }
    static void sieve(int n, boolean[] arr){
        for (int i = 2; i*i <= n ; i++) {
            if (!arr[i]){
                for (int j = i*2; j <= n ; j+=i) {
                    arr[j] = true;
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if (!arr[i]){
                System.out.println(i);
            }
        }
    }
}
