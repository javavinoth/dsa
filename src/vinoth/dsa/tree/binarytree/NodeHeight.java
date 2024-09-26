package vinoth.dsa.tree.binarytree;

/*
https://leetcode.com/problems/maximum-depth-of-binary-tree/
 */
public class NodeHeight {
    public static int height(TreeNode treeNode) {
        if (treeNode == null) {
            return 0;
        }
        int left = height(treeNode.left);
        int right = height(treeNode.right);
        return 1 + Math.max(left, right);
    }

    public static void main(String[] args) {
        TreeNode left = new TreeNode(20);
        TreeNode right = new TreeNode(30);
        TreeNode treeNode = new TreeNode(10, left, right);
        System.out.println("Height: " + height(treeNode));
    }
}
