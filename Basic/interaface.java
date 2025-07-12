/**
 * Author   : AlphaCoder1107
 * GitHub   : https://github.com/AlphaCoder1107
 * Created  : 2025-07-12
 * Purpose  : 
 * License  : MIT License
 */

import Challenges.Employee;

public class interaface {
    public static void main(String[] args) {
        // Example usage of the Employee class
        Employee emp = new Employee("Alice", 30, "Software Engineer", 70000);
        System.out.println(emp);

        emp.giveRaise(10);
        System.out.println("After raise: " + emp);
    }
}
