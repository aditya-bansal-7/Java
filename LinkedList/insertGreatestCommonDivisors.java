package LinkedList;

/**
 * insertGreatestCommonDivisors
 */
public class insertGreatestCommonDivisors {

    public ListNode insertGreatestCommonDivisors(ListNode head) {
        


        ListNode prev = head;
        ListNode cur = head.next;


        while(cur != null){
            int gVal = GetGCD(Math.max(prev.val,cur.val), Math.min(prev.val,cur.val));
            
            ListNode newNode = new ListNode(gVal);

            newNode.next = cur;
            prev.next = newNode;

            prev = cur;
            cur = cur.next;
        }
        return head;
    }

    int GetGCD(int l , int s){
        if(l % s == 0) return s;
        return GetGCD(s, l % s);
    }
}