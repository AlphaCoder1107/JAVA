/**
 * Author   : AlphaCoder1107
 * GitHub   : https://github.com/AlphaCoder1107
 * Created  : 2025-06-25
 * Purpose  : 
 * License  : MIT License
 */

package Challenges; // Declares the package name

public class AbsoluteValue { // Defines the class

    public static void main(String[] args) { // Main method, entry point
        int number = -10; // Example number
        int absoluteValue = (number < 0) ? -number : number; // Ternary operator for absolute value
        System.out.println("The absolute value of " + number + " is: " + absoluteValue); // Prints result
    }
}
