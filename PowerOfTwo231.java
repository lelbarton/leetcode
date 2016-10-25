// Given an integer, write a function to determine if it is a power of two.

public class Solution {
    public boolean isPowerOfTwo(int n) {
        // 0 cannot be reduced
        if (n == 0) { return false; }
        // divide n by two until it is not an even number
        while (n % 2 == 0) {
            n = n / 2;
        }
        return n == 1;
    }
}
