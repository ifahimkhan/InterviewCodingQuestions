package Question7;

import java.util.HashMap;
import java.util.Map;

/*Longest Palindrome:
given a string s, which consist of lowercase or uppercase letters, return the length of the longest palindrome that can be built with those letters.
Letters are case sensitive for example: "Aa" is not considered a palindrome here.*/
public class LongestPalindrome {
    public int longestPalindrome(String s) {
        Map<Character, Integer> frequencyMap = new HashMap<>();

        for (char ch : s.toCharArray()) {
            frequencyMap.put(ch, frequencyMap.getOrDefault(ch, 0) + 1);
        }

        int length = 0;
        boolean hasOddFrequency = false;

        for (int frequency : frequencyMap.values()) {
            if (frequency % 2 == 0) {
                length += frequency;
            } else {
                length += frequency - 1;
                hasOddFrequency = true;
            }
        }

        if (hasOddFrequency) {
            length++; // Add 1 for the middle character
        }

        return length;
    }

    public static void main(String[] args) {
        // Example usage
        LongestPalindrome solution = new LongestPalindrome();

        String s = "Aabcccccdd";
        int longestPalindromeLength = solution.longestPalindrome(s);

        System.out.println("Length of the longest palindrome: " + longestPalindromeLength);
    }
}

