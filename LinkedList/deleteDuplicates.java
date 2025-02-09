/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode deleteDuplicates(ListNode head) {

        if(head == null) return head;
        
        ListNode prev = null;
        ListNode cur = head;
        ListNode next = head.next;

        while(next != null){
            if(cur.val == next.val){
                while(next != null && cur.val == next.val){
                    cur = cur.next;
                    next = next.next;
                }
                // System.out.println(prev.val);
                
                if(prev == null) {
                    head = next;
                }else{
                    prev.next = next;
                }
            }else{
                if(prev == null) {
                    prev = head;
                }else{
                    prev = prev.next;
                }
            }
            cur = cur.next;
            if(next != null) next = next.next;
        }

        return head;
    }
}
