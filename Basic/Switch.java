/**
 * Author   : AlphaCoder1107
 * GitHub   : https://github.com/AlphaCoder1107
 * Created  : 2025-06-25
 * Purpose  : 
 * License  : MIT License
 */

import java.util.Scanner;
public class Switch {
    public static void main(String[] args) {
        // Example day of the week (1-7)
        String dayName;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number (1-7) for the day of the week: ");
        int day = scanner.nextInt();
        
        // Read user input for the day of the week
        switch (day) {
            case 1:
                dayName = "Monday";
                break;
            case 2:
                dayName = "Tuesday";
                break;
            case 3:
                dayName = "Wednesday";
                break;
            case 4:
                dayName = "Thursday";
                break;
            case 5:
                dayName = "Friday";
                break;
            case 6:
                dayName = "Saturday";
                break;
            case 7:
                dayName = "Sunday";
                break;
            default:
                dayName = "Invalid day"; // Default case for invalid input
        }

        System.out.println("The day is: " + dayName);
    
        String output = switch (day) {
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            case 3 -> "Wednesday";
            case 4 -> "Thursday";
            case 5 -> "Friday";
            case 6 -> "Saturday";
            case 7 -> "Sunday";
            default -> "Invalid day"; // Default case for invalid input
        }
    
    }

}

