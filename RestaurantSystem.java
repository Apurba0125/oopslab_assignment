import java.util.ArrayList;
import java.util.Scanner;

// Abstract class representing a general MenuItem
abstract class MenuItem {
    private String name; // Encapsulated
    private double price; // Encapsulated

    public MenuItem(String name, double price) {
        this.name = name;
        this.price = price;
    }

    // Getter methods
    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    // Abstract method to display details (Abstraction)
    public abstract void displayItem();
}

// Concrete class representing a Food item
class FoodItem extends MenuItem {
    public FoodItem(String name, double price) {
        super(name, price);
    }

    @Override
    public void displayItem() {
        System.out.println(getName() + " - $" + getPrice());
    }
}

// Concrete class representing a Drink item
class DrinkItem extends MenuItem {
    public DrinkItem(String name, double price) {
        super(name, price);
    }

    @Override
    public void displayItem() {
        System.out.println(getName() + " - $" + getPrice());
    }
}

// Class representing an Order
class Order {
    private ArrayList<MenuItem> items; // Encapsulation

    public Order() {
        items = new ArrayList<>();
    }

    public void addItem(MenuItem item) {
        items.add(item);
    }

    public void displayOrder() {
        System.out.println("\nYour Order:");
        double total = 0;
        for (MenuItem item : items) {
            item.displayItem();
            total += item.getPrice();
        }
        System.out.println("Total: $" + total);
    }
}

// Main class
public class RestaurantSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Create menu
        ArrayList<MenuItem> menu = new ArrayList<>();
        menu.add(new FoodItem("Burger", 5.99));
        menu.add(new FoodItem("Pizza", 8.99));
        menu.add(new FoodItem("Pasta", 7.49));
        menu.add(new DrinkItem("Coke", 1.99));
        menu.add(new DrinkItem("Coffee", 2.49));

        System.out.println("Welcome to Java Restaurant!");
        System.out.println("Menu:");
        for (int i = 0; i < menu.size(); i++) {
            System.out.print((i + 1) + ". ");
            menu.get(i).displayItem();
        }

        Order order = new Order();

        while (true) {
            System.out.print("\nEnter item number to order (0 to finish): ");
            int choice = sc.nextInt();
            if (choice == 0) {
                break;
            }
            if (choice < 1 || choice > menu.size()) {
                System.out.println("Invalid choice! Try again.");
            } else {
                order.addItem(menu.get(choice - 1));
                System.out.println(menu.get(choice - 1).getName() + " added to your order.");
            }
        }

        order.displayOrder();
        System.out.println("Thank you for ordering!");
    }
}
