package com.san.sortings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Problems {
    public static void main(String[] args){
        System.out.println("san from andromeda!");
        int[] arr = {3, 4, -1, 1};
        System.out.println(firstMissingPositive(arr));
    }

    private static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    private static int missingNum(int[] arr){
        int i = 0;
        while (i<arr.length){
            int correct_index = arr[i];
            if ( arr[correct_index]<arr.length && arr[i] != arr[correct_index]){
                swap(arr, i, correct_index);
            }
            else {
                i++;
            }
        }
        for (int j = 0; j < arr.length; j++) {
            if (j != arr[j]){
                return j;
            }
        }
        return arr.length;
    }

    private static List missingNums(int[] arr){
        List<Integer> ls = new ArrayList<>();
        int i = 0;
        while (i<arr.length){
            int correct_index = arr[i] - 1;
            if (arr[i]!=arr[correct_index]){
                swap(arr, i, correct_index);
            }
            else {
                i++;
            }
        }

        for (int j = 0; j < arr.length; j++) {
            if (j != arr[j]-1){
                ls.add(j+1);
            }
        }

        return ls;
    }

    private static int onlyDuplicateNum(int[] arr){
        int i = 0;
        while (i<arr.length){
            int correct_index = arr[i] - 1;
            if (arr[i]<=arr.length && i != correct_index){
                if (arr[i] == arr[correct_index]){
                    return arr[i];
                }
                swap(arr, i, correct_index);
            }
            else {
                i++;
            }
        }
        return -1;
    }

    private static List<Integer> duplicateNums(int[] arr){
        List<Integer> ls = new ArrayList<>();
        int i = 0;
        while(i<arr.length){
            int correct_index = arr[i] - 1;
            if (i != correct_index){
                if (arr[i] == arr[correct_index]){
                    if (!ls.contains(arr[i]))
                        ls.add(arr[i]);
                    i++;
                    continue;
                }
                else {
                    swap(arr, i, correct_index);
                }
            }
            else {
                i++;
            }
        }
        return ls;
    }

    private static int[] setMismatch(int[] arr){
        int i = 0;
        while (i<arr.length){
            int correct_index = arr[i] - 1;
            if (arr[i] != arr[correct_index]){
                swap(arr, i, correct_index);
            }
            else {
                i++;
            }
            for (int j = 0; j < arr.length; j++) {
                if (arr[j] != j+1){
                    return new int[]{arr[j], j+1};
                }
            }
        }

        return new int[]{-1, -1};
    }

    private static int firstMissingPositive(int[] arr){
        int i = 0;
        while (i<arr.length){
            if (arr[i]>0){
                int correct_index = arr[i] - 1;
                if (arr[i]<arr.length && arr[i]!=arr[correct_index]){
                    swap(arr, i, correct_index);
                }
                else {
                    i++;
                    continue;
                }
            }
            else {
                i++;
            }
        }
        for (int j = 0; j < arr.length; j++) {
            if (arr[j] != j+1){
                return j+1;
            }
        }
        return -1;
    }
}
