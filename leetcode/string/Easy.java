package com.san.leetcode.string;

// import java.lang.*;
// import java.util.*;

import java.util.Scanner;
import java.lang.StringBuilder;

public class Easy{
    public static void main(String[] args){
        System.out.println("Hey!");

        // 1
        // defangIP("255.100.50.0");

        // 2
        // String str = shuffleString("codeleet", new int[]{4,5,6,7,0,2,1,3});
        // System.out.println(str);

        // 3
        System.out.println(parser("G()(al)"));
        
    }

    // 1. Defanging an Ip address
    public static void defangIP(String ip){
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
} 