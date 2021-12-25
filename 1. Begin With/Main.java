package com.company;
import java.lang.Math;

class Add{
    int sum=0;
    public int add(int ... i){
        for (int j:i) {
            sum+=j;
        }
        return sum;
    }
}

public class Main {
    public static void main(String[] args) {
//        int arr[] = new int[5];
//        arr[0]=1;
//        arr[1]=2;
//        arr[2]=3;
//        arr[3]=4;
//        arr[4]=5;
//        int arr[] = new int[]{1, 2, 3, 4, 5};
//        for(int i: arr){
//            System.out.println(i);
//        }
//        int arr[][] =  {
//                {1, 2, 3},
//                {2, 3, 4},
//                {5, 6, 7}
//        };
//        for (int k[]:arr) {
//            for (int i:k) {
//                System.out.print(i+" ");
//            }
//            System.out.println();
//        }

        Add obj = new Add();
        System.out.println(obj.add(1,2,3));
    }
}
