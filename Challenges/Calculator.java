/**
 * Author   : AlphaCoder1107
 * GitHub   : https://github.com/AlphaCoder1107
 * Created  : 2025-06-25
 * Purpose  : 
 * License  : MIT License
 */

package Challenges;
import java.util.*;
public class Calculator {
    
    String Addition, Subtraction, Multiplication, Division;
    int num1, num2, result;

    public int calculationAdd(String Addition, int num1, int num2) {
        this.Addition = Addition;
        this.num1 = num1;
        this.num2 = num2;
        result = num1 + num2;
        return result;
    }

    public int calculationSub(String Subtraction, int num1, int num2) {
        this.Subtraction = Subtraction;
        this.num1 = num1;
        this.num2 = num2;
        result = num1 - num2;
        return result;
    }

    public int calculationMul(String Multiplication, int num1, int num2) {
        this.Multiplication = Multiplication;
        this.num1 = num1;
        this.num2 = num2;
        result = num1 * num2;
        return result;
    }

    public int calculationDiv(String Division, int num1, int num2) {
        this.Division = Division;
        this.num1 = num1;
        this.num2 = num2;
        if (num2 != 0) {
            result = num1 / num2;
        } else {
            System.out.println("Division by zero is not allowed.");
            result = 0; // or throw an exception
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Calculator calc = new Calculator();


        System.out.println("Welcome to the Calculator!");
        System.out.println("You can perform the following operations:");
        Scanner operations = new Scanner(System.in);
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        System.out.println("Please select an operation by entering the corresponding number (1-4):");
        int operation = operations.nextInt();
        if (operation < 1 || operation > 4) {
            System.out.println("Invalid operation selected. Please restart the program and select a valid operation.");
            input.close();
            return;
        }

        System.out.print("Enter first number: ");
        int num1 = input.nextInt();
        System.out.print("Enter second number: ");
        int num2 = input.nextInt();

        int result = 0;
        switch (operation) {
            case 1 -> {
                result = calc.calculationAdd("Addition", num1, num2);
                System.out.println("Result: " + result);
            }
            case 2 -> {
                result = calc.calculationSub("Subtraction", num1, num2);
                System.out.println("Result: " + result);
            }
            case 3 -> {
                result = calc.calculationMul("Multiplication", num1, num2);
                System.out.println("Result: " + result);
            }
            case 4 -> {
                result = calc.calculationDiv("Division", num1, num2);
                System.out.println("Result: " + result);
            }
            default -> System.out.println("Invalid operation selected.");
        }

        input.close();
    }

}
