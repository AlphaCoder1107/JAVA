/**
 * Author   : AlphaCoder1107
 * GitHub   : https://github.com/AlphaCoder1107
 * Created  : 2025-06-25
 * Purpose  : 
 * License  : MIT License
 */

package Challenges; // Declares the package name

import java.util.*; // Imports all classes from java.util, including Scanner

public class Calculator { // Defines the Calculator class
    
    int num1, num2, result; // Operands and result

    // Method for addition
    public int calculationAdd(int num1, int num2) {
        this.num1 = num1; // Stores first operand
        this.num2 = num2; // Stores second operand
        result = num1 + num2; // Performs addition
        return result; // Returns result
    }

    // Method for subtraction
    public int calculationSub(int num1, int num2) {
        this.num1 = num1; // Stores first operand
        this.num2 = num2; // Stores second operand
        result = num1 - num2; // Performs subtraction
        return result; // Returns result
    }

    // Method for multiplication
    public int calculationMul(int num1, int num2) {
        this.num1 = num1; // Stores first operand
        this.num2 = num2; // Stores second operand
        result = num1 * num2; // Performs multiplication
        return result; // Returns result
    }

    // Method for division
    public int calculationDiv(int num1, int num2) {
        this.num1 = num1; // Stores first operand
        this.num2 = num2; // Stores second operand
        if (num2 != 0) { // Checks for division by zero
            result = num1 / num2; // Performs division
        } else {
            System.out.println("Division by zero is not allowed."); // Error message
            result = 0; // Sets result to 0 if division by zero
        }
        return result; // Returns result
    }

    public static void main(String[] args) { // Main method, entry point
        Scanner input = new Scanner(System.in); // Scanner for numbers
        Calculator calc = new Calculator(); // Creates Calculator object

        System.out.println("Welcome to the Calculator!"); // Welcome message
        System.out.println("You can perform the following operations:"); // Info message
        System.out.println("1. Addition"); // Option 1
        System.out.println("2. Subtraction"); // Option 2
        System.out.println("3. Multiplication"); // Option 3
        System.out.println("4. Division"); // Option 4
        System.out.println("Please select an operation by entering the corresponding number (1-4):"); // Prompt
        int operation = input.nextInt(); // Reads operation choice
        if (operation < 1 || operation > 4) { // Checks for valid operation
            System.out.println("Invalid operation selected. Please restart the program and select a valid operation."); // Error
                                                                                                                        // message
            input.close(); // Closes Scanner
            return; // Exits program
        }

        System.out.print("Enter first number: "); // Prompt for first number
        int num1 = input.nextInt(); // Reads first number
        System.out.print("Enter second number: "); // Prompt for second number
        int num2 = input.nextInt(); // Reads second number

        int result = 0; // Stores result
        switch (operation) { // Switch for operation
            case 1 -> {
                result = calc.calculationAdd(num1, num2); // Calls addition
                System.out.println("Result: " + result); // Prints result
            }
            case 2 -> {
                result = calc.calculationSub(num1, num2); // Calls subtraction
                System.out.println("Result: " + result); // Prints result
            }
            case 3 -> {
                result = calc.calculationMul(num1, num2); // Calls multiplication
                System.out.println("Result: " + result); // Prints result
            }
            case 4 -> {
                result = calc.calculationDiv(num1, num2); // Calls division
                System.out.println("Result: " + result); // Prints result
            }
            //default case not require because We already checked it in IF-ELSE
        }

        input.close(); // Closes Scanner
    }
}
