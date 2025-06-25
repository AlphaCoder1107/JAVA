/**
 * Author   : AlphaCoder1107
 * GitHub   : https://github.com/AlphaCoder1107
 * Created  : 2025-06-25
 * Purpose  : 
 * License  : MIT License
 */

package Challenges; // Declares the package name

import java.util.Scanner; // Imports Scanner class for user input

public class Monthcheck { // Defines the Monthcheck class

    int month, value; // Declares instance variables (not used in static context)

    public static void main(String[] args) { // Main method, entry point of the program
        Scanner input = new Scanner(System.in); // Creates Scanner object for user input
        System.out.print("Enter the month number (1-12): "); // Prompts user to enter month number
        int month = input.nextInt(); // Reads the month number from user
        input.close(); // Closes the Scanner to free resources

        // Uses switch expression to determine the month name based on the number
        // entered
        String value = switch (month) {
            case 1 -> "January"; // If month is 1, value is "January"
            case 2 -> "February"; // If month is 2, value is "February"
            case 3 -> "March"; // If month is 3, value is "March"
            case 4 -> "April"; // If month is 4, value is "April"
            case 5 -> "May"; // If month is 5, value is "May"
            case 6 -> "June"; // If month is 6, value is "June"
            case 7 -> "July"; // If month is 7, value is "July"
            case 8 -> "August"; // If month is 8, value is "August"
            case 9 -> "September"; // If month is 9, value is "September"
            case 10 -> "October"; // If month is 10, value is "October"
            case 11 -> "November"; // If month is 11, value is "November"
            case 12 -> "December"; // If month is 12, value is "December"
            default -> "Invalid"; // For any other number, value is "Invalid"
        };

        System.out.println("The month is: " + value); // Prints the month name or "Invalid"
    }
}
