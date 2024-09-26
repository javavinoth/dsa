package vinoth.dsa.tree.binarytree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class RecursiveTraversal {


    //LDR
    public static void inOrder(TreeNode treeNode, List<Integer> preorder) {
        if (treeNode == null) {
            return;
        }
        preOrder(treeNode.left, preorder);
        preorder.add(treeNode.val);
        preOrder(treeNode.right, preorder);
    }

    //DLR
    public static void preOrder(TreeNode treeNode, List<Integer> preorder) {
        if (treeNode == null) {
            return;
        }
        preorder.add(treeNode.val);
        preOrder(treeNode.left, preorder);
        preOrder(treeNode.right, preorder);
    }

    //LRD
    public static void postOrder(TreeNode treeNode, List<Integer> postOrder) {
        if (treeNode == null) {
            return;
        }
        postOrder(treeNode.left, postOrder);
        postOrder(treeNode.right, postOrder);
        postOrder.add(treeNode.val);
    }

    public static void main(String[] args) {
        Queue<Integer> q=new LinkedList<>();
        TreeNode left = new TreeNode(20);
        TreeNode right = new TreeNode(30);
        TreeNode treeNode = new TreeNode(10, left, right);
        ArrayList<Integer> inOrder = new ArrayList<>();
        ArrayList<Integer> preOrder = new ArrayList<>();
        ArrayList<Integer> postOrder = new ArrayList<>();
        inOrder(treeNode, inOrder);
        preOrder(treeNode, preOrder);
        postOrder(treeNode, postOrder);
        System.out.println("InOrder");
        inOrder.forEach(System.out::print);
        System.out.println();
        System.out.println("PreOrder");
        preOrder.forEach(System.out::print);
        System.out.println();
        System.out.println("PostOrder");
        postOrder.forEach(System.out::print);
    }
}
