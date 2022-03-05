package com.san.AnujYT;
import java.util.Scanner;
import java.lang.Math;

public class Assignment {
    public static void main(String[] args){
        int bit_rate;
        int band_width;
        int opt;
        int L;

        Scanner sc = new Scanner(System.in);

        System.out.println("To find bitrate enter '1' | To find signal level enter '2' ");
        opt = sc.nextInt();

        switch (opt){
            case 1:
                System.out.printf("\n\t\tCalculating bitrate...\n");

                System.out.println("Enter bandwidth :");
                band_width = sc.nextInt();

                System.out.println("Enter L :");
                L = sc.nextInt();

                bit_rate = (int) (2 * band_width * Math.log(L)/Math.log(2));

                System.out.println("Bitrate = "+bit_rate);

                break;
            case 2:
                System.out.printf("\n\t\tCalculating signal level...\n");

                System.out.println("Enter bandwidth :");
                band_width = sc.nextInt();

                System.out.println("Enter bitrate :");
                bit_rate = sc.nextInt();

                L = (int) Math.pow(2, bit_rate/(band_width*2));

                System.out.println("L = "+L);

                break;

            default:
                System.out.println("Enter valid option...");
        }
    }
}
