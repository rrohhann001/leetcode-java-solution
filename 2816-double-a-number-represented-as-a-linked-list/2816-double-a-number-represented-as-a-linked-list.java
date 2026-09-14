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
    private ListNode reverse(ListNode head){
        ListNode pre=null;
        ListNode current=head;
        while(current!=null){
            ListNode nextNode=current.next;
            current.next=pre;
            pre=current;
            current=nextNode;
        }
        return pre;
    }
    public ListNode doubleIt(ListNode head) {
        head=reverse(head);
        ListNode temp=head;
        int carry=0;
        while(temp!=null){
            int digit=temp.val*2+carry;
            carry=digit/10;
            digit=digit%10;
            temp.val=digit;
            temp=temp.next;
        }
        head=reverse(head);
        if(carry!=0){
            ListNode newNode=new ListNode(carry,head);
            head=newNode;
        }
        return head;
        
        
    }
}