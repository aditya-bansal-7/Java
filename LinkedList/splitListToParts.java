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
    public ListNode[] splitListToParts(ListNode head, int k) {
        ListNode[] arr = new ListNode[k];

        ListNode temp = head;
        int size = 0;

        while(temp != null){
            temp = temp.next;
            size++;
        }

        int sizeOfEachNode = size / k;

        int remaningParts = size % k;

        temp = head ;
        ListNode prev = temp;

        for(int i = 0 ; i< k ; i++){
            ListNode newPart = temp;

            int currentSize = sizeOfEachNode;

            if(remaningParts > 0){
                remaningParts--;
                currentSize++;
            }

            int j = 0;

            while(j< currentSize){
                prev = temp;
                temp = temp.next;
                j++;
            }
            if(prev != null){
                prev.next = null;
            }

            arr[i] = newPart;
        }

        return arr;

    }
}
