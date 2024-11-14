package Assignment8.String;

import java.util.Scanner;

public class Ex6_CountWords {

    public static void Count_words() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String s = sc.nextLine();
        String[] words = s.trim().split("\\s+");
        int wordCount = words.length;
        if (s.trim().isEmpty()) {
            wordCount = 0;
        }
        System.out.println(wordCount);
    }

    public static void main(String[] args) {
        Ex6_CountWords.Count_words();
    }
}
