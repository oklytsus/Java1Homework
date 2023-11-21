package org.softserve.academy;
import java.util.Scanner;

/*
Task 7 Interest Calculator
Write a program that calculates the final amount of a bank deposit after a given number
of years at a given interest rate. The program should ask the user for the
initial deposit amount, the annual interest rate, and the number of years.
Use a loop to calculate compound interest for each year and output the result to the console.
Some information for solution
The formula for calculating the final amount of a bank deposit using compound interest is given by:
A=P×(1+r)t
where:
•	� is the amount of money accumulated after n years, including interest.
•	P is the principal amount (the initial amount of money).
•   r is the annual interest rate (decimal).
•	t is the time the money is invested for, in years.
 */
public class InterestCalculator {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        double initialDeposit, annualRate, bankDeposit;
        int numberOfYears;
        System.out.println("Enter your amount of initial deposit: ");
        initialDeposit = sc.nextDouble();
        System.out.print("Enter the annual interest rate (in percentage): ");
        annualRate = sc.nextDouble();
        System.out.println("Enter the number of years for your deposit: ");
        numberOfYears = sc.nextInt();
        // Convert annual interest rate to decimal
        double interestRate = annualRate / 100;
        for (int t = 1; t <= numberOfYears; t++) {
            bankDeposit = initialDeposit * Math.pow(1 + interestRate, t);
            // Output result for each year
            System.out.printf("Year %d: %.2f%n", t, bankDeposit);
        };

    };
}

