// Given an array of n integers where n > 1, nums, return an array output such that output[i] is equal to the product of all the elements of nums except nums[i].
//
// Solve it without division and in O(n).
//
// For example, given [1,2,3,4], return [24,12,8,6].

public class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] result = new int[nums.length];
        int q = 1;
        result[0] = 1;

        for (int i = 0; i < nums.length - 1; i++) {
            q *= nums[i];
            result[i + 1] = q;
        }

        q = 1;
        for (int j = nums.length - 1; j >= 1; j--) {
            q *= nums[j];
            result[j - 1] = q * result[j - 1];
        }

        return result;
    }
}
