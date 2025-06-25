/**
 * Author   : AlphaCoder1107
 * GitHub   : https://github.com/AlphaCoder1107
 * Created  : 2025-06-25
 * Purpose  : 
 * License  : MIT License
 */

package Challenges;
import java.util.Scanner;
public class Monthcheck {
    
    int month,value;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the month number (1-12): ");
        int month = input.nextInt();
        input.close();
        
        // Use Enhanced break ternary operator to determine the number of days in the month

        String value = switch (month) {
            case 1 -> "january";
            case 2 -> "Febraury";
            case 3 -> "March";
            case 4 -> "April";
            case 5 -> "May";
            case 6 -> "June";
            case 7 -> "july";
            case 8 -> "August";
            case 9 -> "September";
            case 10 -> "october";
            case 11 -> "November";
            case 12 -> "December";
            default -> "Invalid";
        };
        
        System.out.println("The month is: " + value);
    }
}
