import java.util.Scanner;

public class StringCaseConversion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        String upper = str.toUpperCase(); // convert to uppercase
        String lower = str.toLowerCase(); // convert to lowercase

        System.out.println("Uppercase: " + upper);
        System.out.println("Lowercase: " + lower);
    }
}
