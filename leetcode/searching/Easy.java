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
        int h = n;
        while (l<h){
            int m = l + (h-l)/2;
            if (isBadVersion(m)){
                h = m;
            }
            else {
                l = m+1;
            }
        }
        if (isBadVersion(l))
            return l;
        return h;
    }

//    4. https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/
    static int[] twoSum(int[] numbers, int target) {
        int l = 0;
        int h = numbers.length-1;
        while (l<h){
            if (numbers[l]+numbers[h]==target)
                return new int[]{l+1, h+1};
            else if (numbers[l]+numbers[h]<target)
                l++;
            else
                h--;
        }
        return new int[]{};
    }
}
