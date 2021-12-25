package com.san.patterns;

public class Patterns {
    public static void main(String args[]){
//        System.out.println(45);
        pattern15(10);
    }
    static void pattern1(int n){
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void pattern2(int n){
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void pattern3(int n){
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n-i+1 ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void pattern4(int n){
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }

    static void pattern5(int n){
        for (int i = 1; i <= 2*n-1; i++) {
            int col = i<=5? i : 2*n-i;
            for (int j = 1; j <= col; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void pattern6(int n){
        for (int i = 1; i <= 5; i++) {
            int spaces = n-i;
            for (int j = 1; j <= spaces; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void pattern7(int n){
        for (int i = 1; i <= n; i++) {
            int spaces = i-1;
            for (int j = 1; j <= spaces; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= n-i+1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void pattern8(int n){
        for (int i = 1; i <= n ; i++) {
            int spaces = n-i;
            for (int j = 1; j <= spaces; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2*i-1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void pattern9(int n){
        for (int i = 1; i <= n; i++) {
            int spaces = i-1;
            for (int j = 1; j <= spaces; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2*n -2*i+1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void pattern10(int n){
        for (int i = 1; i <= n; i++) {
            int spaces = n-i;
            for (int j = 0; j < spaces; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i ; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern11(int n){
        for (int i = 1; i <= n; i++) {
            int spaces = i-1;
            for (int j = 0; j < spaces; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= n-i+1; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern12(int n){
        for (int i = 1; i <= 2*n; i++) {
            int spaces = i<=n? i-1: 2*n-i;
            for (int j = 1; j <= spaces; j++) {
                System.out.print(" ");
            }
            if (i<=n){
                for (int j = 1; j <= n-i+1; j++) {
                    System.out.print("* ");
                }
            }
            else {
                for (int j = 1; j <= n-spaces; j++) {
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
    }

    static void pattern13(int n){
        for (int i = 1; i <= n; i++) {
            int spaces = n-i;
            for (int j = 0; j < spaces; j++) {
                System.out.print(" ");
            }
            if (i==1){
                System.out.print("*");
            }
            else if (i!=1 && i!=n){
                for (int j = 1; j <= i; j++) {
                    if (j==1 || j==i){
                        System.out.print("* ");
                    }
                    else {
                        System.out.print("  ");
                    }
                }
            }
            else {
                for (int j = 1; j <= 2*n-1; j++) {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }

    static void pattern14(int n){
        for (int i = 1; i <= n; i++) {
            int spaces = i-1;
            for (int j = 0; j < spaces; j++) {
                System.out.print(" ");
            }
            if (i==1){
                for (int j = 0; j < 2*n-1; j++) {
                    System.out.print("*");
                }
            }
            else if (i!=1 && i!=n){
                for (int j = 1; j <= n-i+1; j++) {
                    if (j==1 || j==n-i+1){
                        System.out.print("* ");
                    }
                    else {
                        System.out.print("  ");
                    }
                }
            }
            else {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void pattern15(int n){
        for (int i = 1; i <= 2*n-1; i++) {
            int spaces = i<=n? n-i: i-n;
            for (int j = 0; j < spaces; j++) {
                System.out.print(" ");
            }
            if (i<=n){
                for (int j = 1; j <= i; j++) {
                    if (j==1 || j==i){
                        System.out.print("* ");
                    }
                    else {
                        System.out.print("  ");
                    }
                }
            }
            else {
                for (int j = 1; j <=2*n-i ; j++) {
                    if (j==1 || j==2*n-i){
                        System.out.print("* ");
                    }
                    else {
                        System.out.print("  ");
                    }
                }
            }
            System.out.println();
        }
    }


}
