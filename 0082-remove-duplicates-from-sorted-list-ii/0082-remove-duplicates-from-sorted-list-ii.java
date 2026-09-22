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
        ListNode dummy=new ListNode(0,head);
        ListNode pre=dummy;
        ListNode curr=head;

        while(curr!=null){
            ListNode temp=null;
            if(curr.next!=null && curr.next.val==curr.val){
                while(curr.next!=null && curr.next.val==curr.val){
                    temp=curr;
                    curr=curr.next;
                    temp.next=null;
                }
                pre.next=curr.next;
                temp.next=null;
            }
            else{
                pre=pre.next;
            }
            curr=curr.next;
        }
        head=dummy.next;
        dummy.next=null;
        return head;
    }
    
}