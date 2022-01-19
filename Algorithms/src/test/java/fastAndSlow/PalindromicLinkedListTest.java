package fastAndSlow;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class PalindromicLinkedListTest {

    @Test
    public void isPalindrome() {
        ListNode head = new ListNode(2);
        head.next = new ListNode(4);
        head.next.next = new ListNode(6);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(2);
        Assert.assertTrue(PalindromicLinkedList.isPalindrome(head));

        head.next.next.next.next.next = new ListNode(2);
        Assert.assertFalse(PalindromicLinkedList.isPalindrome(head));

        head = new ListNode(2);
        head.next = new ListNode(4);
        head.next.next = new ListNode(6);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(3);
        Assert.assertFalse(PalindromicLinkedList.isPalindrome(head));
    }
}