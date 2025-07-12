/**
 * Author   : AlphaCoder1107
 * GitHub   : https://github.com/AlphaCoder1107
 * Created  : 2025-07-12
 * Purpose  : 
 * License  : MIT License
 */

package Inheritance;

public class inheritance_Test {

    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle("Toyota", "Corolla", 2020);
        System.out.println(vehicle);

        TwoWheeler twoWheeler = new TwoWheeler("Yamaha", "MT-07", 2021, "Motorcycle");
        System.out.println(twoWheeler);
    }
}
