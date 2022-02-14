package com.san.AnujYT;

import java.util.Arrays;

public class NumberTheory {
    public static void main(String[] args) {
//        System.out.println(factI(5));
//        System.out.println(factR(5));

//        System.out.println(noTrailingZeroesInFact(12));

//        System.out.println(isPalindromeNo(105651));

//        System.out.println(Arrays.toString(sieveOfEratosthenes(30)));

//        System.out.println(gcd(24, 72 ));
        System.out.println(fastPow(3978432, 5, 1000000007));
    }
    static int factI(int n){
        if (n<0)
            return -1;
        if (n==0 || n==1)
            return n;

        int res = 1;
        for (int i = 2; i <= n; i++) {
            res*=i;
        }
        return res;
    }
    static int factR(int n){
        if (n<0)
            return -1;
        if (n==0 || n==1)
            return 1;

        return n*factR(n-1);
    }

    static int noTrailingZeroesInFact(int n){
        int res = 0;
        for (int i = 5; i <= n; i=i*5) {
            res += n/i;
        }
        return res;
    }

    static boolean isPalindromeNo(int n){
        int temp = n;
        int rev = 0;

        while (temp > 0){
            rev = rev*10 + temp%10;
            temp/=10;
        }
        return rev==n;
    }

    static boolean[] sieveOfEratosthenes(int n){
        boolean[] brr = new boolean[n+1];
        Arrays.fill(brr, true);
        brr[0] = brr[1] = false;

        for (int i = 2; i*i <= n ; i++) {
            if (brr[i] == false){
                continue;
            }
            for (int j = 2*i; j <= n; j+=i) {
                brr[j] = false;
            }
        }
        return brr;
    }
    static int gcd(int a, int b){
        if (b==0){
            return a;
        }
        return gcd(b, a%b);
    }

     static long fastPow(long a, long b, int n){
        long res = 1;

        while (b>0){
            if ((b&1)==1){
                res = (res * a%n)%n;
                b--;
            }
            a = (a%n * a%n)%n;
            b = b>>1;  // b/=2
        }
        return res;
     }
}
