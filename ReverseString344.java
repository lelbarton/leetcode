//Write a function that takes a string as input and returns the string reversed.

public class Solution {

    public String reverseString(String s) {
        char[] arr = s.toCharArray();
        int j = s.length() - 1;
        // traverse array from each end, swapping letters
        for (int i = 0; i < s.length() / 2; i++) {
            char temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            j--;
        }
        // convert char[] back to String
        return new String(arr);
    }

}
