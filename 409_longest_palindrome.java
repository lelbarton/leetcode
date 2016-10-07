// Given a string which consists of lowercase or uppercase letters, find the length of the longest palindromes that can be built with those letters.
//
// This is case sensitive, for example "Aa" is not considered a palindrome here.

public class Solution {
    public int longestPalindrome(String s) {
        int[] charCount = new int[256]; // Assume ASCII

        for (int i = 0; i < s.length(); i++) {
            charCount[s.charAt(i)]++;
        }

        int length = 0;
        boolean extra = false;
        for (int j = 0; j < charCount.length; j++) {
            length += charCount[j] / 2;
            if (charCount[j] % 2 == 1) {
                extra = true;
            }
        }
        length *= 2;
        if (extra) { length += 1; }

        return length;
    }
}
