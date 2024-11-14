package Assignment8.String;

public class Ex8_FindTheLongest {

    public static String findLongestWord(String str) {
        String[] words = str.trim().split("\\s+");
        String longestWord = "";
        for (String word : words) {
            if (word.length() > longestWord.length()) {
                longestWord = word;
            }
        }
        return longestWord;
    }

    public static void main(String[] args) {
        String input = "This is an example string with several words of different lengths.";
        String longestWord = findLongestWord(input);
        System.out.println("The longest word is: \"" + longestWord + "\"");

    }
}
