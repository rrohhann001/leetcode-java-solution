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
    public ListNode insertionSortList(ListNode head) {
        if(head==null || head.next==null){
            return head;
        }

        ListNode temp=head.next;
        ListNode sortedTail=head;

        while(temp!=null){
            // temp is already at sorted position ( insetion at the tail)
            if(temp.val>=sortedTail.val){
                sortedTail=temp;
                temp=temp.next;
                continue;
            }

            sortedTail.next=temp.next;
            ListNode t1=head;
            ListNode pre=null;
            while(t1!=sortedTail.next){
                if(t1.val>=temp.val){
                    break;
                }
                pre=t1;
                t1=t1.next;
            }
            if(pre==null){
                temp.next=head;
                head=temp;
            }
            else{
                temp.next=pre.next;
                pre.next=temp;
            }
            temp=sortedTail.next;
        }
        return head;
        
    }
}