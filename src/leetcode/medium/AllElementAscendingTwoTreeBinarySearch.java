package leetcode.medium;

import leetcode.dto.TreeNode;
import leetcode.easy.MaximumDepthTree;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

public class AllElementAscendingTwoTreeBinarySearch {

    public static List<Integer> getAllElements(TreeNode root1, TreeNode root2) {
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        add(queue, root1);
        add(queue, root2);
        List<Integer> result = new ArrayList<>();
        while (!queue.isEmpty()) {
            result.add(queue.poll());
        }
        return result;
    }

    public static void add(PriorityQueue<Integer> queue, TreeNode treeNode) {
        if (treeNode == null)
            return;
        queue.add(treeNode.val);
        add(queue, treeNode.left);
        add(queue, treeNode.right);
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(2);
        root.left = new TreeNode(3);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.left = new TreeNode(5);
        TreeNode root2 = new TreeNode(10);
        root2.left = new TreeNode(1);
        root2.right = new TreeNode(2);
        root2.left.left = new TreeNode(4);
        root2.left.right = new TreeNode(3);
        root2.right.left = new TreeNode(5);
        System.out.println(getAllElements(root, root2));
    }
}
