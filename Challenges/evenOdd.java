/**
 * Author   : AlphaCoder1107
 * GitHub   : https://github.com/AlphaCoder1107
 * Created  : 2025-06-25
 * Purpose  : 
 * License  : MIT License
 */

package Challenges; // Declares the package name

import java.util.Scanner; // Imports Scanner class for user input

public class evenOdd { // Defines the class

    int Num1, even, odd; // Declares variables (not used in static context)

    public static void main(String[] args) { // Main method, entry point
        Scanner input = new Scanner(System.in); // Creates Scanner object for input
        System.out.print("Welcome to Even Odd Checker\n"); // Prints welcome message
        System.out.print("Enter first number: "); // Prompts for number
        int Num1 = input.nextInt(); // Reads number
        String output = (Num1 % 2 == 0) ? "even" : "odd"; // Ternary operator to check even/odd
        System.out.println("The even number is: " + output); // Prints result
        input.close(); // Closes Scanner to prevent resource leaks
    }
}
