package com.san.leetcode.searching;

import java.util.ArrayList;

public class Easy {
    public static void main(String[] args){
        int[] arr= new int[]{2,3,4,7,11};
//        System.out.println(findKthPositive(arr, 5));
        ArrayList<Integer> ls = new ArrayList<>(11, -1);
//        ls.set(10, 11);
        System.out.println(ls.get(4));
    }

//    1. https://leetcode.com/problems/sqrtx/
//    static int mySqrt(int x){
//
//    }

//    2. https://leetcode.com/problems/guess-number-higher-or-lower/
//    static int guessNumber(int n) {
//        int l = 1;
////        int h = n;
//        while (l<=n){
//            int mid = l + (h-l)/2;
//            if (guess(mid)==-1){
//                n = mid-1;
//            }
//            else if (guess(mid)==1){
//                l = mid+1;
//            }
//            else {
//                return mid;
//            }
//        }
//        return -1;
//    }

//    3. https://leetcode.com/problems/first-bad-version/
//    static int firstBadVersion(int n) {
//        int l = 1;
//        int h = n;
//        while (l<h){
//            int m = l + (h-l)/2;
//            if (isBadVersion(m)){
//                h = m;
//            }
//            else {
//                l = m+1;
//            }
//        }
//        if (isBadVersion(l))
//            return l;
//        return h;
//    }

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

//    5. https://leetcode.com/problems/valid-perfect-square/
    public boolean isPerfectSquare(int num) {
        if (num==0 || num==1)
            return true;

        int l=2;
        int h=num/2;

        while (l<=h){
            long m = l+ (h-l)/2;
            if (m*m==num)
                return true;
            else if (m*m>num)
                h=(int)m-1;
            else
                l=(int)m+1;
        }

        return false;

    }

//    6. https://leetcode.com/problems/arranging-coins/
    static int arrangeCoins(int n) {
//        int c=1;
        if (n==1 || n==0){
            return n;
        }
        int stair = 0;
        int i=1;
        while (n>=i){
            stair++;
            n-=i;
            i++;
        }
        return stair;
    }

//    7. https://leetcode.com/problems/find-smallest-letter-greater-than-target/
    static char nextGreatestLetter(char[] letters, char target) {
        char ans = letters[0];
        int max = Integer.MAX_VALUE;

        for (int i = 0; i < letters.length; i++) {
            char ch = letters[i];
            if ((int) ch < max && (int)ch > target){
                ans = ch;
                max = (int)ch;
            }
        }
        return ans;
    }

//    8. https://leetcode.com/problems/kth-missing-positive-number/
    static int findKthPositive(int[] arr, int k) {
        ArrayList<Integer> ls = new ArrayList<>(arr[arr.length-1]+1);
        for (int i = 0; i < arr[arr.length-1]+1; i++) {
            ls.add(-1);
        }
        for (int i = 0; i < arr.length; i++) {
            ls.set(arr[i], arr[i]);
        }
        int kl = 0;
        int count = 1;
        while (kl<ls.size()){
            if (ls.get(kl)==-1 && count==k)
                return kl;
        }
        return ls.get(ls.size()-1)+k;
    }

//    9. https://leetcode.com/problems/search-insert-position/
    public int searchInsert(int[] nums, int target) {
        int l = 0;
        int h = nums.length-1;
        while (l<=h){
            int m = l + (h-l)/2;
            if (nums[m]==target)
                return m;
            if (target<nums[m])
                h = m-1;
            else
                l = m+1;
        }
        return l;
    }

    
}

