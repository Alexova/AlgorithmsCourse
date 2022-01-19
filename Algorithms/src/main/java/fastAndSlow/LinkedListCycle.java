package fastAndSlow;

public class LinkedListCycle {

    public static boolean hasCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while(true){
            if(slow.next == null || fast.next == null || fast.next.next == null){
                return false;
            }
            slow = slow.next;
            fast = fast.next.next;
            if(fast.equals(slow)){
                return true;
            }
        }
    }
}
