/**
 * Author   : AlphaCoder1107
 * GitHub   : https://github.com/AlphaCoder1107
 * Created  : 2025-06-19
 * Purpose  : 
 * License  : MIT License
 */

import java.util.*;
public class SumofDigits{
  public static void main(String[] args){
    Scanner input = new Scanner (System.in);
    System.out.print("Enter a Digit to get it's absolute value");
    int Num = input.nextInt();
    int Total = absolute(Num);
    System.out.print("The Sum of all numbers is: " + Total);
  }
    
  public static int absolute(int Num){
    int sum = 0;
    while (Num > 0){ 
    sum = sum + (Num % 10);
    Num /= 10;
    }
    return sum;
  }
}