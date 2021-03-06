// Given an integer, write an algorithm to convert it to hexadecimal. For negative integer, two’s complement method is used.
//
// Note:
// All letters in hexadecimal (a-f) must be in lowercase.
// The hexadecimal string must not contain extra leading 0s. If the number is zero, it is represented by a single zero character '0'; otherwise, the first character in the hexadecimal string will not be the zero character.
// The given number is guaranteed to fit within the range of a 32-bit signed integer.
// You must not use any method provided by the library which converts/formats the number to hex directly.
//

public class Solution {
    public String toHex(int num) {
        if (num == 0) { return "0";}

        StringBuffer hex = new StringBuffer();
        int digit;

        char[] hexMap = {'0','1','2','3','4','5','6','7','8','9','a','b','c','d','e','f'};
        // translate each digit into hex char
        for (int i = 0; i < 8; i++) {
            digit = num >> (4 * i) & 0xf;
            hex = hex.insert(0,hexMap[digit]);
        }

        // remove leading zeros
        int zeroPt = 0;
        while(hex.charAt(zeroPt) == '0') {
            zeroPt++;
        }
        hex = hex.delete(0,zeroPt);

        return hex.toString();
    }
}
