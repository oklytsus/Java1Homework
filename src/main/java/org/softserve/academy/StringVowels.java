package org.softserve.academy;

import java.util.Scanner;

/*
Task 2. Counting Vowels in a String
Write a program that asks the user to input a string.
Then, using a loop, count how many vowels (a, e, i, o, u) are in the string.
Output the total number of vowels found.
 */
public class StringVowels {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter String:");
        String string = sc.nextLine();
        int vowels = 0;
        // Convert the input string to lowercase to simplify vowel checking
        string = string.toLowerCase();

        // Iterate through each character in the string
        for (int i = 0; i < string.length(); i++) {
            char currentChar = string.charAt(i);
            // Check if the current character is a vowel
            if (currentChar == 'a' || currentChar == 'e' || currentChar == 'i' || currentChar == 'o' || currentChar == 'u') {
                vowels++;
            }
        }

        System.out.println("The number of vowels found is: " + vowels);

    }

    ;

}

