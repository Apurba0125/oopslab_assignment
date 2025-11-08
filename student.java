// Complete Java program using Student class
public class student {
    // Declaring attributes
    String name;
    String rollNo;
    String regNo;
    String email;
    int age;

    // Constructor to initialize attributes
    student(String name, String rollNo, String regNo, String email, int age) {
        this.name = name;
        this.rollNo = rollNo;
        this.regNo = regNo;
        this.email = email;
        this.age = age;
    }

    // Method to print student details
    public void printDetails() {
        System.out.println("Student Details:");
        System.out.println("Name: " + this.name);
        System.out.println("Roll No: " + this.rollNo);
        System.out.println("Reg No: " + this.regNo);
        System.out.println("Email: " + this.email);
        System.out.println("Age: " + this.age);
    }

    // Main method to run the program
    public static void main(String[] args) {
        // Create object of Student class
        student s1 = new student("Rahul Sharma", "23CS101", "SVU2025CS01", "rahul.s@svu.edu.in", 21);

        // Print student details
        s1.printDetails();
    }
}
