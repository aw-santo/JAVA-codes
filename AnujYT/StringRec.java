package com.san.AnujYT;

public class StringRec {
    public static void main(String[] args){
//        System.out.println(isPalindrome("sanafs"));
//        powersetOfString("abc");
//        permute("abc", 0, 2);
        String str = "sanket is good boy";
//        System.out.println(str);
//        str = skipChar(str, 'a');
//        str = skipString(str, "sanket");
//        System.out.println(str);
        subset("abc");
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

    static String skipChar(String str, char ch){
        if (str.isEmpty())
            return "";

        char f_char = str.charAt(0);

        if (f_char == ch)
            return skipChar(str.substring(1), ch);
        else
            return f_char + skipChar(str.substring(1), ch);
    }

    static String skipString(String str, String skip){
        if (str.isEmpty())
            return "";

        if (str.startsWith(skip))
            return skipString(str.substring(skip.length()), skip);
        else
            return str.charAt(0) + skipString(str.substring(1), skip);
    }

    static void subset(String str){
        doSubset(str, 0, "");
    }

    private static void doSubset(String str, int i, String s) {
        if (i>=str.length()) {
            System.out.println(s);
            return;
        }

        doSubset(str, i+1, s+str.charAt(i));
        doSubset(str, i+1, s);
    }
}
