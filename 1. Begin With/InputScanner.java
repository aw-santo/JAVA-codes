package com.company;
import java.util.Scanner;


public class InputScanner {
    public static void main(String[] args) {
        int n;
        String str = null;
        float f;
        System.out.print("Enter value: ");

        Scanner sc = new Scanner(System.in);
//        n = sc.nextInt();
//        str = sc.nextLine();
        f = sc.nextFloat();
        System.out.printf("-- %f --", f);
    }
}
