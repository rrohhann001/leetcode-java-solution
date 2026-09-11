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
    public ListNode swapNodes(ListNode head, int k) {
        ListNode temp=head;
        ListNode first=null;
        while(k>0){
            first=temp;
            temp=temp.next;
            k--;
        }
        ListNode second=head;
        while(temp!=null){
            second=second.next;
            temp=temp.next;
        }
        int t=first.val;
        first.val=second.val;
        second.val=t;

        
        return head;
    }
}