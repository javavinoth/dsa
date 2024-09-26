package vinoth.dsa.tree.binarytree;

public class NodeCount {
    public static int nodeCount(TreeNode treeNode) {
        if (treeNode == null) {
            return 0;
        }
        int left = nodeCount(treeNode.left);
        int right = nodeCount(treeNode.right);
        return left + right + 1;
    }

    public static void main(String[] args) {
        TreeNode left = new TreeNode(20);
        TreeNode right = new TreeNode(30);
        TreeNode treeNode = new TreeNode(10, left, right);
        System.out.println("count: " + nodeCount(treeNode));
    }
}
