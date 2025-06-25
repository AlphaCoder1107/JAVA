/**
 * Author   : AlphaCoder1107
 * GitHub   : https://github.com/AlphaCoder1107
 * Created  : 2025-06-25
 * Purpose  : 
 * License  : MIT License
 */

package Challenges;

import java.util.Scanner;

public class StudentScoreChecker {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the score of the student: ");
        int score = input.nextInt();
        // Use nested ternary operator for clear categorization
        String grade = (score >= 80) ? "High" : (score >= 50 ? "Moderate" : "Low");
        System.out.println("The grade of the student is: " + grade);
        input.close(); // Close the scanner to prevent resource leaks
    }
}
