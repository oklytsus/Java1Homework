package org.softserve.academy;

import java.util.Scanner;

public class App
{
    public static void main( String[] args )
    {
//        System.out.println( "Hello World!" );
//        int x = 5; // x++; ++x; x = x + 1;
//        int a, b;
//        a = x++; //a = 5 x = 6
//        x--;      // x = 5
//        b = ++x;   // b = 6 x = 6
//        ++x; //x = 7
//        boolean bool = true;
//        //System.out.println(bool); // true
//        //System.out.println(!bool); // false
//        a = x++ + ++x + ++x + x++;
//        int t = 5, s = 4;
//        String str1 = (t >= ++s) ? "yes" : "no";
//        int a1 = 3, b1 = 2;
//        String str2 = a1-- == b1 ? "yes" : "no";
//
//        System.out.println("str1 " +str1);
//        System.out.println("str2 " +str2);
//        str2 = a1-- == b1 ? "yes" : "no";
//        System.out.println("str2 " +str2);
//        int i = 0;
//        do {
//            System.out.print(++i);
//        } while (i < 5);

        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int n;
        for (int i = 0; i < 5; i++) {
            System.out.println("Input number");
            n = sc.nextInt();
            if (n < 0){
                break;
            }
            sum += n;
        }
        System.out.println(sum);
        sc.close();


    }
}
