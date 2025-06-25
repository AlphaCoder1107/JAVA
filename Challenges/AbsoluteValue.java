/**
 * Author   : AlphaCoder1107
 * GitHub   : https://github.com/AlphaCoder1107
 * Created  : 2025-06-25
 * Purpose  : 
 * License  : MIT License
 */

package Challenges;

public class AbsoluteValue {
    
    public static void main(String[] args) {
        int number = -10; // Example number
        int absoluteValue = (number < 0) ? -number : number; // Ternary operator to find the absolute value
        System.out.println("The absolute value of " + number + " is: " + absoluteValue);
    }
}
