// 13.Reverse a given string without using built-in methods.

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        String reversed = "";

        int i = str.length() - 1;

        // Reverse manually using a while loop
        while (i >= 0) {
            reversed = reversed + str.charAt(i);
            i--;
        }

        System.out.println("Reversed string: " + reversed);
    }
}
