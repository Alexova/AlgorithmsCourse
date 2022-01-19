package fastAndSlow;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class LinkedListCycleStartTest {

    @Test
    public void findCycleStart() {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        head.next.next.next.next.next = new ListNode(6);
//
//        head.next.next.next.next.next.next = head.next.next;
//        Assert.assertEquals(3, LinkedListCycleStart.findCycleStart(head).value);
//
//        head.next.next.next.next.next.next = head.next.next.next;
//        Assert.assertEquals(4,  LinkedListCycleStart.findCycleStart(head).value);

        head.next.next.next.next.next.next = head;
        Assert.assertEquals(1, LinkedListCycleStart.findCycleStart(head).value);

    }
}