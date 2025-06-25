/**
 * Author   : AlphaCoder1107
 * GitHub   : https://github.com/AlphaCoder1107
 * Created  : 2025-06-19
 * Purpose  : 
 * License  : MIT License
 */

import java.util.*;
  public class AssignmentOP{
    public static void main(String [] args){
      int c = 50;
      Scanner input = new Scanner (System.in);
      System.out.print("Enter the First value: ");
      int a = input.nextInt();
      int b = 50 + a;
      System.out.println("Value of a: " + a);
      System.out.println("Value of b: " + b);
      if(a == b){
              System.out.println("The Both Values are equal:");
      }else{
            System.out.println("The difference Btw both values are: " + (a-b));
          }
      System.out.print("Value of C: " + c );
  }
}
