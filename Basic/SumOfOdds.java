/**
 * Author   : AlphaCoder1107
 * GitHub   : https://github.com/AlphaCoder1107
 * Created  : 2025-06-19
 * Purpose  : 
 * License  : MIT License
 */

import java.util.*;

public class SumOfOdds {
    public static void main(String[] args) {


        int digit1 = getInput("Enter the first value: ");
        int digit2 = getInput("Enter the second value: ");
        int sum = sumOfOdds(digit1, digit2);
        displayResult(sum);
    }

    public static int getInput(String message) {
        Scanner input = new Scanner(System.in);
        System.out.print(message);
        int value = input.nextInt();
        // Do not close Scanner here if you need more input later
        return value;
    } 

    public static boolean isOdd(int number) {
        return number % 2 != 0;
    }

    public static int sumOfOdds(int start, int end) {
        int sum = 0;
        int min = Math.min(start, end);
        int max = Math.max(start, end);
        for (int i = min; i <= max; i++) {
            if (isOdd(i)) {
                sum += i;
            }
        }
        return sum;
    }

    public static void displayResult(int sum) {
        System.out.println("The total of all odd values is: " + sum);
    }
}
