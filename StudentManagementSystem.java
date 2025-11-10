// File name: StudentManagementSystem.java

import java.util.*;

// Custom exception for invalid GPA
class InvalidGPAException extends Exception {
    public InvalidGPAException(String message) {
        super(message);
    }
}

// Base class Person
class Person {
    protected String name;
    protected int age;
    protected String address;

    public Person(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }
}

// Interface Displayable
interface Displayable {
    void displayDetails();
}

// Derived class Student extending Person and implementing Displayable
class Student extends Person implements Displayable {
    private String rollNumber;
    private double gpa;
    private String department;

    public Student(String name, int age, String address, String rollNumber, double gpa, String department)
            throws InvalidGPAException {
        super(name, age, address);

        if (gpa < 0.0 || gpa > 4.0) {
            throw new InvalidGPAException("Invalid GPA: " + gpa + ". GPA must be between 0.0 and 4.0.");
        }

        this.rollNumber = rollNumber;
        this.gpa = gpa;
        this.department = department;
    }

    // Method to calculate grade based on GPA
    public char calculateGrade() {
        if (gpa >= 3.7)
            return 'A';
        else if (gpa >= 3.0)
            return 'B';
        else if (gpa >= 2.0)
            return 'C';
        else if (gpa >= 1.0)
            return 'D';
        else
            return 'F';
    }

    // Display method implementation
    @Override
    public void displayDetails() {
        System.out.println("======================================");
        System.out.println("Name       : " + name);
        System.out.println("Age        : " + age);
        System.out.println("Address    : " + address);
        System.out.println("Roll No    : " + rollNumber);
        System.out.println("Department : " + department);
        System.out.println("GPA        : " + gpa);
        System.out.println("Grade      : " + calculateGrade());
    }
}

// Main class
public class StudentManagementSystem {
    public static void main(String[] args) {
        try {
            // Creating student objects
            Student s1 = new Student("Rahul Sharma", 20, "Kolkata", "CSE101", 3.8, "Computer Science");
            Student s2 = new Student("Priya Das", 21, "Delhi", "ECE102", 2.9, "Electronics");
            Student s3 = new Student("Amit Roy", 22, "Mumbai", "ME103", 1.5, "Mechanical");

            // Store in array
            Student[] students = { s1, s2, s3 };

            // Display details of all students
            System.out.println("==== STUDENT MANAGEMENT SYSTEM ====\n");
            for (Student s : students) {
                s.displayDetails();
            }

            // Example of invalid GPA handling
            System.out.println("\n--- Testing Invalid GPA Exception ---");
            Student s4 = new Student("Sneha", 19, "Pune", "CIV104", 4.5, "Civil Engineering");

        } catch (InvalidGPAException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
    }
}
