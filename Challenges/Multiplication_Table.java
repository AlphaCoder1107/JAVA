/**
 * Author   : AlphaCoder1107
 * GitHub   : https://github.com/AlphaCoder1107
 * Created  : 2025-06-29
 * Purpose  : 
 * License  : MIT License
 */

package Challenges;
import java.util.*; // Imports all classes from java.util, including Scanner
public class Multiplication_Table {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Create a Scanner object for user input
        System.out.print("Enter a number to generate its multiplication table: "); // Prompt user for input
        int number = scanner.nextInt(); // Read the number from user input
        System.out.println("Multiplication Table for " + number + ":"); // Header for the table
        scanner.close(); // Close the scanner to prevent resource leaks

        for (int i = 1; i <= 10; i++) { // Loop from 1 to 10
            int result = number * i; // Calculate the product
            System.out.println(number + " x " + i + " = " + result); // Print the multiplication statement
        }
    }
} 
