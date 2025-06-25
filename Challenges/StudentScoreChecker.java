/**
 * Author   : AlphaCoder1107
 * GitHub   : https://github.com/AlphaCoder1107
 * Created  : 2025-06-25
 * Purpose  : 
 * License  : MIT License
 */

package Challenges; // Declares the package name

import java.util.Scanner; // Imports Scanner class for user input

public class StudentScoreChecker { // Defines the class
    public static void main(String[] args) { // Main method, entry point
        Scanner input = new Scanner(System.in); // Creates Scanner object for input
        System.out.print("Enter the score of the student: "); // Prompts for score
        int score = input.nextInt(); // Reads score
        // Nested ternary operator for grade categorization
        String grade = (score >= 80) ? "High" : (score >= 50 ? "Moderate" : "Low");
        System.out.println("The grade of the student is: " + grade); // Prints grade
        input.close(); // Closes Scanner to prevent resource leaks
    }
}
