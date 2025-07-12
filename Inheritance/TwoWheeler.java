/**
 * Author   : AlphaCoder1107
 * GitHub   : https://github.com/AlphaCoder1107
 * Created  : 2025-07-12
 * Purpose  : 
 * License  : MIT License
 */

package Inheritance;

public class TwoWheeler extends Vehicle {

    private String type; // e.g., "Motorcycle", "Scooter"

    public TwoWheeler(String brand, String model, int year, String type) {
        super(brand, model, year);
        this.type = type;
    }

    public String getType() {
        return type;
    }

    @Override
    public String toString() {
        return "TwoWheeler{" +
                "type='" + type + '\'' +
                ", brand='" + getBrand() + '\'' +
                ", model='" + getModel() + '\'' +
                ", year=" + getYear() +
                '}';
    }


}
