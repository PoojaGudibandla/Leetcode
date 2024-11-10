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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(n == 0){
            return head;
        }
        else{
        ListNode revList = reverseList(head);
        ListNode temp = revList;
        ListNode prev = null;
        if(temp == null)
            return reverseList(revList);
        if(n == 1){
            revList = temp.next;
            return reverseList(revList);
        }
            for(int i=1; temp!= null && i<n;i++){
                prev = temp;
                temp = temp.next;
            }
             if (temp != null) {
            prev.next = temp.next;
        }
        return reverseList(revList);

}
        
    }
    public ListNode reverseList(ListNode head) {
        ListNode node= null;
        while(head!=null){
            ListNode temp = head.next;
            head.next = node;
            node= head;
            head= temp;
        }
        return node;
    }
}