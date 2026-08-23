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
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null||head.next==null){
            return head;
        }
        int size=0;
        ListNode temp=head;
        while(temp!=null){
            temp=temp.next;
            size++;
        }

        int rotate=k%size;
        ListNode t1=head;
        ListNode first=head;
        ListNode second=head;
        while(second.next!=null){
            if(rotate<=0){
                first=first.next;
            }
            second=second.next;
            rotate--;
        }
        second.next=head;
        head=first.next;
        first.next=null;
        return head;
        
    }
}