package com.san.recursions;

public class Pattern {
    public static void main(String[] args) {
        System.out.println("HEllo");
        pattern1(4, 4);
    }
    static void pattern1(int r, int c){
        if (c<1){
            return;
        }
        System.out.print("* ");
        pattern1(r, c-1);
        System.out.println();

        pattern1(r-1, r-1);
    }
}
