/*11. Write a Java program to create a custom a10 class a11 that extends
a10. Use this custom a10 to validate the age of a user in a Person class, throwing the
a10 if the age is not within a valid range (e.g., 0-150).*/


import java.util.*;
// Custom a10 Class
class a11 extends Exception {
    public a11(String message) {
        super(message);
    }
}

class Person {
    private String name;
    private int age;
    private String address;
    public Person(String name, int age, String address) throws a11 {
        if (age < 0 || age > 150) { // Validate age 
            throw new a11("Invalid age");
        }
        this.name = name;
        this.age = age;
        this.address = address; 
    }        
    public String getName() {           
        return name;
    }
    public int getAge() {           
        return age;
    }
    public String getAddress() {           
        return address;
    }
}       

public class a11 {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter name, age and address");
            String name = sc.nextLine();
            int age = sc.nextInt();     
            sc.nextLine();
            String address = sc.nextLine();
            Person p = new Person(name, age, address);
            System.out.println("Name: " + p.getName());
            System.out.println("Age: " + p.getAge());
            System.out.println("Address: " + p.getAddress());
        } catch (a11 e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
                
