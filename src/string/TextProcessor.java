package string;

import java.util.Arrays;

public class TextProcessor {
    public static void main(String[] args) {
        var text = "radar";
        var isPalindromeWord = isPalindrome(text);
        System.out.println(text.toUpperCase() + " is palindrome: " + isPalindromeWord);

        countWords("Monkey D Luffy");
        isAnagram("Monkey D Luffy", "Luffy D Monkey");
        addSpaces("MonkeyDLuffy");
        printMultiLineString();
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

    public static void isAnagram(String text1, String text2) {
        var text1Array = text1.toLowerCase().toCharArray();
        var text2Array = text2.toLowerCase().toCharArray();

        Arrays.sort(text1Array);
        Arrays.sort(text2Array);

        var isAnagram = Arrays.equals(text1Array, text2Array);
        System.out.println(text1 + " is anagram of " + text2 + ": " + isAnagram);
    }

    public static void addSpaces(String text) {
        var modifiedText = new StringBuilder(text);

        for (int i = 0; i < modifiedText.length(); ++i) {
            if (i != 0 && Character.isUpperCase(modifiedText.charAt(i))) {
                modifiedText.insert(i, " ");
                i++;
            }
        }

        System.out.println(modifiedText);
    }

    public static void printMultiLineString() {
        var text = """
                Line 1
                Line 2
                Line 3
                """;
        System.out.println(text);
    }
}
