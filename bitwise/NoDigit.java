package com.san.bitwise;

public class NoDigit {
    public static void main(String[] args) {
        int num = 8;
        int base = 2;
//        System.out.println(noDigits(num, base));
//        System.out.println(powerof2(6));
//        System.out.println(pascalsTraingle(5));
        System.out.println(noSetBits(998));
        System.out.println(Integer.toBinaryString(998));
    }
    static int noDigits(int n, int base){
        return (int)(Math.log(n)/Math.log(base))+1;
    }
    static boolean powerof2(int n){
        return (n&(n-1))==0;
    }
    static int pascalsTraingle(int n){
        return 1<<n-1;
    }
    static int noSetBits(int n){
        int count=0;
        while (n>0){
            n = n&(n-1);
            count++;
        }
        return count;
    }
}
