/**
 * Author   : AlphaCoder1107
 * GitHub   : https://github.com/AlphaCoder1107
 * Created  : 2025-06-29
 * Purpose  : 
 * License  : MIT License
 */

public class Car {
    // 1. Property Declaration
    int wheels;


    // 2. Constructor
    Car() {
        wheels = 4;
        System.out.println("Constructor: Wheels set to " + wheels);
    }

    // 3. Method
    public void Maruti() {
        System.out.println("Method: This car has " + wheels + " wheels.");
    }

    // 4. Main Method
    public static void main(String[] args) {
        Car Maruti = new Car();     // Constructor runs
        Maruti.Maruti();            // Method runs
    }
}

