import java.util.Scanner;

// Base class
class Vehicle {
    protected String vehicleNumber;
    protected String brand;
    protected double rentPerDay;

    public Vehicle(String vehicleNumber, String brand, double rentPerDay) {
        this.vehicleNumber = vehicleNumber;
        this.brand = brand;
        this.rentPerDay = rentPerDay;
    }

    // Method for polymorphism (overridden by subclasses)
    public double calculateRent(int days) {
        return rentPerDay * days;
    }

    public void displayInfo() {
        System.out.println("Vehicle Number: " + vehicleNumber);
        System.out.println("Brand: " + brand);
        System.out.println(String.format("Rent per day: %f", rentPerDay));
    }
}

// Derived class - Car
class Car extends Vehicle {
    public Car(String vehicleNumber, String brand) {
        super(vehicleNumber, brand, 2000); // Rent per day for Car
    }

    @Override
    public double calculateRent(int days) {
        System.out.println("Calculating rent for Car...");
        return rentPerDay * days;
    }
}

// Derived class - Bike
class Bike extends Vehicle {
    public Bike(String vehicleNumber, String brand) {
        super(vehicleNumber, brand, 800); // Rent per day for Bike
    }

    @Override
    public double calculateRent(int days) {
        System.out.println("Calculating rent for Bike...");
        return rentPerDay * days;
    }
}

// Derived class - Truck
class Truck extends Vehicle {
    public Truck(String vehicleNumber, String brand) {
        super(vehicleNumber, brand, 3500); // Rent per day for Truck
    }

    @Override
    public double calculateRent(int days) {
        System.out.println("Calculating rent for Truck...");
        return rentPerDay * days;
    }
}

// Aggregation: Customer has a Vehicle
class Customer {
    private String name;
    private String phone;
    private Vehicle rentedVehicle; // Aggregation
    private int rentalDays;

    public Customer(String name, String phone, Vehicle rentedVehicle, int rentalDays) {
        this.name = name;
        this.phone = phone;
        this.rentedVehicle = rentedVehicle;
        this.rentalDays = rentalDays;
    }

    public void showRentalDetails() {
        System.out.println("\n--- Customer Rental Details ---");
        System.out.println("Customer Name: " + name);
        System.out.println("Contact: " + phone);
        rentedVehicle.displayInfo();
        double totalRent = rentedVehicle.calculateRent(rentalDays);
        System.out.println("Rental Days: " + rentalDays);
        System.out.println(String.format("Total Rent: %.2f", totalRent));
    }
}

// Main class
public class VehicleRentalSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Ensures rupee symbol shows correctly

        System.out.println("Welcome to Vehicle Rental System");
        System.out.print("Enter Customer Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Contact Number: ");
        String phone = sc.nextLine();

        System.out.println("\nSelect Vehicle Type to Rent:");
        System.out.println("1. Car");
        System.out.println("2. Bike");
        System.out.println("3. Truck");
        System.out.print("Enter choice: ");
        int choice = sc.nextInt();

        System.out.print("Enter number of rental days: ");
        int days = sc.nextInt();

        Vehicle vehicle = null;

        switch (choice) {
            case 1:
                vehicle = new Car("CAR123", "Toyota");
                break;
            case 2:
                vehicle = new Bike("BIKE456", "Yamaha");
                break;
            case 3:
                vehicle = new Truck("TRUCK789", "Tata");
                break;
            default:
                System.out.println("Invalid choice!");
                System.exit(0);
        }

        Customer customer = new Customer(name, phone, vehicle, days);
        customer.showRentalDetails();

        sc.close();
    }
}
