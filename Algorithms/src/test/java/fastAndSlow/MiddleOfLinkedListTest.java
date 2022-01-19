package fastAndSlow;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class MiddleOfLinkedListTest {

    @Test
    public void findMiddle() {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        Assert.assertEquals(3,  MiddleOfLinkedList.findMiddle(head).value);

        head.next.next.next.next.next = new ListNode(6);
        Assert.assertEquals(4,  MiddleOfLinkedList.findMiddle(head).value);

        head.next.next.next.next.next.next = new ListNode(7);
        Assert.assertEquals(4,  MiddleOfLinkedList.findMiddle(head).value);
    }
}