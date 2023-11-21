package org.softserve.academy;

import java.util.Scanner;
/**
 * Task 1 Calculation of the Final Product Price Including VAT
 * Create a program that asks the user for the price of a product excluding VAT
 * and calculates the final cost including VAT (add 20% to the initial price).
 * Display both prices — excluding VAT and including VAT.
 * Use the Scanner to enter the initial price.
 */
public class PriceVat {
    public static void main(String[] args) {
        double price, priceVat;
        final double VAT = 0.2;
        Scanner sc = new Scanner(System.in);
        System.out.println("Please input your price:");
        price= sc.nextDouble();
        priceVat=price+price*VAT;
        System.out.println("Cost excluding  VAT is: " + price);
        System.out.print("Cost including  VAT is: ");
        System.out.printf(String.valueOf(priceVat));
        sc.close();
    }
}
