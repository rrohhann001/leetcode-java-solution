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
    public ListNode oddEvenList(ListNode head) {
        if(head==null){
            return head;
        }
        ListNode oddFast=head;
        ListNode evenFast=head.next;
        ListNode temp=evenFast;
        while(evenFast!=null && evenFast.next!=null){
            
            oddFast.next=oddFast.next.next;
            oddFast=oddFast.next;

            evenFast.next=evenFast.next.next;
            evenFast=evenFast.next;
        }
        oddFast.next=temp;

        return head;

    }
}