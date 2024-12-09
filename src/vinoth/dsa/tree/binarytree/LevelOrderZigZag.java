package vinoth.dsa.tree.binarytree;

import java.util.*;

/*
https://leetcode.com/problems/binary-tree-zigzag-level-order-traversal/description/
 */
public class LevelOrderZigZag {

    private static List<List<Integer>> zigzag(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        if (root == null) return result;

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            int size = queue.size();
            List<Integer> current = new ArrayList<>();
            for (int i = 0; i < size; i++) {
                TreeNode treeNode = queue.poll();
                current.add(treeNode.val);
                if (treeNode.left != null) {
                    queue.offer(treeNode.left);
                }
                if (treeNode.right != null) {
                    queue.offer(treeNode.right);
                }
            }
            result.add(current);
        }
        for (int i = 1; i < result.size(); i = i + 2) {
            Collections.reverse(result.get(i));
        }
        return result;
    }

    public static void main(String[] args) {
// Example usage:
        // Construct a binary tree:
        //        3
        //       / \
        //      9   20
        //         /  \
        //        15   7
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);

        List<List<Integer>> result = zigzag(root);

        // Print level order traversal result
        System.out.println(result); // Output: [[3], [20, 9], [15, 7]]
    }
}
