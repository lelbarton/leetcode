// Find the sum of all left leaves in a given binary tree.

/**
* Definition for a binary tree node.
* public class TreeNode {
*     int val;
*     TreeNode left;
*     TreeNode right;
*     TreeNode(int x) { val = x; }
* }
*/
public class Solution {
    // Iterative solution
    public int sumOfLeftLeavesIterative(TreeNode root) {
        if (root == null) { return 0; }

        Stack<TreeNode> stack = new Stack<TreeNode>();
        stack.push(root);

        int sum = 0;

        while(!stack.empty()) {
            TreeNode node = stack.pop();
            if (node.left != null) {
                if (node.left.left == null && node.left.right == null) {
                    // left child is a leaf
                    sum += node.left.val;
                } else {
                    stack.push(node.left);
                }
            } if (node.right != null) {
                stack.push(node.right);
            }
        }

        return sum;
    }


    // Recursive solution
    public int sumOfLeftLeavesRecursive(TreeNode root) {
        if (root == null) { return 0; }
        int sum = 0;
        if (root.left != null) {
            if (root.left.left == null && root.left.right == null) {
                // left child is a leaf
                sum += root.left.val;
            } else {
                sum += sumOfLeftLeaves(root.left);
            }
        }
        sum += sumOfLeftLeaves(root.right);
        return sum;
    }
}
