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
    public ListNode swapPairs(ListNode head) {
        if(head==null || head.next==null){
            return head;
        }
        ListNode first=head;
        ListNode pre=null;
        while(first!=null && first.next!=null){
           ListNode second=first.next;
           first.next=second.next;
           second.next=first;
           //first swap/ swapping head node
           if(pre==null){
            head=second;
           }else{
            pre.next=second;
           }
           pre=first;
           first=first.next;
           
        }

        return head;        
    }
}