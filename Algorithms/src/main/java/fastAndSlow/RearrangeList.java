package fastAndSlow;

public class RearrangeList {

    public static void reorder(ListNode head) {
        ListNode middle = MiddleOfLinkedList.findMiddle(head);

        ListNode p1 = head;
        ListNode p2 = ReverseListUtil.reverse(middle, null);

        while(p2 != null && p2.next != null){
            ListNode nextP1 = p1.next;
            ListNode nextP2 = p2.next;
            p1.next = p2;
            p1.next.next = nextP1;
            p1 = nextP1;
            p2 = nextP2;
        }

    }
}
