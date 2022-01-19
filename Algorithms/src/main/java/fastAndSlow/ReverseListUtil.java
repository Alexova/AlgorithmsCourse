package fastAndSlow;

public class ReverseListUtil {

    public static ListNode reverse(ListNode from, ListNode to){
        ListNode prevNode = from;
        while(from.next != to){
            ListNode nextNode = from.next;
            from.next = nextNode.next;
            nextNode.next = prevNode;
            prevNode = nextNode;
        }
        return prevNode;
    }
}
