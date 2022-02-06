package com.san;

import java.util.Scanner;



public class Palindrome {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
//        a= 12321;
        Integer i = 4;

//        int temp=a;  // temp = 12321
        int ad = Integer.parseInt("1234");
//        String rev = Integer.toString(a);



//        while(a>0){
//            rev = rev*10 + a%10; // rev = 0 + 1
//            a/=10; // a= 1232
//        }
//
//        if (temp == rev)
//            System.out.println("Palindrom");
//        else
//            System.out.println("Not Palindrom");


//    boolean isPalindrome = true;

//        for (int i = 0; i <= rev.length()/2; i++) {
//            int f = rev.length()-i-1;
//            if (rev.charAt(i) != rev.charAt(f)) {
//                isPalindrome = false;
//                  break;
//            }
//        }
//        if (isPalindrome)
//            System.out.println("Palindrome");
//        else
//            System.out.println("Not Palindrome");

        int rev = isPalindrome(a, 0);
        if (a == rev)
            System.out.println("Palindrome");
        else
            System.out.println("Not palindrome");

    }

    static int isPalindrome(int n, int rev){
        // base cond^n
        if (n == 0){
            return rev;
        }

        rev = rev*10 + n%10;
//    n = 0
        return isPalindrome(n/10, rev);
    }
}