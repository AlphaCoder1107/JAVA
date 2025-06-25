/**
 * Author   : AlphaCoder1107
 * GitHub   : https://github.com/AlphaCoder1107
 * Created  : 2025-06-19
 * Purpose  : 
 * License  : MIT License
 */

import java.util.Scanner;
public class PNO{
  public static void main (String[] args){
    Scanner input = new Scanner (System.in);
    System.out.print("Enter The Value for Check: ");
    int value = input.nextInt();
    if(value > 0){
        System.out.print("The Entered Value is Positive.");
        }
    if(value < 0){
        System.out.print("The Entered Value is Negative.");
        } else{
        System.out.print("The Value is 0");
        }
   }
}