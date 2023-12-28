package org.softserve.academy;

import java.util.Random;
import java.util.Scanner;

/*
Hard Level
Rock, Paper, Scissors Game: Create a simple rock, paper, scissors game against the computer.
The computer randomly chooses rock, paper, or scissors, and the user inputs their choice.
Use a loop to play multiple rounds and keep score until the user decides to quit.
Rock wins against scissors; paper wins against rock; and scissors wins against paper.
 */
public class Task8Game {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        enum Choice {
            ROCK,
            PAPER,
            SCISSORS;

            //We declare a method inside the enum class body that is static and returns an enum value.
            // This method will call nextInt() from a Random object,
            // and we’ll name this method randomChoice():
            private static final Random ELEMENT = new Random();

            public static Choice randomChoice() {
                Choice[] choices = values();
                return choices[ELEMENT.nextInt(choices.length)];
            }
        }

        int wins = 0;
        int losses = 0;

        System.out.println("Welcome to Rock-Paper-Scissors! Please enter \"rock\", \"paper\", \"scissors\", or \"quit\" to exit.");

        while (true) {
            System.out.println("-------------------------");
            System.out.print("Enter your move: ");
            String playerMove = sc.nextLine();

            if (playerMove.equals("quit")) {
                System.out.println("You won " + wins + " times and lost " + losses + " times.");
                System.out.println("Thanks for playing! See you again.");
                break;
            }

            try {
              Choice.valueOf(playerMove.toUpperCase());
            } catch (Exception e){
                System.out.println("Your move isn't valid!");
                continue;
            }

            Choice userChoice = Choice.valueOf(playerMove.toUpperCase());

            Choice computerChoice = Choice.randomChoice();
            boolean isPlayerWin = (userChoice.equals(Choice.ROCK) && computerChoice.equals(Choice.SCISSORS))
                    || (userChoice.equals(Choice.SCISSORS) && computerChoice.equals(Choice.PAPER))
                    || (userChoice.equals(Choice.PAPER) && computerChoice.equals(Choice.ROCK));

            if (userChoice.equals(computerChoice)) {
                System.out.println("It's a tie! The computer choice was: " +computerChoice);
            } else if (isPlayerWin) {
                System.out.println("You won! The computer choice was: " +computerChoice);
                wins++;
            } else {
                System.out.println("You lost! The computer choice was: " +computerChoice);
                losses++;
            }
        }
    }
}