class Solution {
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if (head == null || left == right) {
            return head;
        }

        ListNode prev = null;
        ListNode cur = head;

        for (int i = 1; i < left; i++) {
            prev = cur;
            cur = cur.next;
        }

        ListNode lastNodeOfFirstPart = prev;  
        ListNode lastNodeOfSublist = cur;    
        ListNode next = null;                

        for (int i = 0; i < right - left + 1; i++) {
            next = cur.next;
            cur.next = prev;
            prev = cur;
            cur = next;
        }

        if (lastNodeOfFirstPart != null) {
            lastNodeOfFirstPart.next = prev;
        } else {
            head = prev;
        }

        lastNodeOfSublist.next = cur;

        return head;
    }
}
