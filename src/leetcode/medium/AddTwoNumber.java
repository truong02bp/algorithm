package leetcode.medium;

import leetcode.dto.ListNode;

import java.math.BigInteger;

public class AddTwoNumber {

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        BigInteger value1 = read(l1);
        BigInteger value2 = read(l2);
        BigInteger result = value1.add(value2);
        ListNode root;
        String value = result.toString();
        System.out.println(value);
        int len = value.length() - 1;
        ListNode rs = new ListNode(value.charAt(len) - 48);
        root = rs;
        len -= 1;
        while (len > -1) {
            ListNode child = new ListNode(value.charAt(len) - 48);
            len--;
            rs.next = child;
            rs = rs.next;
        }
        return root;
    }

    public static BigInteger read(ListNode l) {
        StringBuilder result = new StringBuilder();
        ListNode next = l;
        while (next != null) {
            result.insert(0, next.val);
            next = next.next;
        }
        return new BigInteger(result.toString());
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
        while (node != null) {
            System.out.println(node.val);
            node = node.next;
        }
    }
}
