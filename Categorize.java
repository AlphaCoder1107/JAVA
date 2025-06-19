/**
 * Author   : AlphaCoder1107
 * GitHub   : https://github.com/AlphaCoder1107
 * Created  : 2025-06-19
 * Purpose  : 
 * License  : MIT License
 */

import java.util.*;
public class Categorize{
  public static void main(String[] args){
    Scanner input = new Scanner (System.in);
    System.out.print("Enter Your Age: ");
    int Age = input.nextInt();
    if(Age < 13){
    System.out.print("You are under 16");
    }
    else if(Age <= 17){
    System.out.print("You are under 18");
    }
    else if(Age <= 60){
    System.out.print("You are under 60");
    }
    else if(Age > 60){
    System.out.print("You are above 60");
    }
  }
}
  
