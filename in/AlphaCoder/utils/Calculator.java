/**
 * Author   : AlphaCoder1107
 * GitHub   : https://github.com/AlphaCoder1107
 * Created  : 2025-07-12
 * Purpose  : 
 * License  : MIT License
 */

package in.AlphaCoder.utils;

import in.AlphaCoder.geometry.Circle;
import in.AlphaCoder.geometry.Rectangle;

public class Calculator {
    public static void main(String[] args) {
        double a = 5.0;
        double b = 3.0;
        double radius = 2.0;

        // Rectangle calculations
        Rectangle rectangle = new Rectangle(a, b);
        System.out.println("Rectangle Area: " + rectangle.area());

        System.out.println("Rectangle Perimeter: " + rectangle.perimeter());
        System.out.println("Is Square: " + rectangle.isSquare());

        // Circle calculations
        Circle circle = new Circle(radius);
        System.out.println("Circle Area: " + circle.area());

        System.out.println("Circle Circumference: " + circle.circumference());
        System.out.println("Is Unit Circle: " + circle.isUnitCircle());

        // Additional calculations
    }
}
