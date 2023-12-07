package leetcode.firstSolutions;

//  https://leetcode.com/problems/reverse-linked-list/

public class ReverseLinkedList {
    public class ListNode {
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

    public ListNode reverseList(ListNode head) {
        if (head == null || head.next == null) return head;
        ListNode dump = null;
        while (head != null) {
            ListNode temp = head.next;
            head.next = dump;
            dump = head;
            head = temp;
        }
        return dump;
    }
}
