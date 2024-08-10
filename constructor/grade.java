import java.util.Arrays;
import java.util.Scanner;

// Define a Student class to hold the student's details
class grade {
    String name;
    int rollNo;
    double grade;

    // Constructor to initialize the student's details
    public Student(String name, int rollNo, double grade) {
        this.name = name;
        this.rollNo = rollNo;
        this.grade = grade;
    }

    // Method to display the student's details
    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Roll No: " + rollNo);
        System.out.println("Grade: " + grade);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Student[] students = new Student[5];

        // Take input from the user and store it in the array of objects
        for (int i = 0; i < 5; i++) {
            System.out.println("Enter details for Student " + (i + 1));
            System.out.print("Name: ");
            String name = scanner.nextLine();
            System.out.print("Roll No: ");
            int rollNo = scanner.nextInt();
            System.out.print("Grade: ");
            double grade = scanner.nextDouble();
            scanner.nextLine(); // Consume newline left-over

            students[i] = new Student(name, rollNo, grade);
        }

        // Sort the students according to their grade
        Arrays.sort(students, (a, b) -> Double.compare(a.grade, b.grade));

        // Display the sorted list of students
        System.out.println("\nSorted List of Students:");
        for (Student student : students) {
            student.display();
            System.out.println();
        }
    }
}