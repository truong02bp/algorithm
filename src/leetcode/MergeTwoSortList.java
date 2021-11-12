package leetcode;

public class MergeTwoSortList {
    public static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode sorted = new ListNode();
        ListNode result = sorted;
        while (l1 != null && l2 != null) {
            if (l1.val <= l2.val) {
                sorted.next = l1;
                l1 = l1.next;
            }
            else {
                sorted.next = l2;
                l2 = l2.next;
            }
            sorted = sorted.next;
        }
        while (l1 != null) {
            sorted.next = l1;
            l1 = l1.next;
            sorted = sorted.next;
        }

        while (l2 != null) {
            sorted.next = l2;
            l2 = l2.next;
            sorted = sorted.next;
        }
        return result.next;
    }

    public static void main(String[] args) {
        Integer a = 3;
        Integer b = a;
        Integer c = 9;

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}
