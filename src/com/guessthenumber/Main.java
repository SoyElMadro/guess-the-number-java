package com.guessthenumber;

import java.util.Scanner;

public class Main {
     static void welcome() {
        System.out.println("Welcome to Guess the Number!");
        System.out.println("I'm thinking of a number between 1 and 100. Can you guess what it is?");
    }

    public static void main(String[] args) {
        welcome();

        int numberToGuess = Number.getRandom();

        Scanner scanner = new Scanner(System.in);
        int attempt, attemptsMade = 0;
        final int max_attempts = 100; // You can adjust this limit according to your preferences.

        do {
            System.out.println("Guess the number (between 1 and 100): ");
            attempt = scanner.nextInt();
            if (attempt < 1 || attempt > 100) {
                System.out.println("The number provided must be between 1 and 100");
            } else {
                attemptsMade++;
                Number.hint(attempt, numberToGuess);
            }
        } while (attempt != numberToGuess && attemptsMade < max_attempts);

        if (attempt !=  numberToGuess) {
            System.out.println("Sorry, you've exhausted your attempts. The correct number was " +  numberToGuess + ".");
        }

        Number.guessed(attemptsMade);
    }
}