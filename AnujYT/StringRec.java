package com.san.AnujYT;

public class StringRec {
    public static void main(String[] args){
//        System.out.println(isPalindrome("sanafs"));
//        powersetOfString("abc");
        permute("abc", 0, 2);
    }


    static boolean isPalindrome(String str){
        return checkStr(str, 0, str.length()-1);
    }
    static private boolean checkStr(String str, int start, int end){
        if (start >= end)
            return true;
        if (str.charAt(start) != str.charAt(end)){
            return false;
        }
        return checkStr(str, start+1, end-1);
    }

    static void powersetOfString(String str){
        utilityForPower(str, 0, "");
    }
    static void utilityForPower(String str, int i, String curr){
        if (i>= str.length()){
            System.out.println(curr);
            return;
        }
        utilityForPower(str, i+1, curr + str.charAt(i));
        utilityForPower(str, i+1, curr);
    }

    static void permute(String str, int l, int r){
        if (l==r){
            System.out.println(str);
            return;
        }
        for (int i = l; i <= r ; i++) {
            str = swap(str, l, i);
            permute(str, l+1, r);
            str = swap(str, l, i);
        }
    }

    private static String swap(String str, int i, int j) {
        char[] tempArr = str.toCharArray();
        char temp = tempArr[i];
        tempArr[i] = tempArr[j];
        tempArr[j] = temp;
        return String.valueOf(tempArr);
    }
}
