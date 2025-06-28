/**
 * Author   : AlphaCoder1107
 * GitHub   : https://github.com/AlphaCoder1107
 * Created  : 2025-06-25
 * Purpose  : 
 * License  : MIT License
 */

package Challenges;
import java.util.*;
public class NumberGuessingGame {
    int rando,guessNumber,attempts = 0; // Random number, user's guess, and attempt counter


    Random random = new Random();
    Scanner scanner = new Scanner(System.in);
    int numberToGuess = random.nextInt(100) + 1; // Random number between 1 and 100
    public void startGame() { // Method to start the game
        System.out.println("Welcome to the Number Guessing Game!"); // Welcome message
        System.out.println("Try to guess the number between 1 and 100."); // Instructions

        while (true) { // Infinite loop for guessing
            System.out.print("Enter your guess: "); // Prompt for user input
            guessNumber = scanner.nextInt(); // Read user's guess
            attempts++; // Increment attempt counter

            if (guessNumber < numberToGuess) { // If guess is too low
                System.out.println("Too low! Try again."); // Hint
            } else if (guessNumber > numberToGuess) { // If guess is too high
                System.out.println("Too high! Try again."); // Hint
            } else { // If guess is correct
                System.out.println("Congratulations! You've guessed the number " + numberToGuess + " in " + attempts + " attempts."); // Success message
                break; // Exit the loop
            }
        }
    }
    public static void main(String[] args) { // Main method, entry point
        NumberGuessingGame game = new NumberGuessingGame(); // Create game object
        game.startGame(); // Start the game
    } // End of main method

}


