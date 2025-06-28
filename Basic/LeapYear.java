/**
 * Author   : AlphaCoder1107
 * GitHub   : https://github.com/AlphaCoder1107
 * Created  : 2025-06-19
 * Purpose  : 
 * License  : MIT License
 */

import java.util.*;
public class LeapYear{
  public static void main (String[] args){
    Scanner input = new Scanner (System.in);
    System.out.print("Enter the Year: ");
    int Year = input.nextInt();
    if(Year % 400 == 0){
            System.out.println("Given year is a Leap year");
            }else{
            System.out.println("Given year is NOT a Leap year");
            }
  }
}    
