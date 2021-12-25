package com.san.bitwise;

public class XORTillA {
    public static void main(String[] args) {
//        System.out.println("hello");
        int a = 3;
        int b = 9;
//        System.out.println(xorA(a));
        System.out.println(xorAB(a, b));
    }
    static int xorA(int a){
        if (a%4==0)
            return a;
        if (a%4==1)
            return 1;
        if (a%4==2)
            return a+1;

        return 0;
    }
    static int xorAB(int a, int b){
        return xorA(b)^xorA(a-1);
    }
}
