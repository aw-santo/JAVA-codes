package com.san.matH;

public class EuclideanGCD_HCF {
    public static void main(String[] args) {
        System.out.println("Hello");
        int a=12, b=36;
        System.out.println(gcd(a, b));
    }
    static int gcd(int a, int b){
        if (a==0){
            return b;
        }
        return gcd(b%a, a);
    }
}
