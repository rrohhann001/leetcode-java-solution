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
    public int pairSum(ListNode head) {
        ListNode pre=null;
        ListNode curr=head;
        ListNode fast=head;

        while(fast!=null && fast.next!=null){
            pre=curr;
            curr=curr.next;
            fast=fast.next.next;
        }
        pre.next=null;
        pre=null;

        while(curr!=null){
            ListNode nextNode=curr.next;
            curr.next=pre;
            pre=curr;
            curr=nextNode;
        }

        curr=head;
        int max=0;
        while(curr!=pre){
            int sum=curr.val+pre.val;
            if(sum>max){
                max=sum;
            }
            curr=curr.next;
            pre=pre.next;
            
        }
        return max;
        
    }
}