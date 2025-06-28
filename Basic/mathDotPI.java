/**
 * Author   : AlphaCoder1107
 * GitHub   : https://github.com/AlphaCoder1107
 * Created  : 2025-06-29
 * Purpose  : 
 * License  : MIT License
 */

import java.lang.Math;
import java.util.*;
public class mathDotPI {
        public static void main(String[] args) {
            // Print the value of PI
            System.out.println("The value of PI is: " + Math.PI);
            Scanner input = new Scanner(System.in);
            System.out.print("Enter a number to get Circumfrence of a Circle: ");
            double radius = input.nextDouble();
            // Calculate the circumference of a circle
            double circumference = 2 * Math.PI * radius;
            // Print the circumference
            System.out.printf("The circumference of the circle with radius %.3f is: %.3f\n", radius, circumference);    }
}
