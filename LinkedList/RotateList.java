public class RotateList {
    public ListNode rotateRight(ListNode head, int k) {
        if(head == null || k==0) return head;
        
        ListNode temp = head;

        int size = 0;

        while(temp != null){
            size++;
            temp = temp.next;
        }

        int index = size - (k%size);

        temp = head;

        for(int i = 1; i < index; i++){
            temp = temp.next;
        }

        
        ListNode dummyHead = new ListNode(0);
        ListNode current = dummyHead;
        ListNode prev = temp;
        
        while(temp != null){
            current.next = temp.next;
            temp = temp.next;
            if(temp != null) current = current.next;
        }
        prev.next = null;
        
        current.next = head;

        return dummyHead.next;
        
    }
}
