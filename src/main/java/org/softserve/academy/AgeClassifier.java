package org.softserve.academy;

import java.util.Scanner;

/*
Task 6 Simple Age Category Classifier
The program asks the user to input their age, and based on the age,
it categorizes them as a child, teenager, adult, or senior.
For example, 0-12 years could be a child, 13-19 a teenager, 20-59 an adult, and 60+ a senior.
 */
public class AgeClassifier {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        double number;
        String ageClassifier = null;
        System.out.print("Please enter your age: ");
        number = sc.nextDouble();
        if (number >= 60) {
            ageClassifier = "You are senior.";
        } else if (number >= 20 & number <= 59) {
            ageClassifier = "You are adult.";
        } else if (number >= 13 & number <= 19) {
            ageClassifier = "You are teenager.";
        } else if (number >= 0 & number <= 12) {
            ageClassifier = "You are child.";
        }
        if (number < 0 || number > 120) {
            System.out.println("You've entered incorrect age value.");
        } else {
            System.out.println(ageClassifier);
        }
    }

}


