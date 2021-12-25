package com.company;
import java.lang.Math;
import java.util.Scanner;

class Calc {
    public void add(int a, int b){
        System.out.println(a+b);
    }
    public void add(int a, int b, int c){
        System.out.println(a+b+c);             // Method overloading!
    }
    public void add(int a, int b, int c, int d){
        System.out.println(a+b+c+d);
    }
    public void add(double a, double b, int c){
        System.out.println(a+b+c);             // Method overloading with diff data types as inputs!
    }
}

public class oop {
    public static void main(String[] args) {
//        Calc ob = new Calc();
//        ob.add(4.945612,5.45, 7 );
//        Scanner sc = new Scanner(System.in);
        System.out.println(18417137760l%250);
    }
}
