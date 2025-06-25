/**
 * Author   : AlphaCoder1107
 * GitHub   : https://github.com/AlphaCoder1107
 * Created  : 2025-06-25
 * Purpose  : 
 * License  : MIT License
 */

package Challenges; // Declares the package name

import java.util.*; // Imports all classes from java.util, including Scanner

public class Password_Checker { // Defines the Password_Checker class

    String password; // Stores the user's password
    boolean valid; // Stores whether the password is valid

    public String Requirements() { // Method to check password requirements

        Scanner input = new Scanner(System.in); // Creates a Scanner object for user input
        do { // Start of do-while loop to repeatedly ask for password

            System.out.print("Enter your Password: "); // Prompts user to enter password
            password = input.nextLine(); // Reads the entered password from user

            // Checks if password meets all requirements:
            valid = password.length() >= 8 && // At least 8 characters
                    password.length() <= 20 && // No more than 20 characters
                    password.matches(".*[A-Z].*") && // Contains at least one uppercase letter
                    password.matches(".*[a-z].*") && // Contains at least one lowercase letter
                    password.matches(".*[0-9].*") && // Contains at least one digit
                    password.matches(".*[@#$%^&+=].*"); // Contains at least one special character

            if (!valid) // If password is not valid
            {
                System.out.println("Invalid password!"); // Inform user password is invalid
            }
        } while (!valid); // Repeat loop until a valid password is entered

        input.close(); // Closes the Scanner to free resources
        return password; // Returns the valid password

    }

    public static void main(String[] args) { // Main method, entry point of the program
        Password_Checker checker = new Password_Checker(); // Creates an instance of Password_Checker
        String password = checker.Requirements(); // Calls Requirements() to get a valid password
        System.out.println("Your password is: " + password); // Prints the valid password
        System.out.println("Password meets all requirements."); // Confirms password is valid
    }
}
