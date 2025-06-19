/**
 * Author   : AlphaCoder1107
 * GitHub   : https://github.com/AlphaCoder1107
 * Created  : 2025-06-19
 * Purpose  : 
 * License  : MIT License
 */

import java.util.*;
  public class Grades{
    public static void main (String[] args){
    Scanner input = new Scanner (System.in);
    System.out.print("Enter your marks: ");
    int Marks = input.nextInt();
    System.out.print("Enter your Total Marks: ");
    float Sub = input.nextFloat();
    float Per = ((Marks/Sub)*100);
    System.out.print(Per + "%");
    if(Per <= 30.0){
    System.out.print("You got D grade");
    }
       else if(Per < 30.0){
    System.out.print("You got F grade");
    }
       else if(Per <= 60.0){
    System.out.print("You got C grade");
    }
       else if(Per <= 75.0){
    System.out.print("You got B grade");
    }
       else if(Per <= 90.0){
    System.out.print("You got A grade");
    }
       else if(Per <= 95.0){
    System.out.print("You got A+ grade");
    }
  }
}
