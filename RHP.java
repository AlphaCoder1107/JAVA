/**
 * Author   : AlphaCoder1107
 * GitHub   : https://github.com/AlphaCoder1107
 * Created  : 2025-06-09
 * Purpose  : 
 * License  : MIT License
 */

public class RHP {
    public static void main(String[] args) {
        int rows = 5;
        for (int i = 1; i <= rows; i++) {
            // Print spaces
            for (int j = i; j < rows; j++) {
                System.out.print(" ");
            }
            // Print stars for left half
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            // Print stars for right half
            for (int j = 1; j < i; j++) {
                System.out.print("*");
            }
            // Move to next line
            System.out.println();
        }
    }
}
