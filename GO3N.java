/**
 * Author   : AlphaCoder1107
 * GitHub   : https://github.com/AlphaCoder1107
 * Created  : 2025-06-19
 * Purpose  : 
 * License  : MIT License
 */

import java.util.Scanner;
public class GO3N{
  public static void main (String[] args){
    Scanner input = new Scanner (System.in);
    System.out.print("Enter the Digit 1: ");
        int dig1 = input.nextInt();
    System.out.print("Enter the Digit 2: ");
        int dig2 = input.nextInt();
    System.out.print("Enter the Digit 3: ");
        int dig3 = input.nextInt();
    if(dig1 > dig2 && dig1 > dig3){
      System.out.print("Digit 1 is greatest of all them");
      }
    if(dig2 > dig3){
      System.out.print("Digit 2 is greatest of all them");
      }
    else{
      System.out.print("Digit 3 is greatest of all them");
      }
  }
}
