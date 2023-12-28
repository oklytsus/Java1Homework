package org.softserve.academy;

import java.security.SecureRandom;
import java.util.Scanner;

/*
Create a Java program that generates a secure, random password based on user preferences.
 */
public class PasswordGenerator {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        //Ensure the minimum length is at least 8 characters for security.
        int inputCounter = 0;
        int passwordLength;
        do {
            System.out.println("Please enter the length of password, not less than 8:");
            passwordLength = sc.nextInt();
            inputCounter++;
        } while ((passwordLength < 8 && inputCounter <= 2));
        if (inputCounter<=2) {
            System.out.println("Do you like to include special characters in password (yes/no):");
            String includingSC = sc.next();

            String generatedPassword = generateSecurePassword(passwordLength, includingSC);
            System.out.print(generatedPassword);
        } else {System.out.println("The length of password can't be less than 8 symbols.");}
    }

    static String generateSecurePassword(int length, String includingSC) {
        System.out.println("Generating password using random()");
        System.out.print("Your new password is: ");

        // A strong password has Cap_chars, Lower_chars,
        // numeric value and symbols. So we are using all of
        // them to generate our password
        String uppercaseChars = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String lowercaseChars = "abcdefghijklmnopqrstuvwxyz";
        String digitChars = "0123456789";
        String specialChars = "!@#$%^&*()-_=+[{]};:'\",<.>/?";

        String allChars = uppercaseChars + lowercaseChars + digitChars;

        if (includingSC.equalsIgnoreCase("yes")) {
            allChars += specialChars;
        }

        SecureRandom random = new SecureRandom();
        StringBuilder password = new StringBuilder();

        while (password.length() < length) {
            // Choose a random character from the combined character set
            char randomChar = allChars.charAt(random.nextInt(allChars.length()));

            // Check for consecutive characters or repetitive patterns
            if (isWeakPattern(password.toString(), randomChar)) {
                continue; // Skip weak patterns
            }

            password.append(randomChar);
        }

        return password.toString();
    }

    static boolean isWeakPattern(String currentPassword, char newChar) {
        int length = currentPassword.length();

        // Check for consecutive characters (e.g., 1234, abcd)
        if (length >= 2 && currentPassword.charAt(length - 1) == currentPassword.charAt(length - 2) + 1
                && newChar == currentPassword.charAt(length - 1) + 1) {
            return true;
        }

        // Check for repetitive patterns (e.g., aa11bb22)
        if (length >= 2 && currentPassword.charAt(length - 1) == newChar) {
            return true;
        }
        return false;
    }
}
