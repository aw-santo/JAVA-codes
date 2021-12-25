package com.company;

import java.security.cert.CertificateRevokedException;
import java.util.concurrent.ExecutionException;

public class ExceDemo {
    public static void main(String[] args) {

//        try {
//            int i = 9;
//        }
//        catch (ArithmeticException e){
//            System.err.println("Error : "+e);
//        }
//        finally {
//            System.out.println("Byeee");
//        }
//        System.out.println("Hiiii!");

//        int arr[] = new int[6];
//        try {
//            arr[6]=4;
//        }
//        catch (ArithmeticException | ArrayIndexOutOfBoundsException e){
//            System.err.println("Error : "+e);
//        }
        int i=8, j=0;
        try {
                throw new SanException("hii this cant be done sorry");
//            int k = i/j;
//            if (k==0)
//            System.out.println(k);
        }
        catch (SanException e){
            System.out.println("Error ..."+e.getMessage());
        }
    }
}
