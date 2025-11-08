import java.util.Scanner;

public class CompareStrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first string: ");
        String str1 = sc.nextLine();

        System.out.print("Enter second string: ");
        String str2 = sc.nextLine();

        boolean areEqual = true;

        // First, check if lengths are equal
        if (str1.length() != str2.length()) {
            areEqual = false;
        } else {
            // Compare character by character
            for (int i = 0; i < str1.length(); i++) {
                if (str1.charAt(i) != str2.charAt(i)) {
                    areEqual = false;
                    break;
                }
            }
        }

        if (areEqual) {
            System.out.println("The strings are equal.");
        } else {
            System.out.println("The strings are not equal.");
        }
    }
}
