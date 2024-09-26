package vinoth.dsa.tree.binarytree;

public class NodeSum {
    public static int nodeSum(TreeNode treeNode) {
        if (treeNode == null) {
            return 0;
        }
        int left = nodeSum(treeNode.left);
        int right = nodeSum(treeNode.right);
        return left + right + treeNode.val;
    }

    public static void main(String[] args) {
        TreeNode left = new TreeNode(20);
        TreeNode right = new TreeNode(30);
        TreeNode treeNode = new TreeNode(10, left, right);
        System.out.println("sum: " + nodeSum(treeNode));
    }
}
