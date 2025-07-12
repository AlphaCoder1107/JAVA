/**
 * Author   : AlphaCoder1107
 * GitHub   : https://github.com/AlphaCoder1107
 * Created  : 2025-07-12
 * Purpose  : 
 * License  : MIT License
 */

package in.AlphaCoder.geometry;

public class Rectangle {
    public double length;
    public double width;
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }
    public double area() {
        return length * width;
    }
    public double perimeter() {
        return 2 * (length + width);
    }
    public boolean isSquare() {
        return length == width;
    }
}
