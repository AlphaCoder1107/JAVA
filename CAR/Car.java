/**
 * Author   : AlphaCoder1107
 * GitHub   : https://github.com/AlphaCoder1107
 * Created  : 2025-06-25
 * Purpose  : 
 * License  : MIT License
 */

package CAR;
public class Car {
    int noOfWheels;
    String color; 
    float maxSpeed;
    float currentFuel;
    int noOfSeats;

    Car(){
        addFuel(10.0f);
        noOfWheels = 4;
       }

    public void drive(){
        if (currentFuel <= 0) {
            System.out.println("Cannot drive, fuel is empty");
            return;
        }else {
              
            System.out.println("The car is driving");
            currentFuel --;
        }

    }

    public void addFuel(float fuel){
        currentFuel += fuel;

    }

    public double currentFuel(){
        System.out.print("Current fuel level: " + currentFuel + " Liters");
        return currentFuel;
    }

    public void noOfWheels(){
        System.out.println("The car has " + noOfWheels + " wheels");
    }
    
}
