package org.softserve.academy;

import java.util.Scanner;

/*
Task 4 Even or Odd Number Checker
Write a program that asks the user to enter a number.
The program then determines whether the number is even or odd
using a control statement and prints the result/
 */
public class EvenOdd {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int number;
        System.out.print("Please input your number: ");
        number = sc.nextInt();
        if (number % 2 != 0) {
            System.out.print("Your number is odd ");
        } else {
            System.out.print("Your number is even ");
        }
        ;
//        String str1 = (number % 2!=0) ? "Your number is odd" : "Your number is even";
//        System.out.println(str1);

    }
}
