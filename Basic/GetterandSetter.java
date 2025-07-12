/**
 * Author   : AlphaCoder1107
 * GitHub   : https://github.com/AlphaCoder1107
 * Created  : 2025-07-12
 * Purpose  : 
 * License  : MIT License
 */

public class GetterandSetter {
    private String name; // Private variable
    private int age; // Another private variable
    private String address; // Another private variable
    private String email; // Another private variable
    private String phoneNumber; // Another private variable

    // Getter for name


    public GetterandSetter(int age, String name, String address, String email) {
        this.age = age;
        this.name = name;
        this.address = address;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public static void main(String[] args) {
        // Create an instance of GetterandSetter
        GetterandSetter person = new GetterandSetter(25, "John Doe", "123 Main St", "Alphacoder1107");
    }
}
