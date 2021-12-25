package com.san.recursions;

import java.util.ArrayList;

public class ArrayQues {
    public static void main(String[] args) {
        System.out.println("HEllo");
        int[] arr = {5, 6, 7, 8, 9, 1, 2, 3};
//        System.out.println(isSorted(arr));
//        System.out.println(linearSearch(arr, 55, 0));
//        findAllIndices(arr, 8, 0);
//        System.out.println(list);
//        findAllIndices2(arr, 8, 0);
        int n = 5;
        System.out.println(rotatedBinSearch(arr, n));
    }
    static boolean isSorted(int[] arr){
        return helper(arr, 0);
    }
    static boolean helper(int[] arr, int s){
        if (arr.length==0 || s==arr.length-1){
            return true;
        }
        if (arr[s]>arr[s+1]){
            return false;
        }
        return helper(arr, s+1);
    }
    static int linearSearch(int[] arr, int n, int st){
        if (arr.length==0 || st>arr.length-1){
            return -1;
        }
        if (arr[st]==n){
            return st;
        }
        return linearSearch(arr, n, st+1);
    }
    static ArrayList<Integer> list = new ArrayList<>();
    static void findAllIndices(int[] arr, int n, int st){
        if (arr.length==0 || st>arr.length-1){
            return;
        }
        if (arr[st] == n){
            list.add(st);
        }
        findAllIndices(arr, n, st+1);
    }
    static void findAllIndices2(int[] arr, int n, int st){
        ArrayList<Integer> list1 = new ArrayList<>();
        helperFind(arr, n, st, list1);
        System.out.println(list1);
    }
    static void helperFind(int[] arr, int n, int st, ArrayList<Integer> list1){
        if (arr.length==0 || st>arr.length-1){
            return;
        }
        if (arr[st] == n){
            list1.add(st);
        }
        helperFind(arr, n, st+1, list1);
    }
    static int rotatedBinSearch(int[] arr, int n){
        return helpRBS(arr, n, 0, arr.length-1);
    }
    static int helpRBS(int[] arr, int n, int st, int end){
        if (st>end){
            return -1;
        }
        int mid = st + (end-st)/2;
        if (arr[mid] == n){
            return mid;
        }
        if (arr[st] <= arr[mid] ){
            if (n>=arr[st] && n<=arr[mid]){
                return helpRBS(arr, n, st, mid-1);
            }
            else {
                return helpRBS(arr, n, mid+1, end);
            }
        }
        if (n>=arr[mid] && n<=arr[arr.length-1]){
            return helpRBS(arr, n, mid+1, end);
        }
        return helpRBS(arr, n, st, mid-1);
    }
}
