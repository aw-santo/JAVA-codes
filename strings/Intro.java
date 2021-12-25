package com.san.strings;

public class Intro {
    public static void main(String[] args) {
//        String a = "sanket";
//        String b = "sanket";
//        System.out.println(a.equals(b));
//        System.out.println(a == b);

//        String a1 = new String("sanket");
//        String a2 = new String("sanket");
//        System.out.println(a1.equals(a2));
//        System.out.println(a1==a2);

        //Performance
//        StringBuilder str = new StringBuilder("sanket");
//        System.out.println(str);
        String str = "hannah";
        System.out.println(isPalindrome(str));
    }
    static boolean isPalindrome(String str){
        int start = 0;
        int end = str.length()-1;
        while (start<=end){
            if (!(str.charAt(start) == str.charAt(end))){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}
