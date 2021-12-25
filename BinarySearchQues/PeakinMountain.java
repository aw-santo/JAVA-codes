package com.san.BinarySearchQues;

public class PeakinMountain {
    public static void main(String[] args) {
        int[] arr = {0, 3, 7, 8, 9, 6, 5,  1, 0};
        System.out.println(peak(arr));
    }
    static int peak(int[] arr){
        int start = 0;
        int end = arr.length-1;
        while (start<=end){
            int mid = start + (end-start)/2;
            if (arr[mid-1]<arr[mid] && arr[mid+1]<arr[mid]){
                return arr[mid];
            }
            else if (arr[mid]<arr[mid+1]){
                start = mid+1;
            }
            else {
                end = mid-1;
            }
        }
        return arr[start+(end-start)/2];
    }
}
