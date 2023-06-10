package Question5;

import java.util.Arrays;

/*
valid anagram: given two strings s and t, return true if t is an anagram of s, and false otherwise.

Anagram is a word or a phrase formed by rearranging the letters of a different word or phrase,
typically using all the original letters exactly once.
 */
public class ValidAnagram {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        char[] sChars = s.toCharArray();
        char[] tChars = t.toCharArray();

        Arrays.sort(sChars);
        Arrays.sort(tChars);

        return areArraysEqual(sChars, tChars);
    }

    private boolean areArraysEqual(char[] sChars, char[] tChars) {
        if (sChars == tChars)
            return true;
        if (sChars == null || tChars == null)
            return false;

        if (tChars.length != sChars.length)
            return false;

        for (int i = 0; i < sChars.length; i++)
            if (sChars[i] != tChars[i])
                return false;

        return true;
    }

    public static void main(String[] args) {
        // Example usage
        ValidAnagram solution = new ValidAnagram();

        String s = "anagram";
        String t = "nagaram";
        boolean isAnagram = solution.isAnagram(s, t);

        System.out.println("Are the strings anagrams? " + isAnagram);
    }
}
