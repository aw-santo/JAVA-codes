package com.san.matH;

import java.util.ArrayList;

public class Factors {
    public static void main(String[] args){
        System.out.println("Hello");
        int n = 20;
//        factors1(n);
//        factors2(n);
        factors3(n);
    }
    //O(n)
    static void factors1(int n){
        for (int i = 1; i <= n ; i++) {
            if (n%i == 0){
                System.out.print(i + " ");
            }
        }
    }
    static void factors2(int n){
        for (int i = 1; i*i <= n ; i++) {
            if (n%i == 0){
                if (n/i == i){
                    System.out.print(i + " ");
                }
                else{
                    System.out.print(i + " " + n/i + " ");
                }
            }
        }
    }
    static void factors3(int n){
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 1; i*i <=n ; i++) {
            if (n%i==0){
                System.out.print(i + " ");
                if (n/i!=i){
                    arr.add(n/i);
                }
            }
        }
        for (int i = arr.size()-1; i >=0 ; i--) {
            System.out.print(arr.get(i) + " ");
        }
    }
}
