/*LeetCode link:- https://leetcode.com/problems/binary-tree-inorder-traversal/ */

package Stack;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class BinaryTreeInorderTraversal {

    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {}

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    public static List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        TreeNode curr = root;

        while (curr != null || !stack.isEmpty()) {
            while (curr != null) {
                stack.push(curr);
                curr = curr.left;
            }
            curr = stack.pop();
            result.add(curr.val);
            curr = curr.right;
        }

        return result;
    }

    public static void main(String[] args) {
        // Example 1: root = [1,null,2,3]
        TreeNode root1 = new TreeNode(1);
        root1.right = new TreeNode(2);
        root1.right.left = new TreeNode(3);
        System.out.println("Example 1: " + inorderTraversal(root1)); // Output: [1, 3, 2]

        // Example 2: root = []
        TreeNode root2 = null;
        System.out.println("Example 2: " + inorderTraversal(root2)); // Output: []

        // Example 3: root = [1]
        TreeNode root3 = new TreeNode(1);
        System.out.println("Example 3: " + inorderTraversal(root3)); // Output: [1]
    }
}