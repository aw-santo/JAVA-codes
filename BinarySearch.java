package com.san;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {-5, -2, -1, 4, 8, 45, 66, 95, 446, 1234, 4567};
        int[] arrR = {78, 65, 45, 38, 27, 14, 9, 7, 6, 1, -5, -45};
        System.out.println(bSearch(arrR, -5));
    }
    static int bSearch(int[] arr, int target){
        int start = 0;
        int end = arr.length-1;
        boolean is_ascending = arr[start]<arr[end];
        while (start <= end){
//            int mid = (start+end)/2;
            int mid = start + (end-start)/2;
            if (arr[mid] == target){
                return mid;
            }
            else if (target>arr[mid]){
                if (is_ascending){
                    start = mid+1;
                }
                else{
                    end = mid-1;
                }
            }
            else {
                if (is_ascending){
                    end = mid-1;
                }
                else{
                    start = mid+1;
                }
            }
        }
        return -1;
    }

}
