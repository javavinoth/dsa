package vinoth.dsa.tree.binarytree;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class StackTraversal {
    public static int[] inorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        TreeNode current = root;

        while (current != null || !stack.isEmpty()) {
            // Traverse to the leftmost node
            while (current != null) {
                stack.push(current);
                current = current.left;
            }

            // Current must be null at this point, so pop from the stack
            current = stack.pop();
            result.add(current.val);  // Add the node value to the result

            // Visit the right subtree
            current = current.right;
        }

        return result.stream().mapToInt(i -> i).toArray();  // Convert List<Integer> to int[]
    }

    public static int[] preorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        TreeNode current = root;

        while (current != null || !stack.isEmpty()) {
            // Traverse to the leftmost node
            while (current != null) {
                result.add(current.val);
                stack.push(current);
                current = current.left;
            }

            // Current must be null at this point, so pop from the stack
            current = stack.pop();
            // Add the node value to the result

            // Visit the right subtree
            current = current.right;
        }

        return result.stream().mapToInt(i -> i).toArray();  // Convert List<Integer> to int[]
    }

    public static int[] postOrderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        TreeNode current = root;
        TreeNode lastVisited = null;

        while (current != null || !stack.isEmpty()) {
            // Reach the leftmost node
            while (current != null) {
                stack.push(current);
                current = current.left;
            }

            // Peek the node on top of the stack
            TreeNode peekNode = stack.peek();

            // Check if the right subtree has been visited or there is no right child
            if (peekNode.right != null && lastVisited != peekNode.right) {
                // If the right child exists and hasn't been visited, go right
                current = peekNode.right;
            } else {
                // Visit the node
                result.add(peekNode.val);
                lastVisited = stack.pop();  // Mark this node as visited
            }
        }

        // Convert the result list to an array and return
        return result.stream().mapToInt(i -> i).toArray();
    }

    public static void main(String[] args) {
        TreeNode left = new TreeNode(20);
        TreeNode right = new TreeNode(30);
        TreeNode treeNode = new TreeNode(10, left, right);
        System.out.println("InOrder");
        Arrays.stream(inorderTraversal(treeNode)).boxed().forEach(System.out::print);
        System.out.println();
        System.out.println("PreOrder");
        Arrays.stream(preorderTraversal(treeNode)).boxed().forEach(System.out::print);
        System.out.println();
        System.out.println("PostOrder");
        Arrays.stream(postOrderTraversal(treeNode)).boxed().forEach(System.out::print);
    }
}
