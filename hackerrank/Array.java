package com.san.hackerrank;

import javax.print.attribute.HashAttributeSet;
import java.nio.channels.FileLock;
import java.util.*;
import java.util.Calendar;
import java.text.SimpleDateFormat;
import java.text.DateFormat;
import java.text.DateFormatSymbols;

public class Array {
    public static void main(String[] args){
//        System.out.println("Hello world milky!");
//        List<Integer> ls = new ArrayList<>();
//        ls.add(0);
//        ls.add(3);
//        ls.add(-1);
//        ls.add(4);
//        ls.add(3);
//        ls.add(4);
////        System.out.println(birthdayCakeCandles(ls));
////        plusMinus(ls);
//        System.out.println(timeConversion("01:04:56PM"));
//        Scanner sc = new Scanner(System.in);
//        int a = sc.nextInt();
//        int b = sc.nextInt();
//        int c = sc.nextInt();
//        System.out.printf("%d\n%d\n%d", a, b, c);


//        Scanner sc = new Scanner(System.in);
//       int n = sc.nextInt();
//       if ((n&1)==1){
//           System.out.println("Weird");
//       }
//       else if (n>=2 && n<=5){
//           System.out.println("Not Weird");
//       }
//       else if (n>=6 && n<=20){
//           System.out.println("Weird");
//       }
//       else if (n>20){
//           System.out.println("Not Weird");
//       }

//        int i = sc.nextInt();
//        double d = sc.nextDouble();
//        sc.nextLine();
//        String str = sc.nextLine();
//        System.out.println("String: "+ str);
//        System.out.println("Double: "+ d);
//        System.out.println("Int: "+ i);
//        Scanner sc = new Scanner(System.in);
//        String s1 = sc.next();
//        int i1 = sc.nextInt();
//
//        String s2 = sc.next();
//        int i2 = sc.nextInt();
//
//        String s3 = sc.next();
//        int i3 = sc.nextInt();
//
//        System.out.printf("================================\n");
//        System.out.printf("%-15s%03d\n", s1, i1);
//        System.out.printf("%-15s%03d\n", s2, i2);
//        System.out.printf("%-15s%03d\n", s3, i3);
//        System.out.printf("================================");

//        int n = sc.nextInt();
//        for (int i = 1; i <=10 ; i++) {
//            System.out.println(n + " * " + i +" = " + n*i);
//        }

//        Scanner sc = new Scanner(System.in);
//        int q = sc.nextInt();
//        int[][] arr = new int[q][3];
//        for (int i = 0; i < q; i++) {
//            for (int j = 0; j < 3; j++) {
//                arr[i][j] = sc.nextInt();
//            }
//        }
//
//        for (int i = 0; i < q; i++) {
//            int sum = 0;
//            int n = 0;
//            while (n<arr[i][2]){
//                int an = arr[i][0] + arr[i][1]*((int)(Math.pow(2, n+1))-1);
////                sum += an;
//                System.out.print(an+" ");
////                sum+=an;
//                n++;
//            }
//            System.out.println();
//        }
            Scanner sc = new Scanner(System.in);
//        int test = sc.nextInt();
//        for (int i = 0; i < test; i++) {
//
//            String T = sc.next();
//            if (!(T.length()<=19 || (T.length()==20 && T.charAt(0)=='-'))){
//                System.out.println(T+" can't be fitted anywhere.");
//                continue;
////                return;
//            }
//            try {
//                long d = Long.parseLong(T);
//            }catch (Exception e){
//                System.out.println(T+" can't be fitted anywhere.");
//                continue;
//            }
//            long l = Long.parseLong(T);
//            if (l>=-128 && l<=127){
//                System.out.printf("%d can be fitted in:\n* byte\n* short\n* int\n* long", l);
////                return;
//            }
//            else if (l>=-32768 && l<=32767){
//                System.out.printf("%d can be fitted in:\n* short\n* int\n* long", l);
////                return;
//            }
//            else if (l>=-2147483648 && l<=2147483647){
//                System.out.printf("%d can be fitted in:\n* int\n* long", l);
////                return;
//            }
//            else if (l>=-9223372036854775808l && l<= 9223372036854775807L){
//                System.out.printf("%d can be fitted in:\n* long", l);
//            }
//            System.out.println();
//        }
////        System.out.println(Long.parseLong(T));
////        for (int i = 0; i < T; i++) {
////
////        }

//        List<String> file = new ArrayList<>();
//
//        boolean has_next = true;
//
//        while (sc.hasNextLine()){
//            String st = sc.nextLine();
////            if (st.endsWith("end-of-file.")){
//////                has_next = false;
////            }
//            file.add(st);
//        }
//        for (int i = 0; i < file.size(); i++) {
//            System.out.printf("%d %s \n", i+1, file.get(i));
//        }

//        StringBuilder str = new StringBuilder();
//        int i = 1;
//        while (sc.hasNext()){
//            str.append(sc.next());
//        }

//        Scanner sc = new Scanner(System.in);
//        String dayNames[] = new DateFormatSymbols().getWeekdays();
//        Calendar date = Calendar.getInstance(12, 12);
//        System.out.println("Today is "+ dayNames[date.get(Calendar.DAY_OF_WEEK)]);

//        findDay(08, 05, 2015);

    }
    public static List<Integer> reverseArray(List<Integer> a) {
        // Write your code here
        for(int i=0; i<a.size()/2; i++){
            int temp1 = a.get(i);
            int temp2 = a.get(a.size()-1-i);
            a.set(i, temp2);
            a.set(a.size()-1-i, temp1);
//            int s = Math.abs()
        }
        return a;
    }
    public static void plusMinus(List<Integer> arr) {
            // Write your code here
            float posi = 0f;
            float neg = 0f;
            float zero = 0f;
            for(int i=0; i<arr.size(); i++){
                if(arr.get(i)>0){
                    posi++;
                }
                else if(arr.get(i)<0){
                    neg++;
                }
                else{
                    zero++;
                }
            }
            System.out.printf("%.6f\n%.6f\n%.6f", posi/arr.size(), neg/arr.size(), zero/arr.size());

        }
    public static void staircase(int n) {
        // Write your code here
        for (int i = 1; i <= n; i++) {
            int spaces = n-i;
            for (int j = 0; j < spaces; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i ; j++) {
                System.out.print("#");
            }
            System.out.println();
        }
    }

    public static int birthdayCakeCandles(List<Integer> candles) {
        // Write your code here
        long max = candles.get(0);
        for (int i = 1; i < candles.size(); i++) {
            if (candles.get(i)>max){
                max = candles.get(i);
            }
        }
        int occ = 0;
        for (int i = 0; i < candles.size(); i++) {
            if (candles.get(i) == max){
                occ++;
            }
        }

        return occ;
    }
    public static String timeConversion(String s) {
        // Write your code here
        boolean is_am = (s.substring(s.length() - 2)).equals("AM");
//        int hr = (int)(s.substring(0, 2));
        String hr = "";
        String str  =s.substring(0, 2);
        if (is_am){
            if (str.equals("12")){
                hr = "00";
            }
            else {
                hr = str;
            }
        }
        else {
            switch (str){
                case "12":
                    hr = "12";
                    break;
                case "01":
                    hr = "13";
                    break;
                case "02":
                    hr = "14";
                    break;
                case "03":
                    hr = "15";
                    break;
                case "04":
                    hr = "16";
                    break;
                case "05":
                    hr = "17";
                    break;
                case "06":
                    hr = "18";
                    break;
                case "07":
                    hr = "19";
                    break;
                case "08":
                    hr = "20";
                    break;
                case "09":
                    hr = "21";
                    break;
                case "10":
                    hr = "22";
                    break;
                case "11":
                    hr = "23";
                    break;
            }
        }
        return hr+s.substring(2, s.length()-2);
    }

    public static void findDay(int month, int day, int year) {
        int flag_for_leap = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)? 1 : 0;

        /*Declaring and initialising the given informations
         * and arrays*/
        String dday[] = { "SUNDAY",    "MONDAY",   "TUESDAY",
                "WEDNESDAY", "THURSDAY", "FRIDAY",
                "SATURDAY" };
        int m_no[] = { 0, 3, 3, 6, 1, 4, 6, 2, 5, 0, 3, 5 };

        /*Generalised check to find any Year Value*/
        int j;
        if ((year / 100) % 2 == 0) {
            if ((year / 100) % 4 == 0)
                j = 6;
            else
                j = 2;
        }
        else {
            if (((year / 100) - 1) % 4 == 0)
                j = 4;
            else
                j = 0;
        }

        /*THE FINAL FORMULA*/
        int total = (year % 100) + ((year % 100) / 4) + day + m_no[month - 1] + j;
        if (flag_for_leap == 1) {
            if ((total % 7) > 0)
                System.out.println(dday[(total % 7) - 1]);
            else
                System.out.println(dday[6]);
        }
        else
            System.out.println(dday[(total % 7)]);
    }


}
