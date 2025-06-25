/**
 * Author   : AlphaCoder1107
 * GitHub   : https://github.com/AlphaCoder1107
 * Created  : 2025-06-25
 * Purpose  : 
 * License  : MIT License
 */

package Challenges;
import java.util.Scanner;
public class evenOdd {
    
    int Num1,  even, odd;
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Welcome to Even Odd Checker\n");
        System.out.print("Enter first number: ");
        int Num1 = input.nextInt();
        String output = (Num1 % 2 == 0) ? "even" : "odd"; // Ternary operator to find the even number
        System.out.println("The even number is: " + output);
       input.close(); // Close the scanner to prevent resource leaks
    }
}
