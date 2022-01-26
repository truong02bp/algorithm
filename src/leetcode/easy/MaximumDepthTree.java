package leetcode.easy;

public class MaximumDepthTree {

    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    public static Integer max = 0;

    public static int maxDepth(TreeNode root) {
        max = 0;
        move(root, 1);
        return max;
    }


    public static void move(TreeNode root, Integer h) {
        if (root == null)
            return;
        if (h > max)
            max = h;
        if (root.left != null) {
            move(root.left, h + 1);
        }
        if (root.right != null) {
            move(root.right, h + 1);
        }
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(2);
        root.left = new TreeNode(3);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.left = new TreeNode(5);
        System.out.println(maxDepth(root));
    }
}
