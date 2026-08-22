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
        if(head==null){
            return head;
        }
        ListNode pre=head;
        ListNode temp=pre.next;

        while(temp!=null){
            if(pre.val==temp.val){
                pre.next=temp.next;
                temp.next=null;
                temp=pre.next;
                
                
            }
            else{
                pre=pre.next;
                temp=temp.next;
            }
        }
        return head;
        
    }
}