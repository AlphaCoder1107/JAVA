/**
 * Author   : AlphaCoder1107
 * GitHub   : https://github.com/AlphaCoder1107
 * Created  : 2025-07-12
 * Purpose  : 
 * License  : MIT License
 */

package Challenges;

public class Employee {

    private String name;
    private int age;
    private String position;
    private double salary;

    public Employee(String name, int age, String position, double salary) {
        this.name = name;
        this.age = age;
        this.position = position;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getPosition() {
        return position;
    }

    public double getSalary() {
        return salary;
    }

    public void giveRaise(double percentage) {
        if (percentage > 0) {
            salary += salary * (percentage / 100);
        } else {
            System.out.println("Raise percentage must be positive.");
        }
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", position='" + position + '\'' +
                ", salary=" + salary +
                '}';
    }

    public static void main(String[] args) {
        Employee emp = new Employee("Alice", 30, "Software Engineer", 70000);
        System.out.println(emp);

        emp.giveRaise(10);
        System.out.println("After raise: " + emp);
    }


}
