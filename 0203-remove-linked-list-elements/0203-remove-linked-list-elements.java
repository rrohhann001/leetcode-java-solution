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
    public ListNode removeElements(ListNode head, int val) {
        if(head==null){
            return head;
        }

        ListNode dummy=new ListNode(0,head);
        ListNode ans=dummy;

        while(ans.next!=null){
            if(ans.next.val==val){
                ans.next=ans.next.next;
            }else{
                ans=ans.next;
            }
            
        }

        return dummy.next ;
    }
}