
/**
 * Author   : AlphaCoder1107
 * GitHub   : https://github.com/AlphaCoder1107
 * Created  : 2025-06-25
 * Purpose  : 
 * License  : MIT License
 */

import java.util.Scanner; // Imports Scanner class for user input

public class Switch { // Defines the Switch class
    public static void main(String[] args) { // Main method, entry point of the program
        String dayName; // Declares a variable to store the name of the day
        Scanner scanner = new Scanner(System.in); // Creates Scanner object for user input
        System.out.print("Enter a number (1-7) for the day of the week: "); // Prompts user for input
        int day = scanner.nextInt(); // Reads the day number from user

        // Traditional switch statement to determine the day name
        switch (day) {
            case 1:
                dayName = "Monday"; // If day is 1, set dayName to "Monday"
                break;
            case 2:
                dayName = "Tuesday"; // If day is 2, set dayName to "Tuesday"
                break;
            case 3:
                dayName = "Wednesday"; // If day is 3, set dayName to "Wednesday"
                break;
            case 4:
                dayName = "Thursday"; // If day is 4, set dayName to "Thursday"
                break;
            case 5:
                dayName = "Friday"; // If day is 5, set dayName to "Friday"
                break;
            case 6:
                dayName = "Saturday"; // If day is 6, set dayName to "Saturday"
                break;
            case 7:
                dayName = "Sunday"; // If day is 7, set dayName to "Sunday"
                break;
            default:
                dayName = "Invalid day"; // For any other number, set as invalid
        }

        System.out.println("The day is: " + dayName); // Prints the day name

        // Modern switch expression to determine the day name
        String output = switch (day) {
            case 1 -> "Monday"; // If day is 1, output is "Monday"
            case 2 -> "Tuesday"; // If day is 2, output is "Tuesday"
            case 3 -> "Wednesday"; // If day is 3, output is "Wednesday"
            case 4 -> "Thursday"; // If day is 4, output is "Thursday"
            case 5 -> "Friday"; // If day is 5, output is "Friday"
            case 6 -> "Saturday"; // If day is 6, output is "Saturday"
            case 7 -> "Sunday"; // If day is 7, output is "Sunday"
            default -> "Invalid day"; // For any other number, output is invalid
        };

        System.out.println("Switch expression output: " + output); // Prints the output from switch expression

        scanner.close(); // Closes the Scanner to free resources
    }
}
