package leetcode.medium;

import leetcode.dto.ListNode;

public class RemoveNthNodeFromEndOfList {
    public static ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode left = head;
        ListNode right = head;
        int len = 0;
        while (right != null) {
            len++;
            right = right.next;
        }
        int index = len - n;
        if (index == 0)
            return left.next;
        for (int i = 0; i < len; i++) {
            if (i == index - 1) {
                left.next = left.next.next;
                break;
            } else {
                left = left.next;
            }
        }
        return head;
    }

    private static void print(ListNode node) {
        System.out.println("---");
        while (node != null) {
            System.out.println(node.val);
            node = node.next;
        }
    }

    public static void main(String[] args) {
        ListNode listNode = new ListNode(1);
        listNode.next = new ListNode(2);
        listNode.next.next = new ListNode(3);
        listNode.next.next.next = new ListNode(4);
        listNode.next.next.next.next = new ListNode(5);
        System.out.println(removeNthFromEnd(listNode, 2));
    }
}
