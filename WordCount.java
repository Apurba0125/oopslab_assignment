import java.util.Scanner;

public class WordCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String sentence = sc.nextLine();

        sentence = sentence.trim(); // remove leading and trailing spaces

        int wordCount = 0;
        if (sentence.isEmpty()) {
            wordCount = 0;
        } else {
            // Count words by counting spaces between them
            int i = 0;
            wordCount = 1; // at least one word if not empty
            while (i < sentence.length()) {
                if (sentence.charAt(i) == ' ') {
                    // If there are multiple spaces, skip them
                    while (i < sentence.length() && sentence.charAt(i) == ' ') {
                        i++;
                    }
                    if (i < sentence.length()) {
                        wordCount++;
                    }
                } else {
                    i++;
                }
            }
        }

        System.out.println("Number of words: " + wordCount);
    }
}
