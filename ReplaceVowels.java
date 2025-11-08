import java.util.Scanner;

public class ReplaceVowels {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        String result = "";
        str = str.toLowerCase(); // optional: handle both cases easily

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                result += "*";
            } else {
                result += str.charAt(i);
            }
        }

        System.out.println("String after replacing vowels: " + result);
    }
}
