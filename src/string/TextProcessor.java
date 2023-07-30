package string;

public class TextProcessor {
    public static void main(String[] args) {
        var text = "radar";
        var isPalindromeWord = isPalindrome(text);
        System.out.println(text.toUpperCase() + " is palindrome: " + isPalindromeWord);

        countWords("Monkey D Luffy");
        reverseString("Monkey D Luffy");
    }

    public static void countWords(String text) {
        var words = text.split(" ");
        int numberOfWords = words.length;

        String message = String.format("Your text contains %d words:", numberOfWords);
        System.out.println(message);

        for (String word : words) {
            System.out.println(word);
        }
    }

    public static void reverseString(String text) {
        for (int i = text.length() - 1; i >= 0; i--) {
            System.out.print(text.charAt(i));
        }
    }

    public static boolean isPalindrome(String text) {
        var reverseText = new StringBuilder(text).reverse();
        return reverseText.toString().equals(text);
    }
}
