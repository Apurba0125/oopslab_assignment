import java.util.Scanner;

public class CharFrequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        str = str.toLowerCase().replaceAll("\\s+", ""); // convert to lowercase & remove spaces

        int[] freq = new int[256]; // to store frequency of each character (ASCII range)

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            freq[ch]++; // increment count of that character
        }

        System.out.println("Character frequencies:");
        for (int i = 0; i < 256; i++) {
            if (freq[i] != 0) {
                System.out.println((char) i + " = " + freq[i]);
            }
        }
    }
}
