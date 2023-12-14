package com.guessthenumber;

import java.util.Random;

public class Number {
    public static int getRandom() {
        Random random = new Random();
        return random.nextInt(100) + 1;
    }

    public static void hint(int attempt, int numberToGuess) {
        if (attempt < numberToGuess) {
            System.out.println("The number is greater. Try again.");
        } else if (attempt > numberToGuess) {
            System.out.println("The number is less. Try again.");
        }
    }

    public static void guessed(int attemptsMade) {
        System.out.println("¡Congratulations! You guessed the number in " + attemptsMade + " attempts.");
        System.out.println("Thank you for playing Guess the Number. I hope you had fun!");
    }
}
