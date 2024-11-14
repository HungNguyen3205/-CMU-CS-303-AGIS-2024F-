package Assignment8.String;

public class Ex7_RemoveExtraSpaces {

    public static void RemoveExtraSpaces() {
        String input = "   This   is  a   test   string.   ";
        String cleanedString = removeExtraSpaces(input);
        System.out.println("Original String: \"" + input + "\"");
        System.out.println("Cleaned String: \"" + cleanedString + "\"");
    }

    public static void main(String[] args) {
        Ex7_RemoveExtraSpaces.RemoveExtraSpaces();
    }

    private static String removeExtraSpaces(String str) {
        return str.trim().replaceAll("\\s+", " ");
    }
}
