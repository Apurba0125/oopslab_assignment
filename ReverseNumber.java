import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int reversed = 0;
        int temp = num;

        while (temp != 0) {
            int digit = temp % 10; // get the last digit
            reversed = reversed * 10 + digit; // append digit
            temp /= 10; // remove last digit
        }

        System.out.println("Reversed number: " + reversed);
    }
}
