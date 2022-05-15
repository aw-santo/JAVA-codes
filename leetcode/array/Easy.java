package com.san.leetcode.array;

import java.nio.charset.MalformedInputException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

import javax.swing.plaf.synth.SynthSeparatorUI;

public class Easy {
    public static void main(String[] args) {
        // System.out.println("san form sun");
        // System.out.println(array10("sanket"));
        // int[][] arr = new int[3][3];
        // int[] arr = { 9,9,9,9,9,9,9,9,9,9 };
        // System.out.println(addToArrayForm(arr, 1));

        // int[][] arr = {{0,1},{1,0}};
        // int[][] target = {{1,0},{0,1}};
        // for (int[] is : target) {
        // System.out.println(Arrays.toString(is));
        // }
        // System.out.println();
        // System.out.println(rotate90(arr, target));
        // for (int[] is : arr) {
        // System.out.println(Arrays.toString(is));
        // }
        // System.out.println("New");
        // int[][] n = {{0,1},{1,0}};
        // int[][] a = {{0,1},{1,0}};
        // System.out.println(Arrays.deepEquals(n, a));

        int[][] mat = { { 1, 2 }, { 3, 4 } };
        System.out.println(Arrays.toString(Arrays.copyOf(mat, 1)));

    }

    // 1. https://leetcode.com/problems/build-array-from-permutation/
    static int[] array1(int[] nums) {
        int[] new_arr = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            new_arr[i] = nums[nums[i]];
        }
        return new_arr;
    }

    // 2. https://leetcode.com/problems/concatenation-of-array/
    static int[] array2(int[] nums) {
        int[] arr = new int[2 * nums.length];
        for (int i = 0; i < 2 * nums.length; i++) {
            if (i <= nums.length - 1) {
                arr[i] = nums[i];
            } else {
                arr[i] = nums[i - nums.length];
            }
        }
        return arr;
    }

    // 3. https://leetcode.com/problems/running-sum-of-1d-array/
    static int[] array3(int[] nums) {
        int[] arr = new int[nums.length];
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            arr[i] = sum + nums[i];
            sum += nums[i];
        }
        return arr;
    }

    // 4. https://leetcode.com/problems/richest-customer-wealth/
    static int array4(int[][] accounts) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < accounts.length; i++) {
            int sum = 0;
            for (int e : accounts[i]) {
                sum += e;
            }
            if (sum > max) {
                max = sum;
            }
        }
        return max;
    }

    // 5. https://leetcode.com/problems/shuffle-the-array/
    static int[] array5(int[] nums, int n) {
        int[] arr = new int[2 * n];
        for (int i = 0; i < n; i++) {
            arr[2 * i] = nums[i];
        }
        int j = 1;
        for (int i = n; i < 2 * n; i++) {
            arr[j] = nums[i];
            j += 2;
        }
        return arr;
    }

    // 6. https://leetcode.com/problems/kids-with-the-greatest-number-of-candies/
    static List<Boolean> array6(int[] candies, int extraCandies) {
        List<Boolean> ls = new ArrayList<>();
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < candies.length; i++) {
            if (candies[i] > max)
                max = candies[i];
        }

        for (int i = 0; i < candies.length; i++) {
            if (candies[i] + extraCandies >= max) {
                ls.add(i, true);
            } else {
                ls.add(i, false);
            }
        }
        return ls;
    }

    // 7. https://leetcode.com/problems/number-of-good-pairs/
    static int array7(int[] nums) {
        int pairs = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if ((nums[i] == nums[j]) && i < j) {
                    pairs++;
                }
            }
        }
        return pairs;
    }

    // 8.
    // https://leetcode.com/problems/how-many-numbers-are-smaller-than-the-current-number/
    static int[] array8(int[] nums) {
        int[] arr = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            int count = 0;
            for (int j = 0; j < nums.length; j++) {
                if (i != j && nums[j] < nums[i]) {
                    count++;
                }
            }
            arr[i] = count;
        }
        return arr;
    }

    // 9. https://leetcode.com/problems/create-target-array-in-the-given-order/
    static int[] arra9(int[] nums, int[] index) {
        int[] arr = new int[index.length];
        for (int i = 0; i < nums.length; i++) {
            arr[index[i]] = nums[i];
        }
        return arr;
    }

    // 10. https://leetcode.com/problems/check-if-the-sentence-is-pangram/
    static boolean array10(String sentence) {
        String alphas = "abcdefghijklmnopqrstuvwxyz";
        for (int i = 0; i < 26; i++) {
            if (!sentence.contains(Character.toString(alphas.charAt(i))))
                return false;
        }
        return true;
    }

    // 11. https://leetcode.com/problems/count-items-matching-a-rule/
    static int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int index;
        int count = 0;
        if (ruleKey.equals("type"))
            index = 0;
        else if (ruleKey.equals("color"))
            index = 1;
        else
            index = 2;

        for (int i = 0; i < items.size(); i++) {
            if (items.get(i).get(index).equals(ruleValue)) {
                count++;
            }
        }
        return count;
    }

    // 12. https://leetcode.com/problems/find-the-highest-altitude/
    static int largestAltitude(int[] gain) {
        int max = 0;
        int var = 0;
        for (int i = 0; i < gain.length; i++) {
            int temp = gain[i] + var;
            var = temp;
            if (max < var) {
                max = var;
            }
        }
        return max;
    }

    // 13. https://leetcode.com/problems/flipping-an-image/
    static void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

    static int[][] flipAndInvertImage(int[][] image) {
        for (int i = 0; i < image.length; i++) {
            for (int j = 0; j < image[i].length / 2; j++) {
                // swap(image[i], j, image[i].length-j-1);
                int temp = image[i][j];
                image[i][j] = image[i][image[i].length - j - 1];
                image[i][image[i].length - j - 1] = temp;
            }
            for (int j = 0; j < image.length; j++) {
                if (image[i][j] == 1) {
                    image[i][j] = 0;
                } else {
                    image[i][j] = 1;
                }
            }
        }
        return image;
    }

    // 14. https://leetcode.com/problems/cells-with-odd-values-in-a-matrix/
    static int oddCells(int m, int n, int[][] indices) {
        int[][] arr = new int[m][n];
        for (int i = 0; i < indices.length; i++) {
            for (int j = 0; j < indices[0].length; j++) {
                if (j == 0) {
                    for (int k = 0; k < arr[0].length; k++) {
                        arr[indices[i][j]][k] += 1;
                    }
                } else {
                    for (int k = 0; k < arr.length; k++) {
                        arr[k][indices[i][j]] += 1;
                    }
                }
            }
        }
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if (((arr[i][j] & 1) == 1)) {
                    count++;
                }
            }
        }
        return count;
    }

    // 15. https://leetcode.com/problems/matrix-diagonal-sum/
    static int diagonalSum(int[][] mat) {
        // boolean flag = false;
        // if ((mat.length&1)==1){
        // flag = true;
        // }
        int sum = 0;
        for (int i = 0; i < mat.length; i++) {
            sum += mat[i][i] + mat[i][mat.length - i - 1];
        }
        if ((mat.length & 1) == 1) {
            sum -= mat[mat.length / 2][mat.length / 2];
        }
        return sum;
    }

    // 16. https://leetcode.com/problems/find-numbers-with-even-number-of-digits/
    static int findNumbers(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (((int) (Math.log10(nums[i]) + 1) & 1) != 1) {
                count++;
            }
        }
        return count;
    }

    // 17. https://leetcode.com/problems/transpose-matrix/
    public int[][] transpose(int[][] matrix) {
        int[][] arr = new int[matrix[0].length][matrix.length];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                arr[j][i] = matrix[i][j];
            }
        }
        return arr;
    }

    // 18. https://leetcode.com/problems/add-to-array-form-of-integer/
    static List<Integer> addToArrayForm(int[] num, int k) {
        ArrayList<Integer> ls = new ArrayList<>();
        for (int i = num.length - 1; i >= 0 || k > 0; i++) {
            if (i >= 0) {
                ls.add((num[i] + k) % 10);
                k = (num[i] + k) / 10;
            } else {
                ls.add(k % 10);
                k /= 10;
            }
        }
        Collections.reverse(ls);
        return ls;
    }

    // 19. https://leetcode.com/problems/maximum-population-year/
    // static int maximumPopulation(int[][] logs) {
    //
    // }

    // 20. Determine Whether Matrix Can Be Obtained By Rotation
    // (https://leetcode.com/problems/determine-whether-matrix-can-be-obtained-by-rotation/)

    // static boolean findRotation(int[][] mat, int[][] target) {

    // }
    static boolean rotate90(int[][] arr, int[][] target) {
        for (int i = 0; i < 4; i++) {
            transposeRight(arr);
            reverseY(arr);

            if (Arrays.deepEquals(arr, target)) {
                return true;
            }
        }
        return false;
    }

    static void transposeRight(int[][] arr) {
        int n = arr.length;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
                // arr[i][j] = arr[j][n-i-1];
            }
        }
    }

    static void reverseY(int[][] arr) {
        int n = arr.length;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < n / 2; j++) {
                // swap(arr[i], j, n-j-1);
                int temp = arr[i][j];
                arr[i][j] = arr[i][n - j - 1];
                arr[i][n - j - 1] = temp;
            }
        }
    }

    // 21. Two Sum (https://leetcode.com/problems/two-sum/)

    static int[] twoSum(int[] nums, int target) {
        int a = -1, b = -1;
        int[] arr = nums.clone();
        Arrays.sort(arr);
        System.out.println(Arrays.toString(nums));
        System.out.println(Arrays.toString(arr));

        int l = 0, r = arr.length - 1;
        while (l < r) {
            if (arr[l] + arr[r] == target) {
                a = arr[l];
                b = arr[r];
                break;
            } else if (arr[l] + arr[r] > target) {
                r--;
            } else {
                l++;
            }
        }
        l = -1;
        r = -1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == a && l == -1) {
                l = i;
            } else if (nums[i] == b && r == -1) {
                r = i;
            }
        }
        return new int[] { l, r };
    }

    static int[] twoSum1(int[] nums, int target) {
        HashMap<Integer, Integer> mp = new HashMap<>();
        int a = nums[0];
        mp.put(a, 0);

        for (int i = 1; i < nums.length; i++) {
            if (mp.get(target - nums[i])) {
                return new int[] { mp.get(target - nums[i]), i };
            } else {
                mp.put(nums[i], i);
            }
        }
        return new int[] { -1, -1 };
    }

    // 22. Find N Unique Integers Sum up to Zero
    // (https://leetcode.com/problems/find-n-unique-integers-sum-up-to-zero/)
    static int[] sumZero(int n) {
        int[] arr = new int[n];
        int l = 0, r = n - 1;
        int x = n / 2;
        for (int i = 0; i < n / 2; i++) {
            arr[l] = -x;
            arr[r] = x;
            l++;
            r--;
            x--;
        }
        return arr;
    }

    // 23. Lucky Numbers in a Matrix
    // (https://leetcode.com/problems/lucky-numbers-in-a-matrix/)

    static List<Integer> luckyNumbers(int[][] matrix) {
        List<Integer> ls = new ArrayList<>();
        for (int i = 0; i < matrix.length; i++) {
            int min = minInRow(matrix, i);
            int max = 0;
            for (int j = 1; j < matrix.length; j++) {
                if (matrix[j][min] > matrix[max][min]) {
                    max = j;
                }
            }
            if (matrix[i][min] == matrix[max][min]) {
                ls.add(matrix[i][min]);
            }
        }
        return ls;
    }

    static int minInRow(int[][] matrix, int i) {
        int min = 0;
        for (int j = 1; j < matrix[0].length; j++) {
            if (matrix[i][j] < matrix[i][min]) {
                min = j;
            }
        }
        return min;
    }

    static boolean isMaxInCol(int[][] matrix, int min) {
        int max = min;
        for (int i = 1; i < matrix.length; i++) {
            if (matrix[i][min] > matrix[i][max]) {
                max = 
            }
        }
    }

    // 24. Maximum Subarray (https://leetcode.com/problems/maximum-subarray/)

    static int maxSubArray(int[] nums) {
        if (nums.length == 1)
            return nums[0];

        int max = nums[0];
        int sum = 0;

        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];

            if (sum > max)
                max = sum;

            if (sum < 0)
                sum = 0;
        }
        return max;
    }

    // 25. Reshape the Matrix (https://leetcode.com/problems/reshape-the-matrix/)

    static int[][] matrixReshape(int[][] mat, int r, int c) {

        if (mat.length * mat[0].length != r * c) {
            return mat;
        }

        int[][] nMat = new int[r][c];
        int row = 0, col = 0;

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                nMat[i][j] = mat[row][col];
                col++;

                if (col == mat[0].length) {
                    row++;
                    col = 0;
                }
            }
        }
        return nMat;
    }

    // 26. Plus One (https://leetcode.com/problems/plus-one/)
    static int[] plusOne(int[] digits) {
        ArrayList<Integer> ls = new ArrayList<>();

        for (int i = digits.length-1; i >= 0; i--) {
            if (digits[i]+1 < 10) {
                ls.add(0, digits[i]+1);
                
                for (int j = i-1; j >= 0 ; j--) {
                    ls.add(0, digits[j]);
                }
                break;
            }

            else {
                ls.add(0, 0);
                if (i-1 < 0) {
                    ls.add(0, 1);
                }
            }
        }

        int[] arr = new int[ls.size()];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int)(ls.get(i));
        }
        return arr;
    }
}
