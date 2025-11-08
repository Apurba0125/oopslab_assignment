import java.util.Scanner;

public class StringPalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        // Convert to lowercase and remove spaces for accurate comparison
        str = str.toLowerCase().replaceAll("\\s+", "");

        String reversed = "";
        int i = str.length() - 1;

        // Reverse the string manually using a while loop
        while (i >= 0) {
            reversed = reversed + str.charAt(i);
            i--;
        }

        if (str.equals(reversed)) {
            System.out.println("The string is a palindrome.");
        } else {
            System.out.println("The string is not a palindrome.");
        }
    }
}
