/**
 * Author   : AlphaCoder1107
 * GitHub   : https://github.com/AlphaCoder1107
 * Created  : 2025-06-25
 * Purpose  : 
 * License  : MIT License
 */

package Challenges; // Declares the package name

import java.util.Scanner; // Imports Scanner class for user input

public class minOfTwoNumbers { // Defines the class

    int Num1, Num2, min; // Declares variables (not used in static context)

    public static void main(String[] args) { // Main method, entry point
        Scanner input = new Scanner(System.in); // Creates Scanner object for input
        System.out.print("welco to Number Checker\n"); // Prints welcome message
        System.out.print("Enter first number:"); // Prompts for first number
        int Num1 = input.nextInt(); // Reads first number
        System.out.print("Enter second number:"); // Prompts for second number
        int Num2 = input.nextInt(); // Reads second number
        int min = (Num1 < Num2) ? Num1 : Num2; // Ternary operator to find minimum
        System.out.println("The minimum value is: " + min); // Prints minimum value
        input.close(); // Closes Scanner to prevent resource leaks
    }
}
