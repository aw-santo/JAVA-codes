package com.san.leetcode.searching;

public class Easy {
    public static void main(String[] args){
        System.out.println("sanket");
    }

//    1. https://leetcode.com/problems/sqrtx/
//    static int mySqrt(int x){
//
//    }

//    2. https://leetcode.com/problems/guess-number-higher-or-lower/
    static int guessNumber(int n) {
        int l = 1;
//        int h = n;
        while (l<=n){
            int mid = l + (h-l)/2;
            if (guess(mid)==-1){
                n = mid-1;
            }
            else if (guess(mid)==1){
                l = mid+1;
            }
            else {
                return mid;
            }
        }
        return -1;
    }

//    3. https://leetcode.com/problems/first-bad-version/
    static int firstBadVersion(int n) {
        int l = 1;
        while (l<=n){
            int mid = l + (n-l)/2;
            if (isBadVersion(mid)){
                if (!isBadVersion(mid-1)){
                    return mid+1;
                }
                n = mid-1;
            }
            else {
                if (isBadVersion(mid+1)){
                    return mid+1;
                }
                l = mid+1;
            }
        }
        return -1;
    }
}
