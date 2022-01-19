package fastAndSlow;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class LinkedListCycleTest {

    @Test
    public void hasCycle() {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        head.next.next.next.next.next = new ListNode(6);
        Assert.assertFalse(LinkedListCycle.hasCycle(head));

        head.next.next.next.next.next.next = head.next.next;
       Assert.assertTrue(LinkedListCycle.hasCycle(head));

        head.next.next.next.next.next.next = head.next.next.next;
        Assert.assertTrue(LinkedListCycle.hasCycle(head));
    }
}