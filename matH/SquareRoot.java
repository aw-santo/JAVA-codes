package com.san.matH;

public class SquareRoot {
    public static void main(String[] args) {
        int num = 40;
        int pre = 2;
//        System.out.println(sqrt(num));
        System.out.println(sqrt(num, pre));
    }
    static int sqrt(int n){
        int start = 0;
        int end = n;
        while (start<=end){
        int mid = start + (end-start)/2;
            if (mid*mid==n){
                return mid;
            }
            else if (mid*mid>n){
                end = mid-1;
            }
            else {
                start = mid+1;
            }
        }
        return -1;
    }
    static double sqrt(int n, int p){
        double root = 0.0;
        double inc = 0.1;
        for (int i = 0; i < p; i++) {
            while (root*root<=n){
                root += inc;
            }
            root-=inc;
            inc/=10;
        }
        return root;
    }
}
