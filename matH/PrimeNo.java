package com.san.matH;

public class PrimeNo {
    public static void main(String[] args){
        System.out.println("Hello");
        int num = 14;
//        System.out.println(isPrime(num));
        for (int i = 1; i <= num; i++) {
            System.out.println(i+" "+isPrime(i));
        }
    }
    static boolean isPrime(int n){
        if (n<=1){
            return false;
        }
        for (int i = 2; i*i <= n ; i++) {
            if (n%i==0){
                return false;
            }
        }
            return true;
    }
}
