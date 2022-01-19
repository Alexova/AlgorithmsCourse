package fastAndSlow;

public class LinkedListCycleLength {

    /**
     * A list with a cycle is passed. Return cycle length
     * @param head
     * @return
     */
    public static int findCycleLength(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while(true){
            if(slow.next == null || fast.next == null || fast.next.next == null){
                return 0;
            }
            slow = slow.next;
            fast = fast.next.next;
            if(fast.equals(slow)){
                return countNodeLength(slow);
            }
        }
    }

    public static int countNodeLength(ListNode slow) {
        ListNode current = slow;
        int count = 0;

        do{
            slow = slow.next;
            count++;
        } while (slow != current);
        return count;
    }
}
