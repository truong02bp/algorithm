package leetcode.easy;

import java.util.ArrayList;
import java.util.List;

public class TreeInorderTraversals {


    public static class TreeNode {
        Integer val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(Integer val) {
            this.val = val;
        }

        TreeNode(Integer val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }


    public static List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> values = new ArrayList<>();
        traversal(root,values);
        return values;
    }

    public static void traversal(TreeNode root, List<Integer> values) {
        if (root == null)
            return;
        traversal(root.left, values);
        values.add(root.val);
        traversal(root.right, values);
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = null;
        TreeNode root2 = new TreeNode(2);
        root2.left = new TreeNode(3);
        root2.right = null;
        root.right = root2;
        System.out.println(inorderTraversal(root));
    }
}
