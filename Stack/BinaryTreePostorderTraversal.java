/*LeetCode link:- https://leetcode.com/problems/binary-tree-postorder-traversal/ */

package Stack;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class BinaryTreePostorderTraversal {

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

    public static List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        if (root == null) {
            return result;
        }

        Stack<TreeNode> stack1 = new Stack<>();
        Stack<TreeNode> stack2 = new Stack<>();
        stack1.push(root);

        while (!stack1.isEmpty()) {
            TreeNode node = stack1.pop();
            stack2.push(node);

            if (node.left != null) {
                stack1.push(node.left);
            }
            if (node.right != null) {
                stack1.push(node.right);
            }
        }

        while (!stack2.isEmpty()) {
            result.add(stack2.pop().val);
        }

        return result;
    }

    public static void main(String[] args) {
        // Example 1: root = [1,null,2,3]
        TreeNode root1 = new TreeNode(1);
        root1.right = new TreeNode(2);
        root1.right.left = new TreeNode(3);
        System.out.println("Example 1: " + postorderTraversal(root1)); // Output: [3, 2, 1]

        // Example 2: root = []
        TreeNode root2 = null;
        System.out.println("Example 2: " + postorderTraversal(root2)); // Output: []

        // Example 3: root = [1]
        TreeNode root3 = new TreeNode(1);
        System.out.println("Example 3: " + postorderTraversal(root3)); // Output: [1]
    }
}
