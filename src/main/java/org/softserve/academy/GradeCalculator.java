package org.softserve.academy;

import java.util.Scanner;
/*
Task 5 Grade Calculator
Write a program that takes a numerical score (like a test score out of 100)
and outputs the corresponding letter grade (A, B, C, D, F).
Define the grade boundaries yourself (for example, 90-100 is an A, 80-89 is a B, etc.).
 */
public class GradeCalculator {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int number;
        char letter;
        System.out.print("Please input your number between 0 and 100: ");
        number= sc.nextInt();
        if (number>=88 ){ letter='A';
            } else if (number<88 && number>=72) { letter='B';
            } else if (number<72 && number>=65) { letter = 'C';
            } else if (number<65 && number>=50) {
            letter = 'D';
        }else { letter = 'F';}
        System.out.print("Your Grade is: " + letter);
        }

    }


