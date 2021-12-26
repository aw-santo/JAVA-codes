package com.san.leetcode.array;

import java.nio.charset.MalformedInputException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Easy {
    public static void main(String[] args){
//        System.out.println("san form sun");
//        System.out.println(array10("sanket"));
//        int[][] arr = new int[3][3];
        int[] arr = { 9,9,9,9,9,9,9,9,9,9 };
        System.out.println(addToArrayForm(arr, 1));
    }

//    1. https://leetcode.com/problems/build-array-from-permutation/
    static int[] array1(int[] nums){
        int[] new_arr = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            new_arr[i] = nums[nums[i]];
        }
        return new_arr;
    }

//    2. https://leetcode.com/problems/concatenation-of-array/
    static int[] array2(int[] nums){
        int[] arr = new int[2*nums.length];
        for (int i = 0; i < 2*nums.length; i++) {
            if (i<=nums.length-1){
                arr[i] = nums[i];
            }
            else {
                arr[i] = nums[i-nums.length];
            }
        }
        return arr;
    }

//    3. https://leetcode.com/problems/running-sum-of-1d-array/
    static int[] array3(int[] nums){
        int[] arr = new int[nums.length];
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            arr[i] = sum+nums[i];
            sum+=nums[i];
        }
        return arr;
    }

//    4. https://leetcode.com/problems/richest-customer-wealth/
    static int array4(int[][] accounts){
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < accounts.length; i++) {
            int sum=0;
            for ( int e: accounts[i]) {
                sum+=e;
            }
            if (sum>max){
                max = sum;
            }
        }
        return max;
    }

//    5. https://leetcode.com/problems/shuffle-the-array/
    static int[] array5(int[] nums, int n){
        int[] arr = new int[2*n];
        for (int i = 0; i < n; i++) {
            arr[2*i] = nums[i];
        }
        int j=1;
        for (int i = n; i < 2*n; i++) {
            arr[j] = nums[i];
            j+=2;
        }
        return arr;
    }

//    6. https://leetcode.com/problems/kids-with-the-greatest-number-of-candies/
    static List<Boolean> array6(int[] candies, int extraCandies){
        List<Boolean> ls = new ArrayList<>();
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < candies.length; i++) {
            if (candies[i]>max)
                max = candies[i];
        }

        for (int i = 0; i < candies.length; i++) {
            if (candies[i]+extraCandies >= max){
                ls.add(i, true);
            }
            else {
                ls.add(i, false);
            }
        }
        return ls;
    }

//    7. https://leetcode.com/problems/number-of-good-pairs/
    static int array7(int[] nums){
        int pairs = 0;
        for (int i = 0; i < nums.length-1; i++) {
            for (int j = i+1; j < nums.length; j++) {
                if ((nums[i] == nums[j]) && i<j){
                    pairs++;
                }
            }
        }
        return pairs;
    }

//    8. https://leetcode.com/problems/how-many-numbers-are-smaller-than-the-current-number/
    static int[] array8(int[] nums){
        int[] arr = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            int count = 0;
            for (int j = 0; j < nums.length; j++) {
                if (i!=j && nums[j]<nums[i]){
                    count++;
                }
            }
            arr[i] = count;
        }
        return arr;
    }

//    9. https://leetcode.com/problems/create-target-array-in-the-given-order/
    static int[] arra9(int[] nums, int[] index){
        int[] arr = new int[index.length];
        for (int i = 0; i < nums.length; i++) {
            arr[index[i]] = nums[i];
        }
        return arr;
    }

//    10. https://leetcode.com/problems/check-if-the-sentence-is-pangram/
    static boolean array10(String sentence){
        String alphas = "abcdefghijklmnopqrstuvwxyz";
        for (int i = 0; i < 26; i++) {
            if (!sentence.contains(Character.toString(alphas.charAt(i))))
                return false;
        }
        return true;
    }

//    11. https://leetcode.com/problems/count-items-matching-a-rule/
    static int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int index;
        int count=0;
        if (ruleKey.equals("type"))
            index=0;
        else if (ruleKey.equals("color"))
            index=1;
        else
            index=2;

        for (int i = 0; i < items.size(); i++) {
            if (items.get(i).get(index).equals(ruleValue)){
                count++;
            }
        }
        return count;
    }

//    12. https://leetcode.com/problems/find-the-highest-altitude/
    static int largestAltitude(int[] gain) {
        int max = 0;
        int var=0;
        for (int i = 0; i < gain.length; i++) {
            int temp = gain[i]+var;
            var = temp;
            if (max<var){
                max = var;
            }
        }
        return max;
    }

//    13. https://leetcode.com/problems/flipping-an-image/
    static void swap(int[] arr, int a, int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
    static int[][] flipAndInvertImage(int[][] image) {
        for (int i = 0; i < image.length; i++) {
            for (int j = 0; j < image[i].length/2; j++) {
//                swap(image[i], j, image[i].length-j-1);
                int temp = image[i][j];
                image[i][j] = image[i][image[i].length-j-1];
                image[i][image[i].length-j-1] = temp;
            }
            for (int j = 0; j < image.length; j++) {
                if (image[i][j]==1){
                    image[i][j]=0;
                }
                else {
                    image[i][j]=1;
                }
            }
        }
        return image;
    }

//    14. https://leetcode.com/problems/cells-with-odd-values-in-a-matrix/
    static int oddCells(int m, int n, int[][] indices) {
        int[][] arr = new int[m][n];
        for (int i = 0; i < indices.length; i++) {
            for (int j = 0; j < indices[0].length; j++) {
                if (j==0){
                    for (int k = 0; k < arr[0].length; k++) {
                        arr[indices[i][j]][k]+=1;
                    }
                }
                else {
                    for (int k = 0; k < arr.length; k++) {
                        arr[k][indices[i][j]]+=1;
                    }
                }
            }
        }
        int count=0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if (((arr[i][j] & 1) == 1)){
                    count++;
                }
            }
        }
        return count;
    }

//    15. https://leetcode.com/problems/matrix-diagonal-sum/
    static int diagonalSum(int[][] mat) {
//        boolean flag = false;
//        if ((mat.length&1)==1){
//            flag = true;
//        }
        int sum=0;
        for (int i = 0; i < mat.length; i++) {
            sum+= mat[i][i] + mat[i][mat.length-i-1];
        }
        if ((mat.length&1)==1){
            sum-=mat[mat.length/2][mat.length/2];
        }
        return sum;
    }

//    16. https://leetcode.com/problems/find-numbers-with-even-number-of-digits/
    static int findNumbers(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (((int)(Math.log10(nums[i])+1) & 1) !=1){
                count++;
            }
        }
        return count;
    }

//    17. https://leetcode.com/problems/transpose-matrix/
    public int[][] transpose(int[][] matrix) {
        int[][] arr = new int[matrix[0].length][matrix.length];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                arr[j][i] = matrix[i][j];
            }
        }
        return arr;
    }

//    18. https://leetcode.com/problems/add-to-array-form-of-integer/
    static List<Integer> addToArrayForm(int[] num, int k) {
        ArrayList<Integer> ls = new ArrayList<>();
        for (int i = num.length-1; i>=0 || k>0 ; i++) {
            if (i>=0){
                ls.add((num[i]+k)%10);
                k = (num[i]+k)/10;
            }
            else {
                ls.add(k%10);
                k/=10;
            }
        }
        Collections.reverse(ls);
        return ls;
    }

//    19. https://leetcode.com/problems/maximum-population-year/
//    static int maximumPopulation(int[][] logs) {
//
//    }
}
