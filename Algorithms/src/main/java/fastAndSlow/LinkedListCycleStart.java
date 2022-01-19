package fastAndSlow;

public class LinkedListCycleStart {

    public static ListNode findCycleStart(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        do {
            slow = slow.next;
            fast = fast.next.next;
        } while (slow != fast);
        int cycleLength = LinkedListCycleLength.findCycleLength(slow);

        return findStart(head, cycleLength);
    }

    private static ListNode findStart(ListNode head, int cycleLength) {
        ListNode p1 = head;
        ListNode p2 = head;
        while (cycleLength > 0) {
            p2 = p2.next;
            cycleLength--;
        }
        while (p1 != p2) {
            p1 = p1.next;
            p2 = p2.next;
        }
        return p1;
    }
}
