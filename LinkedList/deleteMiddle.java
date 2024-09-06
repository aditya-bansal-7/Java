
public class deleteMiddle {
    public ListNode deleteMiddleNode(ListNode head) {
        if(head.next == null) return null;

        ListNode fast = head.next;
        if (fast != null) {
                fast = fast.next;
        }
        ListNode slow = head;

        while (fast != null) {

            if (slow == null) return null;

            fast = fast.next;
            if (fast != null) {
                fast = fast.next;
                slow = slow.next;
            }

        }

        
        slow.next = slow.next.next;

        return head;
    }
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        deleteMiddle(ll.head);
    }
}
