package com.san.leetcode.string;

// import java.lang.*;
// import java.util.*;

import java.util.Scanner;
import java.lang.StringBuilder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Easy{
    public static void main(String[] args){
        System.out.println("Hey!");

        // 1
        // defangIP("255.100.50.0");

        // 2
        // String str = shuffleString("codeleet", new int[]{4,5,6,7,0,2,1,3});
        // System.out.println(str);

        // 3
        // System.out.println(parser("G()(al)"));

        // 4
        
        // String name = "Sanket is a very noice guy!";
        // String[] arr = name.split(" ");
        // System.out.println(Arrays.toString(arr));
        String s = "st1";
        int n = (int)(s.charAt(2));
        System.out.println(n);
    }

    // 1. Defanging an Ip address
    static void defangIP(String ip){
        System.out.println(ip.replace(".", "[.]"));
    }

    // 2. Shuffle String
    static String shuffleString(String s, int[] indices){
        char[] str = new char[s.length()];
        for (int i = 0; i < s.length(); i++) {
            str[indices[i]] = s.charAt(i);
        }
        return String.valueOf(str);
    }

    // 3. Goal Parser Interpretation
    static String parser(String command){
        // StringBuilder st = new StringBuilder();
        // int i = 0;
        // while(i<command.length()){
        //     if(command.startsWith("G")){
        //         st.append("G");
        //         command = command.substring(i+1);
        //         i+=1;
        //     }
        //     else if(command.startsWith("()")){
        //         st.append("o");
        //         command = command.substring(2);
        //         i+=2;
        //     }
        //     else if (command.startsWith("(al)")) {
        //         st.append("al");
        //         command = command.substring(4);
        //         i+=4;
        //     }
        // }
        // return st.toString();

        command = command.replace("()", "o");
        command = command.replace("(al)", "al");
        return command;
    }

    // 4. Count Items Matching a rule
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int count = 0;
        switch (ruleKey) {
            case "type":
                count = help(items, ruleKey, ruleValue, 0);
                break;

            case "color":
            count = help(items, ruleKey, ruleValue, 1);
                break;

            case "name":
            count = help(items, ruleKey, ruleValue, 2);
                break;
        
            default:
                break;
        }
        return count;
    }
    static int help(List<List<String>> items, String ruleKey, String ruleValue, int col){
        int count = 0;
        for (int i = 0; i < items.size(); i++) {
            if (items.get(i).get(col).equals(ruleValue)) {
                count++;
            }
        }
        return count;
    }

    // 5. Sorting the Sentence
    static String sortSentence(String s) {
        String[] arr = s.split(" ");
        String[] arr1 = new String(arr.length);

        for (int i = 0; i < arr.length; i++) {
            int last = arr[i].length()-1;
            int ind = arr[i].charAt(last) - '0';
            arr1[ind-1] = arr[i].substring(0, last);
        }

        return String.join(", ", arr1);
    }

    // 6. Check if two strings are equivalent
    static boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        return String.join("", word1).equals(String.join("", word2));
    }

    // 7. To Lower Case
    static String toLowerCase(String s) {
        // return s.toLowerCase();
        String str = "";
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) >= 'A' && s.charAt(i) <= 'Z')
                str+= (char)((int)(s.charAt(i)) + 32 );
            else
                str+= s.charAt(i);
        }
        return str;
    }

    // 8. Determine if string halves are alike
    static boolean halvesAreAlike(String s) {
        int a = countVowel(s.substring(0, s.length()/2));
        int b = countVowel(s.substring(s.length()/2, s.length()));

        return a==b;
    }
    static int countVowel(String s){
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i)=='A' || s.charAt(i)=='a' || s.charAt(i)=='E' || s.charAt(i)=='e' || s.charAt(i)=='I' || s.charAt(i)=='i' || s.charAt(i)=='O' ||s.charAt(i)=='o' || s.charAt(i)=='U' ||s.charAt(i)=='u')
                count++;
        }
        return count;
    }
} 
