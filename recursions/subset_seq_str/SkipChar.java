package com.san.recursions.subset_seq_str;

public class SkipChar {
    public static void main(String[] args){
        System.out.println("Hello");
//        System.out.println(skip("sanakatae"));
        System.out.println(skipApple("sanapp4leeket"));
    }
    static String skip(String str){
        if (str.isEmpty()){
            return "";
        }
        char ch = str.charAt(0);
        if (ch=='a'){
            return skip(str.substring(1));
        }
        return ch + skip(str.substring(1));
    }
    static String skipApple(String str){
        if (str.isEmpty()){
            return "";
        }
        if (str.startsWith("apple")){
            return skipApple(str.substring(5));
        }
        if (str.startsWith("app")){
            return skipApple(str.substring(3));
        }
        char ch = str.charAt(0);
        return ch + skipApple(str.substring(1));
    }
}
