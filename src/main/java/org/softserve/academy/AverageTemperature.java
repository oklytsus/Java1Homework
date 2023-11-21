package org.softserve.academy;

import java.util.Scanner;
/**
 * Write a program that asks the user for the temperature for five days
 * (use the Scanner to enter data)  and calculates the average temperature
 * over those days. Use the float variable type to store temperatures and
 * arithmetic operators to compute the average value.
 */
public class AverageTemperature {
    public static void main(String[] args) {
        float temperature, averageT, sum=0;
        int days=5, i=1;
        Scanner sc = new Scanner(System.in);
        do{
            System.out.println("Please input temperature for day" + i);
            temperature= sc.nextFloat();
            sum+=temperature;
            i++;
        } while (i<=days);
        averageT=sum/days;

        System.out.println("The average temperature for " +days+ "days is : " + averageT);

        sc.close();
    }
}
