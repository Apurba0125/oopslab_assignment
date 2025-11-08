import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of terms: ");
        int n = sc.nextInt();

        int first = 0, second = 1;
        int count = 1;

        System.out.println("Fibonacci Series up to " + n + " terms:");

        while (count <= n) {
            System.out.print(first + " ");
            int next = first + second; // next term
            first = second;
            second = next;
            count++;
        }
    }
}
