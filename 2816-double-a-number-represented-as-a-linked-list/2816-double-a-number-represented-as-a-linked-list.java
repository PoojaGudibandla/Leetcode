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
    public ListNode doubleIt(ListNode head) {
        if(head == null)
            return head;
        ListNode cur = head;
        while(cur != null){
            int newVal = cur.val*2;
            if(newVal >= 10){
                cur.val=newVal%10;
                if(cur == head){
                    ListNode newNode = new ListNode(1);
                    head = newNode;
                    head.next = cur;
                }
            }
            else{
                cur.val = newVal;
            }
            if(cur.next != null && cur.next.val >= 5){
                cur.val += 1;
            }
            
            cur = cur.next;
        }
        return head;
    }
}