package vinoth.dsa.linkedlist;

/**
 * https://leetcode.com/problems/maximum-twin-sum-of-a-linked-list
 */
public class PairSum {
    public static ListNode reverseList(ListNode head) {
        ListNode current = head;
        ListNode previous = null;
        while (current != null) {
            ListNode temp = current.next;
            current.next = previous;
            previous = current;
            current = temp;
        }

        return previous;
    }

    public static int pairSum(ListNode head) {
        if (head == null || head.next == null) return 0;
        ListNode slow = head;
        ListNode fast = head.next;
        if (fast.next == null) return slow.val + fast.val;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        if (slow.next != null) {
            fast = reverseList(slow.next);
        }
        int max = 0;
        while (head != slow.next && fast != null) {
            max = Math.max(max, head.val + fast.val);
            head = head.next;
            fast = fast.next;
        }
        return max;
    }

    public static void main(String[] args) {
        ListNode l1 = new ListNode(1);
        ListNode l2 = new ListNode(2);
        ListNode l3 = new ListNode(3);
        ListNode l4 = new ListNode(4);
        ListNode l5 = new ListNode(5);
        l1.next = l2;
        l2.next = l3;
        l3.next = l4;
        l4.next = l5;
        pairSum(l1);
    }
}
