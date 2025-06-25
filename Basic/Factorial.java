/**
 * Author   : AlphaCoder1107
 * GitHub   : https://github.com/AlphaCoder1107
 * Created  : 2025-06-19
 * Purpose  : 
 * License  : MIT License
 */

import java.util.Scanner;
public class Factorial {
    public static void main(String[] args) {
        int number = getInput();
        int result = factorial(number);
        System.out.println("The factorial of " + number + " is: " + result);
    }

    public static int getInput() {
        Scanner input = new Scanner(System.in);
        System.out.print("Welcome to get Factorial.\nEnter the value: ");
        int number = input.nextInt();
        // input.close(); // Don't close here if you want to reuse System.in
        return number;
    }

    public static int factorial(int number) {
        int result = 1;
        for (int i = 2; i <= number; i++)
            result *= i;
        return result;
    }
}