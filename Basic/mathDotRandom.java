/**
 * Author   : AlphaCoder1107
 * GitHub   : https://github.com/AlphaCoder1107
 * Created  : 2025-06-29
 * Purpose  : 
 * License  : MIT License
 */

public class mathDotRandom {
    public static void main(String[] args) {
        // Generate a random number between 0.0 (inclusive) and 1.0 (exclusive)
        double randomValue = Math.random();

        // Print the random value
        System.out.println("Random value between 0.0 and 1.0: " + randomValue);

        // Generate a random integer between 1 and 100
        int randomInt = (int) (Math.random() * 6) + 1;

        // Print the random integer
        System.out.println("Random integer between 1 and 6: " + randomInt);
    }
}
