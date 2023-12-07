package leetcode.firstSolutions;

//  https://leetcode.com/problems/middle-of-the-linked-list/

public class MiddleOfTheLinkedList {
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

    public static void main(String[] args) {
        ListNode listNode = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5, null)))));
        System.out.println(middleNode(new ListNode(0, listNode)).val);
    }

    public static ListNode middleNode(ListNode head) {
        int length = 0;
        ListNode listNode = head;
        while (head.next != null) {
            length++;
            if (length % 2 == 1) listNode = listNode.next;
            head = head.next;
        }
        return listNode;
    }
}
