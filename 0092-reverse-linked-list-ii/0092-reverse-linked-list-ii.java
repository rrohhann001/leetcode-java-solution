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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if(head.next==null || left==right){
            return head;
        }
        ListNode preTail=null;
        ListNode currTail=head;
        left=left-1;
        right-=left;
        while(left>0){
            preTail=currTail;
            currTail=currTail.next;
            left--;
        }

        ListNode curr=currTail;
        ListNode pre=null;
        while(right>0){
            ListNode nextNode=curr.next;
            curr.next=pre;
            pre=curr;
            curr=nextNode;
            right--;
        }

        currTail.next=curr;
        if(preTail!=null){
            preTail.next=pre;
            return head; 
        }
        return pre;
        
    }
}