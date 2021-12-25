 package com.san.recursions;

public class BasicProbs {
    public static void main(String[] args) {
        System.out.println("Hello123");
//        printN_1(5);
//        print1_N(5);
//        printBoth(5);
//        System.out.println(fact(4));
//        System.out.println(sum(4));
//        System.out.println(sumForm(4));
//        System.out.println(digitSum(1342));
//        System.out.println(digitProd(505));
//        System.out.println(rev(1003));
//        System.out.println(isPalindrome(123));
//        System.out.println(countZeros(30102040));
        System.out.println(noSteps(41));
    }
    static void printN_1(int n){
        if (n==0){
            return;
        }
        System.out.println(n);
        printN_1(n-1);
    }
    static void print1_N(int n){
        if (n==0){
            return;
        }
        print1_N(n-1);
        System.out.println(n);
    }
    static void printBoth(int n){
        if (n==0){
            return;
        }
        System.out.println(n);
        printBoth(n-1);
        System.out.println(n);
    }
    static int fact(int n){
        if (n==0 || n==1){
            return 1;
        }
        return n*fact(n-1);
    }
    static int sum(int n){
        if (n<=1){
            return n;
        }
        return n+sum(n-1);
    }
    static int sumForm(int n){
        return n*(n+1)/2;
    }
    static int digitSum(int n){
        if (n==0){
            return 0;
        }
        return (n%10) + (digitSum(n/10));
    }
    static int digitProd(int n){
        if (n==0){
            return 1;
        }
        if (n%10==0){
            return 0;
        }
        return (n%10) * (digitProd(n/10));
    }
    static int rev(int n){
        if (n<10){
            return n;
        }
        int exp = (int)(Math.log10(n));

        return ((n%10) * (int)(Math.pow(10, exp))) + rev(n/10);
    }
    static boolean isPalindrome(int n){
        return n==rev(n);
    }
    static int countZeros(int n){
        int count = 0;
        return helper(n, count);
    }
    static int helper(int n, int count){
        if (n==0){
            return count;
        }
        if (n%10==0){
            return helper(n/10, count+1);
        }
        return helper(n/10, count);
    }
    static int noSteps(int n){
        return helper2(n, 0);
    }
    static int helper2(int n, int c){
        if (n==0){
            return c;
        }
        if (n%2==0){
            helper2(n/2, c+1);
        }
        return helper2(n-1, c+1);
    }
}
