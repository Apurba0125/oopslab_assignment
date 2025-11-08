import java.util.Scanner;

public class RemoveSpaces {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        // Remove all spaces using replaceAll()
        String result = str.replaceAll("\\s+", "");

        System.out.println("String without spaces: " + result);
    }
}
