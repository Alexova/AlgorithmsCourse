package fastAndSlow;

public class PalindromicLinkedList {
    public static boolean isPalindrome(ListNode head) {
        if(head == null || head.next == null){
            throw new IllegalArgumentException();
        }
        boolean result = true;
        ListNode middle = MiddleOfLinkedList.findMiddle(head);
        ListNode prevNode = ReverseListUtil.reverse(head, middle);

        ListNode p1 = prevNode;
        ListNode p2 = middle;
        if(p1.value != p2.value){
            p2 = p2.next;
        }
        while(p2 != null){
            if(p1.value != p2.value){
                result = false;
                break;
            } else {
                p1 = p1.next;
                p2 = p2.next;
            }
        }

        ReverseListUtil.reverse(prevNode, middle);
        return result;

    }






}
