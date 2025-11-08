import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to print its multiplication table: ");
        int num = sc.nextInt();

        int i = 1;

        System.out.println("Multiplication table of " + num + ":");
        while (i <= 10) { // printing table up to 10
            System.out.println(num + " x " + i + " = " + (num * i));
            i++;
        }
    }
}
