/**
 * Author   : AlphaCoder1107
 * GitHub   : https://github.com/AlphaCoder1107
 * Created  : 2025-06-19
 * Purpose  : 
 * License  : MIT License
 */

import java.util.Scanner;
public class inputSum{
  public static void main (String[] args){
  int c;
  Scanner input = new Scanner (System.in);
  System.out.print("Enter First Numeric Value: ");
  int a = input.nextInt();
  System.out.print("Enter Second Numeric Value: ");
  int b = input.nextInt();
  c = a + b;
  System.out.print("The Total is: " + c);
  input.close();
  }
}