package leetcode.medium;

import leetcode.dto.ListNode;

public class AddTwoNumber {

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        long value1 = read(l1);
        long value2 = read(l2);
        long result = value1 + value2;
        ListNode root;
        ListNode rs = new ListNode((int) (result%10));
        root = rs;
        result/=10;
        while (result > 0) {
            ListNode child = new ListNode((int) (result%10));
            result/=10;
            rs.next = child;
            rs = rs.next;
        }
        return root;
    }

    public static long read(ListNode l) {
        String result = "";
        ListNode next = l;
        while (next != null) {
            result = next.val + result;
            next = next.next;
        }
        return Long.parseLong(result);
    }

    public static void main(String[] args) {
        ListNode l1 = new ListNode(9);
        ListNode l2 = new ListNode(1);
        ListNode root = l2;
        l2.next = new ListNode(9);
        l2 = l2.next;
        l2.next = new ListNode(9);
        l2 = l2.next;
        l2.next = new ListNode(9);
        l2 = l2.next;
        l2.next = new ListNode(9);
        l2 = l2.next;
        l2.next = new ListNode(9);
        l2 = l2.next;
        l2.next = new ListNode(9);
        l2 = l2.next;
        l2.next = new ListNode(9);
        l2 = l2.next;
        l2.next = new ListNode(9);
        l2 = l2.next;
        l2.next = new ListNode(9);
        l2 = l2.next;
        ListNode node = addTwoNumbers(l1, root);
//        while (node != null) {
//            System.out.println(node.val);
////            node = node.next;
//        }
    }
}
