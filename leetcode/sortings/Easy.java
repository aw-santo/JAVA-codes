package com.san.leetcode.sortings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Easy {
    public static void main(String[] args){
//        System.out.println("Hi this is san!");
//        int[] arr = {3, 1, 5, 4, 2};
//        System.out.println(Arrays.toString(arr));
//        bubbleSort(arr);
//        selectionSort(arr);
//        insertionSort(arr);
//        cycleSort(arr);
//        System.out.println(Arrays.toString(arr));

        merge(new int[]{1, 2, 3, 0, 0, 0}, 3, new int[]{2, 5, 6}, 3);
    }

    static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    static void bubbleSort(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            boolean is_sorted = true;
            for (int j = 1; j < arr.length-i; j++) {
                if (arr[j-1]>arr[j]){
                    swap(arr, j-1, j);
                    is_sorted = false;
                }
            }
            if (is_sorted)
                return;
        }
    }

    static void selectionSort(int[] arr){
        for (int i = 0; i < arr.length-1; i++) {
            int min_index = i;
            for (int j = i+1; j < arr.length; j++) {
                if (arr[j]<arr[min_index])
                    min_index = j;
            }
            swap(arr, i, min_index);
        }
    }

    static void insertionSort(int[] arr){
        for (int i = 1; i < arr.length; i++) {
            int e = arr[i];
            int j = i-1;
            while (j>=0 && e<arr[j]){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = e;
        }
    }

    static void cycleSort(int[] arr){
        int i = 0;
        while (i<arr.length){
            int correct_index = arr[i]-1;
            if (arr[i] == arr[correct_index]){
                i++;
            }
            else {
                swap(arr, i, correct_index);
            }
        }
    }

//    1. https://leetcode.com/problems/missing-number/
    public int missingNumber(int[] nums) {
        int i = 0;
        while(i<nums.length){
            int correct_index = nums[i];
            if (nums[i]<nums.length && nums[i]!=nums[correct_index]){
                int temp = nums[i];
                nums[i] = nums[correct_index];
                nums[correct_index] = temp;
            }
            else {
                i++;
            }
        }
        for (int j = 0; j < nums.length; j++) {
            if (nums[j]!=j)
                return j;
        }
        return nums.length;
    }

//    2. https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> ls = new ArrayList<>();
        int i = 0;
        while(i<nums.length){
            int correct_index = nums[i]-1;
            if (nums[i] != nums[correct_index]){
                int temp = nums[i];
                nums[i] = nums[correct_index];
                nums[correct_index] = temp;
            }
            else
                i++;
        }
        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != j+1)
                ls.add(j+1);
        }
        return ls;
    }

//    3. https://leetcode.com/problems/find-the-duplicate-number/
    public int findDuplicate(int[] nums) {
        int i = 0;
        while(i<nums.length){
            int c_index = nums[i]-1;
            if (i!=c_index){
                if (nums[i]==nums[c_index])
                    return nums[i];
                swap(nums, i, c_index);
            }
            else
                i++;
        }
        return -1;
    }

//    4. https://leetcode.com/problems/find-all-duplicates-in-an-array/
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> ls = new ArrayList<>();
        int i = 0;
        while (i<nums.length){
            int c_index = nums[i]-1;
            if (nums[i]!=nums[c_index]){
                swap(nums, i, c_index);
            }
            else
                i++;
        }
        for (int j = 0; j < nums.length; j++) {
            if (nums[j]!=j+1)
                ls.add(nums[j]);
        }
        return ls;
    }

//    5. https://leetcode.com/problems/set-mismatch/
    static int[] findErrorNums(int[] nums) {
        int i = 0;
        while (i<nums.length){
            int c_index = nums[i] - 1;
            if (nums[i] != nums[c_index]){
                swap(nums, i, c_index);
            }
            else
                i++;
        }

        for (int j = 0; j < nums.length; j++) {
            if (j != nums[j]-1){
                return new int[]{nums[j], j+1};
            }
        }
        return new int[]{-1, -1};
    }

//    6. https://leetcode.com/problems/first-missing-positive/\
    static int firstMissingPositive(int[] nums) {
        int i = 0;
        while(i<nums.length){
            int c_index = nums[i] - 1;
            if (nums[i]>0 && nums[i]<=nums.length && nums[i]!=nums[c_index]){
                swap(nums, i, c_index);
            }
            else {
                i++;
            }
        }
        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != j+1)
                return j+1;
        }
        return nums.length+1;
    }

//    7. https://leetcode.com/problems/merge-sorted-array/
    static void merge(int[] nums1, int m, int[] nums2, int n){
        for (int i = 0; i < n; i++) {
            int j = m-1;

            while (j>=0 && nums2[i]<nums1[j]){
                nums1[j+1] = nums1[j];
                j--;
            }
            nums1[j+1] = nums2[i];
            m++;
        }
    }

//    8. https://leetcode.com/problems/majority-element/
    public int majorityElement(int[] nums) {
        int count = 0;
        int m_element = 0;
        for (int e : nums) {
            if (count==0)m_element=e;
            if (m_element==e)count++;
            else count--;
        }
        return m_element;
    }

//    9. https://leetcode.com/problems/contains-duplicate/
    public boolean containsDuplicate(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
        boolean is_sorted = true;
            for (int j = 1; j < nums.length-i; j++) {
                if (nums[j-1]>nums[j]){
                    swap(nums, j, j-1);
                    is_sorted = false;
                }
                if (nums[j-1]==nums[j]){
                    return true;
                }
            }
            if (is_sorted)
                break;
        }
        for (int i = 0; i < nums.length-1; i++) {
            if (nums[i]==nums[i+1])
                return true;
        }
        return false;
    }

//    11. https://leetcode.com/problems/third-maximum-number/
    public int thirdMax(int[] nums) {
        if (nums.length<3){
            int max = Integer.MIN_VALUE;
            for (int i = 0; i < nums.length; i++) {
                if (nums[i]>max)
                    max = nums[i];
            }
            return max;
        }

        int m1 = Integer.MIN_VALUE;
        int m2 = Integer.MIN_VALUE;
        int m3 = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == m1){
                continue;
            }
            if (nums[i] > m1) {
                m3 = m2;
                m2 = m1;
                m1 = nums[i];
            }
            else if (nums[i]!=m1 && nums[i] > m2){
                m3 = m2;
                m2 = nums[i];
            }
            else if (nums[i]!=m2 && nums[i]<m2 && nums[i] > m3){
                m3 = nums[i];
            }
        }

        return m3==Integer.MIN_VALUE ? m1 : m3;
    }

}
