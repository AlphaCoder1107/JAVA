package Basic;

/**
 * Author   : AlphaCoder1107
 * GitHub   : https://github.com/AlphaCoder1107
 * Created  : 2025-06-19
 * Purpose  : 
 * License  : MIT License
 */

import java.util.Scanner;
  public class IOSum{
    public static void main(String[] args){
      Scanner input = new Scanner (System.in);
      System.out.print("Enter The First Digit: ");
      int FirstDigit = input.nextInt();
      System.out.print("Enter The Second Digit: ");
      int SecondDigit = input.nextInt();
      if(FirstDigit >=0 || SecondDigit >= 0){
      System.out.println("The Sum of Two Digits is: " + (FirstDigit+SecondDigit));
      System.out.println("The Subtraction of Two Digits is: " + (FirstDigit-SecondDigit));
      System.out.println("The Multiplication of Two Digits is: " + (FirstDigit*SecondDigit));
      if(SecondDigit != 0){
      System.out.println("The Division of Two Digits is: " + (FirstDigit / SecondDigit));
      System.out.println("The Reminder of Two Digits is: " + (FirstDigit % SecondDigit));
      } else {
              System.out.println("The Value is not Divisible by 0");
      }
    }
  }
}