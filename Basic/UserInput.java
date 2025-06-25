/**
 * Author   : AlphaCoder1107
 * GitHub   : https://github.com/AlphaCoder1107
 * Created  : 2025-06-19
 * Purpose  : 
 * License  : MIT License
 */

import java.util.Scanner;
/**
 * This class is responsible for handling user input.
 * It currently does not contain any methods or properties.
 */
public class UserInput {
    public static void main(String[] args){
        // Create a Scanner object to read input from the console
        Scanner input = new Scanner(System.in);
        
        // Prompt the user for input
        System.out.print("Enter your name: ");
        
        // Read the user input as a string
        String name = input.nextLine();
        
        // Print a greeting message using the user's input
        System.out.println("Hello " + name + "! Welcome to the program.");
         
        // Close the scanner to prevent resource leaks
        input.close();
    }
} 