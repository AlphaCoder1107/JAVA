/**
 * Author   : AlphaCoder1107
 * GitHub   : https://github.com/AlphaCoder1107
 * Created  : 2025-06-25
 * Purpose  : 
 * License  : MIT License
 */

package CAR;
import CAR.Car;

public class Driver {
    public static void main(String[] args){
       Car myCar = new Car();

       
       
       myCar.addFuel(100.0f);
        myCar.drive();
        myCar.drive();
        myCar.drive();
        myCar.drive();
        myCar.drive();
        System.out.println(myCar.currentFuel());
        myCar.noOfWheels();


    }
}
