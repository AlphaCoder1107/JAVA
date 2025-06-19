/**
 * Author   : AlphaCoder1107
 * GitHub   : https://github.com/AlphaCoder1107
 * Created  : 2025-06-19
 * Purpose  : 
 * License  : MIT License
 */

import java.util.*;
public class EO{
  public static void main (String[] args){
    Scanner input = new Scanner (System.in);
    System.out.print("Enter the value to check EVEN or ODD: ");
    int Value = input.nextInt();
    if (Value % 2 == 0){
          System.out.print("The Entered Value is Even");
          }else{
          System.out.print("The Entered Value in ODD");
          }
  }
}