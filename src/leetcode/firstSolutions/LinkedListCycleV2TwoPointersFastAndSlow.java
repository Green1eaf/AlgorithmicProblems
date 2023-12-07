package leetcode.firstSolutions;

//  https://leetcode.com/problems/linked-list-cycle/

public class LinkedListCycleV2TwoPointersFastAndSlow {
    class ListNode {
        int val;
        LinkedListCycle.ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    public static boolean hasCycle(LinkedListCycle.ListNode head) {
        var slow = head;
        var fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) return true;
        }
        return false;
    }
}
