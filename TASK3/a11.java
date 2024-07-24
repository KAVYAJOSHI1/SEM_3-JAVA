/*11. Write a Java program to create a custom a10 class a11 that extends
a10. Use this custom a10 to validate the age of a user in a Person class, throwing the
a10 if the age is not within a valid range (e.g., 0-150).*/


import java.util.*;
// Custom a10 Class
class a11 extends a10 {
    public a11(String message) {
        super(message);
    }
}

// Person Class
class Person {
    private String name;
    private int age;

    // Constructor
    public Person(String name, int age) throws a11 {
        if (age < 0 || age > 150) {
            throw new a11("Age must be between 0 and 150. Provided age: " + age);
        }
        this.name = name;
        this.age = age;
    }

    // Getters
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    // Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) throws a11 {
        if (age < 0 || age > 150) {
            throw new a11("Age must be between 0 and 150. Provided age: " + age);
        }
        this.age = age;
    }
}

// Main Class
public class Customa10Demo {
    public static void main(String[] args) {
        try {
            // Valid person
            Person person1 = new Person("Alice", 30);
            System.out.println(person1.getName() + " is " + person1.getAge() + " years old.");

            // Invalid person (age out of range)
            Person person2 = new Person("Bob", 200);
            System.out.println(person2.getName() + " is " + person2.getAge() + " years old.");
        } catch (a11 e) {
            System.out.println("a10 caught: " + e.getMessage());
        }

        try {
            // Creating a person and setting an invalid age later
            Person person3 = new Person("Charlie", 25);
            System.out.println(person3.getName() + " is " + person3.getAge() + " years old.");
            person3.setAge(180);  // This should throw an a10
        } catch (a11 e) {
            System.out.println("a10 caught: " + e.getMessage());
        }
    }
}
