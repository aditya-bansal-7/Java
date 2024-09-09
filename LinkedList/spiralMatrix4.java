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
    public int[][] spiralMatrix(int m, int n, ListNode head) {
        int[][] arr = new int[m][n];

        int top = 0, bottom = m - 1;
        int left = 0, right = n - 1;
       
       while (top <= bottom && left <= right) {
            for (int i = left; i <= right; i++) {
                    arr[top][i] = getVal(head);
                    if(head != null) head = head.next;
                }
                top++;
            for (int i = top; i <= bottom; i++) {
                arr[i][right] = getVal(head);
                if(head != null) head = head.next;
            }
                right--;
            if (top <= bottom) {
                for (int i = right; i >= left; i--) {
                    arr[bottom][i] = getVal(head);
                    if(head != null) head = head.next;
                }
                bottom--;
            }
            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    arr[i][left] = getVal(head);
                    if(head != null) head = head.next;
                }
                left++; 
            }
       }
       return arr;
    }
    int getVal(ListNode head){
        if (head == null) return -1;
        int val = head.val;
        return val;
    }
}
