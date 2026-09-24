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
    public void reorderList(ListNode head) {
        
        ListNode slow=head;
        ListNode fast=head;

        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }

        
        //reverseing second half linked list
        ListNode pre=null;
        ListNode curr=slow;
        while(curr!=null){
            ListNode nextNode=curr.next;
            curr.next=pre;
            pre=curr;
            curr=nextNode;
        }


        //re-ordering linked list
        ListNode mainHead=head;
        ListNode reverseHead=pre;

        while(reverseHead.next!=null && mainHead.next!=reverseHead){
            ListNode nextMainNode=mainHead.next;
            ListNode nextReverseNode=reverseHead.next;

            mainHead.next=reverseHead;
            reverseHead.next=nextMainNode;

            mainHead=nextMainNode;
            reverseHead=nextReverseNode;

        }

        
    }
}