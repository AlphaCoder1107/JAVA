/**
 * Author   : AlphaCoder1107
 * GitHub   : https://github.com/AlphaCoder1107
 * Created  : 2025-06-25
 * Purpose  : 
 * License  : MIT License
 */

package Challenges;

import java.util.Scanner;

public class minOfTwoNumbers {

    int Num1, Num2, min;

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("welco to Number Checker\n");
        System.out.print("Enter first number:");
        int Num1 = input.nextInt();
        System.out.print("Enter second number:");
        int Num2 = input.nextInt();
        int min = (Num1 < Num2) ? Num1 : Num2; // Ternary operator to find the minimum of two numbers
        System.out.println("The minimum value is: " + min);
        input.close(); // Close the scanner to prevent resource leaks
    }
}
