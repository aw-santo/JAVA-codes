package com.san.bitwise;

public class MagicNth {
    public static void main(String[] args) {
        int num = 56;
        System.out.println(nthMagic(num));
    }
    static int nthMagic(int  n){
        int val=0;
        int counter=1;
        while (n!=0){
            if((n&1)==0){
                counter++;
                n = n>>1;
                continue;
            }
            val += Math.pow(5, counter);
            counter++;
            n = n>>1;
        }
        return val;
    }
}
