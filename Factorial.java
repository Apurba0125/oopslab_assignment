import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        long factorial = 1; // use long to handle large factorials
        int i = 1;

        if (num < 0) {
            System.out.println("Factorial is not defined for negative numbers.");
        } else {
            while (i <= num) {
                factorial *= i;
                i++;
            }
            System.out.println("Factorial of " + num + " is: " + factorial);
        }
    }
}
