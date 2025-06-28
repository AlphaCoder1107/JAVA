/**
 * Author   : AlphaCoder1107
 * GitHub   : https://github.com/AlphaCoder1107
 * Created  : 2025-06-29
 * Purpose  : 
 * License  : MIT License
 */

public class toString {
    public static void main(String[] args) {
        // Create an instance of the class
        toString example = new toString();

        // Print the string representation of the instance
        System.out.println(example.toString());
    }

    @Override
    public String toString() {
        return "This is a custom toString method!";
    }
}
