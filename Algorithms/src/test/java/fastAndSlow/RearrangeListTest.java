package fastAndSlow;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class RearrangeListTest {

    @Test
    public void reorder() {
        ListNode head = new ListNode(2);
        head.next = new ListNode(4);
        head.next.next = new ListNode(6);
        head.next.next.next = new ListNode(8);
        head.next.next.next.next = new ListNode(10);
        head.next.next.next.next.next = new ListNode(12);
        RearrangeList.reorder(head);

        Assert.assertEquals("2 12 4 10 6 8 ", listNodeToString(head));

    }

    private String listNodeToString(ListNode node){
        StringBuilder builder = new StringBuilder();
        while (node != null) {
            builder.append(node.value + " ");
            node = node.next;
        }
        return builder.toString();
    }
}